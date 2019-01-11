package Person;

public class Login {


    public boolean login(person person,String name, String password) {
        boolean flag = true;
        if (name.equals(person.getName()) && password.equals(person.getPassword())) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

}
