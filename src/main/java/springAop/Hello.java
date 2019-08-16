package springAop;

public class Hello {
    public void method1() {
        System.out.println("--------------------");
        System.out.println("Method 1");
    }
    public void method2() {
        System.out.println("--------------------");
        System.out.println("Method 2");
    }
    public void method3() {
        System.out.println("--------------------");
        System.out.println("Method 3");
        throw new IllegalArgumentException();
    }
}

