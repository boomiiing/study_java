package chapter02;


public class Java02 {
    public static void main(String[] args) {
        String name = "hot_lee";
        byte age = 28;
        short height = 171;
        int salary = 20000;
        boolean hasWork = true;
        System.out.println("我是" + name + "今年" + age + "岁，我身高" + height +",现在" + (hasWork?"有":"没有") + "工作，我月薪" + salary);
        System.out.println((age>18)?"成年人":"未成年");
        System.out.println(salary>=20000?"高收入":"仍需努力");
        int count = 0;
        for (int i = 1 ; i<=100;i++){
            System.out.println(((i%2)==0)?i:"");
            count+=i;
        }
        System.out.println(count);
        for(int i = 1;i<=9;i++){
            for(int j = 1;j<=9;j++){
                System.out.println(i+"x"+j+"="+i*j);
            }
        }
    }
}
