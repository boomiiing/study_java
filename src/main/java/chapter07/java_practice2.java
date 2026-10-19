package chapter07;

public class java_practice2 {
    public static void main(String[] args) {
//        需求：定义 Student 类，属性 name。
//        有参构造 public Student(String name)，使用 this 区分成员变量和局部变量
//        方法 sayHello()：打印 我是xxx
//        测试：new Student ("张三")，调用 sayHello
//        考察点：this 引用当前对象
        Student student =new Student("张三");
        student.sayHello();
    }
}

class  Student{
    String name;
    public Student(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("我是"+this.name);
    }
};