package chapter05;

public class Java_class {
    public static void main(String[] args) {
        Student ming = new Student();
        ming.name = "小明";
        ming.age = 18;
        ming.say();
    }
}

class Student {
    String name;
    int age;
    void say() {
        System.out.println("我是"+name+"今年"+age+"岁！");
    }
}