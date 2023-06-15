package chap05;

public class ArrayExample2 {

    public static void main(String[] args) {
        int[] score = {23,34,345,64,75};

        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
            if (score[i] > max){
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("최대값" + max);
        System.out.println("최소값" + min);
    }

}
