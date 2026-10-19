package chapter07;

public class java_practice4 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        c4.showCount();

    }
}

//需求：定义Counter类
//静态变量 count，记录创建了多少个对象
//每次 new 对象时，count++
//静态方法showCount()打印当前对象总数
//main 中创建 3 个 Counter 对象，调用 showCount 查看数量
//考察点：static 静态变量、静态方法

class Counter{
    //static属性属于类，不属于实例对象
    static int count;
    String str ="asd";
    public Counter(){
        count++;
    }
    public static void showCount(){
        System.out.println(count);
        //static方法中只能读取static属性
//        System.out.println(str);
    }
}