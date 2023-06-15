package chap06;

public class CallstackTest {

    public static void main(String[] args) {
        firstMethod();
    }

    public static void firstMethod() {
        secondMethod();
    }

    public static void secondMethod() {
        System.out.println("scondMethod");
    }
}
