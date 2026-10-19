package chapter04;

public class Java06_test {
    public static void main(String[] args) {
        int i = 1;
        int j = 10;
        //九层妖塔
        while(i<j){
            if(i%2==1){
               int space = (j-i-1)/2;
                System.out.println(" ".repeat(space) + "*".repeat(i));
            }
            i++;
        }
    }
}
