package chap02;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + "출력확인");
        Scanner scanner1 = new Scanner(System.in);
        int num = scanner1.nextInt();
        System.out.println(num + "출력");
    }
}
