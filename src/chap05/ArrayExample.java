package chap05;

public class ArrayExample {

    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 20, 30};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float) score.length;

        System.out.println("총점" + sum);
        System.out.println("평균" + average);
    }

}
