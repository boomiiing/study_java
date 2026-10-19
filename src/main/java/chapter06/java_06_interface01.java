package chapter06;

public class java_06_interface01 {
    public static void main(String[] args) {
//        接口 Speak：抽象方法 speak()
//        接口 Run：抽象方法 run()
//        类 Person 同时实现两个接口，重写两个抽象方法
//        speak：打印人会说话
//        run：打印人会跑步
//        测试类创建 Person 对象调用两个方法

        interface Speak{
            void speak();
        }
        interface run{
            void run();
        }
        class Person implements Speak,run{
            public void run(){
                System.out.println("人会跑步");
            }
            public void speak(){
                System.out.println("人会说话");
            }
        }
        Person person = new Person();
        person.speak();
        person.run();
    }
}
