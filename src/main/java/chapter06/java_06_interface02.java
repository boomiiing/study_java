package chapter06;

public class java_06_interface02 {
    public static void main(String[] args) {
//        接口 A：default void hello() 打印 hello A
//        接口 B：default void hello() 打印 hello B
//        类 C 同时实现 A、B，必须重写 hello 方法
//        测试调用 hello
//        考点：两个接口存在同名 default 方法，实现类必须重写解决冲突

        interface A {
            default void hello() {
                System.out.println("hello A");
            }
        };
        interface B {
            default void hello() {
                System.out.println("hello B");
            }
        };

        class C implements A,B{
            public void hello() {
                System.out.println("hello C");
            }
        }
        C c = new C();
        c.hello();
    }
}
