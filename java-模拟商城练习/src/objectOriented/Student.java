package objectOriented;

public class Student {
    String name;
    String id;
    String sex = "男";
    int age = 18;
    public void show(String name,String id,String sex,int age){
        System.out.println("姓名：" + name+"   "+"学号："+id+"    "+"性别"+sex+"    "+"年龄"+age);
    }
    public void show(String name,String id){
        System.out.println("姓名：" + name+"   "+"学号："+id+"    "+"性别:"+sex+"    "+"年龄:"+age);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "杨顺凯";
        student.id = "152056131";
        student.show(student.name,student.id);
        student.name = "张";
        student.id = "152056131";
        student.show(student.name,student.id);
    }
}
