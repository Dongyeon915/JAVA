package Lamda;

public class Example2 {

    public static void main(String[] args) {

        Example2for aFor = () -> System.out.println("매개변수만 맞다면 내용을 저장해서 출력도가능");
        aFor.run();
    }
}
