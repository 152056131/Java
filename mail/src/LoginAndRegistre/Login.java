package LoginAndRegistre;

public class Login {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String username, String password ,String[][] account) {
        boolean flag = false;
        for(int i = 0;i<=account.length-1;i++){
            if((username.equals(account[i][0]))&&(password.equals(account[i][1]))){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
