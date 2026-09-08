package chapter02;


public class Java02 {
    public static void main(String[] args) {
        String name = "hot_lee";
        byte age = 28;
        short height = 171;
        int salary = 20000;
        boolean hasWork = true;
        System.out.println("我是" + name + "今年" + age + "岁，我身高" + height +",现在" + (hasWork?"有":"没有") + "工作，我月薪" + salary);
    }
}
