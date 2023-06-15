package chap04;

import java.util.Scanner;

public class IfExample {

    public static void main(String[] args) {
//        int input;
//
//        System.out.println("숫자를 하나 입력하세요.");
//        Scanner scanner = new Scanner(System.in);
//        String tmp = scanner.nextLine();
//        input = Integer.parseInt(tmp);
//
//        if (input == 0){
//            System.out.println("입력한 숫자는 0이다");
//        }
//        else {
//            System.out.printf("입력한 숫자는 %d",input);
//        }

        int score = 0;
        char grade = ' '; // 공백 초기화
        Scanner scanner = new Scanner(System.in);

        score = scanner.nextInt();

        if (score >= 90){
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70 ) {
            grade = 'C';
        }else {
            grade = 'D';
        }
        System.out.println("학점" + grade);
    }
}
