package chapter07;

public class java_practice3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.watchHome();
    }
}
//父类 Animal：属性 name；方法 eat() 打印 “动物吃东西”
//子类 Dog 继承 Animal
//重写 eat ()：打印 “狗啃骨头”
//新增方法 watchHome()：打印 “狗看家”
//测试：创建 Dog 对象，调用 eat ()、watchHome ()
//考察点：继承、方法重写

class Animal{
    String name;
    public void eat(){
        System.out.println("动物吃东西");
    }
};
class Dog extends Animal{
    public void eat(){
        System.out.println("狗啃骨头");
    }
    public void watchHome(){
        System.out.println("狗看家");
    }
}