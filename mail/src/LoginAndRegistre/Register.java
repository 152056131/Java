package LoginAndRegistre;

import javax.xml.transform.Source;

public class Register {
    private String username;
    private String password;

    public Register(String username, String password) {
        this.username = username;
        this.password = password;
    }



    public boolean register(String account[][]) {
        /*判断是否注册成功*/
        boolean flag = false;
        /*判断用户名是否重复*/

        for (int i = 0; i <= account.length - 1; i++) {
            /*进行注册过程*/
            if (account[i][0] == null) {
                account[i][0] = username;
                account[i][1] = password;
                flag = true;
                break;
            }
            /*对注册人数进行判断*/
            if (account[i][0] != null && i == account.length - 1) {
                System.out.print("注册人数已满,");
                flag = false;
            }

        }


        return flag;
    }
}
