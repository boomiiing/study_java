package chapter04;

public class Java05_FlowControl {
    public static void main(String[] args) {
        //todo 重复执行
        int i = 0;
        //先判断再执行
        while(i<10){
            System.out.println(i);
            i++;
        }
        //先执行再判断
        do{
            System.out.println(i);
        }while(i>20);

        for(int j = 0;j<10;j++){
            System.out.println(j*2);
        }
    }
}
