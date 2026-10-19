package chapter06;

public class java_06_interface {
    public static void main(String[] args) {
//        创建接口 Play，包含抽象方法 playGame()
//        创建类 Student 实现 Play 接口，重写 playGame()，打印：学生玩游戏
//        测试类：多态方式创建对象，调用方法
         interface Play{
            abstract void playGame();
        }
         class Student implements Play{
             public void playGame(){
                 System.out.println("Student is playing game");
             }
        }

        Play play = new Student();
         play.playGame();
    }
}
