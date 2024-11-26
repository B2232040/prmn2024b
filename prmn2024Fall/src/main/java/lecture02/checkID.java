package lecture02;

public class checkID {
    String[][] idList = {{"B2001000", "qwerty"},
                        {"B2001001", "asdfgh"},
                        {"B2001002", "zxcvbn"},
                        {"B2001003", "123456"},
                        {"B2001004", "654321"},
                        {"B2001005", "567890"}};

    public void checkGakuseki(String inputID){
        for(int i=0 ; i < idList.length;i++){
            if(idList[i][0].equals(inputID)){
//                System.out.println(idList[i][1]);
                return;
            }
        }
        System.out.println("error!!");
        System.exit(0);
    }

    public void checkPWD(String ID, String inputPWD){
        for(int i=0 ; i < idList.length;i++){
            if(idList[i][0].equals(ID)){
                if(idList[i][1].equals(inputPWD)){
                    System.out.println("ログイン完了");
                    System.exit(0);
                }else{
                    System.out.println("不正なアクセス");
                    System.exit(0);
                }
            }
        }

    }
}
