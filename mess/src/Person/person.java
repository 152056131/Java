package Person;

public class person {
    private String name;
    private String password;
    private double price;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public person() {
    }
    public void show(person person){
        System.out.println("姓名："+person.getName());
        System.out.println("余额："+person.getPrice());
    }
}
