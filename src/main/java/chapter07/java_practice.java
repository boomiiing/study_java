package chapter07;

public class java_practice {
        public static void main(String[] args) {
//            类名：Person
//            私有成员变量：姓名name，年龄age
//            提供无参构造、有参构造（name, age）
//            get/set 方法
//            成员方法 show()：打印姓名和年龄
//            测试类：创建 2 个 Person 对象，调用 show
//            考察点：封装、构造方法、this、getter/setter

             class Person{
                private String name;
                private int age;
                public Person(String name, int age) {
                    setName(name);
                    setAge(age);
                }
                public Person(){

                };
                public String getName(){
                    return this.name;
                };
                public void setName(String name){
                     this.name = name;
                };
                 public int getAge(){
                     return this.age;
                 };
                 public void setAge(int age){
                     this.age = age;
                 };
                 public void show(){
                     System.out.println("姓名："+this.getName()+"年龄："+this.getAge());
                 }
            }

            Person person = new Person("lisi", 18);
             Person person1 = new Person();
             person.show();
             person1.show();
    }
}
