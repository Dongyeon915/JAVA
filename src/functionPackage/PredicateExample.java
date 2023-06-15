package functionPackage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    private static List<PredicateClassExample> list = Arrays.asList(
        new PredicateClassExample("김동연1", "여자", 30),
        new PredicateClassExample("김동연2", "여자", 30)
    );

    public static double avg(Predicate<PredicateClassExample> predicate) {
        int count = 0, sum = 0;
        for (PredicateClassExample predicateClassExample : list) {
            if (predicate.test(predicateClassExample)) {
                count++;
                sum += predicateClassExample.getScore();
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
//        Example1
//        조건식을 표현하는 사용  매개변수는 하나 반환 타입은 boolean
//        Predicate<Integer> p = i -> i%2==0;
//        System.out.println(p.test(2));

//        predicate의 결합
//        Predicate<Integer> p = i -> i < 100;
//        Predicate<Integer> q = i -> i < 200;
//        Predicate<Integer> r = i -> i%2 == 0;
//
//        Predicate<Integer> notP = p.negate();        // i >= 100
//        Predicate<Integer> all = notP.and(q).or(r);  // 100 <= i && i < 200 || i % 2 ==0
//        Predicate<Integer> all2 = notP.and(q.or(r)); // 100 <= i && (i < 200 || i % 2 ==0)
//--------------------------------------------------------------------------------------------------------------------
//        Example2

        double maleAvg = avg(t -> t.getSex().equals("여자"));
        System.out.println("여자 평균 점수:" + maleAvg);

    }
}
