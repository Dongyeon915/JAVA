package chap04;

import java.util.Scanner;

public class ForExample {

    public static void main(String[] args) {
        int num = 0;
        System.out.println("출력할 라인의 수를 입력하라");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

       Dong : for (int i=0; i<num; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
