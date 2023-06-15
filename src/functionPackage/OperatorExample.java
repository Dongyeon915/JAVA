package functionPackage;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

    private static int[] scores = {9, 12, 1};

    //  두개의 인트연산 IntBinaryOperator
    public static int maxOrMin(IntBinaryOperator intBinaryOperator) {
        int result = scores[0];
        for (int score : scores) {
            result = intBinaryOperator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
//     최대값 얻기 2개의 매개변수를 받고 조건문 핸들링 가능
        int max = maxOrMin((a, b) -> {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        });
        System.out.println("최대값" + max);

        //   최소값
        int min = maxOrMin((a, b) -> {
                if (a <= b) {
                    return a;
                } else {
                    return b;
                }
            }

        );
        System.out.println("최소값" + min);
    }
}
