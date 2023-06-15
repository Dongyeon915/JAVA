package functionPackage;

public class RunnableExample {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Runnable은 매겨변수도 없고 반환값도 없다.");
        runnable.run();


    }
}
