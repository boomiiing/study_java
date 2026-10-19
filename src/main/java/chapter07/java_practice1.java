package chapter07;

public class java_practice1 {
    public static void main(String[] args) {
//        属性：品牌 brand，价格 price
//        方法：call() 输出 “手机正在打电话”；sendMessage() 输出 “手机发送短信”
//        无参构造，有参构造给属性赋值
//        main 方法创建手机对象，调用两个方法
//        考察点：成员变量、成员方法、对象创建属性：品牌 brand，价格 price
//        方法：call() 输出 “手机正在打电话”；sendMessage() 输出 “手机发送短信”
//        无参构造，有参构造给属性赋值
//        main 方法创建手机对象，调用两个方法
//        考察点：成员变量、成员方法、对象创建



        Phone phone = new Phone("iphone18 pro",8999);
        phone.call();
        phone.sendMessage();
        System.out.println(phone.brand);
        System.out.println(phone.price);

    }
}

class Phone{
    public String brand;
    public int price;
    public Phone(){};
    public Phone(String brand,int price){
        this.brand = brand;
        this.price = price;
    }
    public void call(){
        System.out.println("手机正在打电话！");
    };
    public void sendMessage(){
        System.out.println("手机正在发短信！");
    }
}