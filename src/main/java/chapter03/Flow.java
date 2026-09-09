package chapter03;


public class Flow {
    public static void main(String[] args) {
    // todo 多分枝： 多重判断
        int i =100;
        if(i<10){
            System.out.println("小于10");
        }else if (i==10){
            System.out.println("等于10");
        }else {
            System.out.println("大于10");
        }

        //todo 流程控制 多分枝

        int j = 20;

        switch (j){
            case 10 :
                System.out.println("10");
                break;
            case 20 :
                System.out.println("20");
                break;
            case 30 :
                System.out.println("30");
                break;
            default:
                System.out.println("结束");
        }

    }
}
