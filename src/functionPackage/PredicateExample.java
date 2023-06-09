package functionPackage;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

//        조건식을 표현하는 사용  매개변수는 하나 반환 타입은 boolean
//        Predicate<Integer> p = i -> i%2==0;
//        System.out.println(p.test(2));

//        predicate의 결합
        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i%2 == 0;

        Predicate<Integer> notP = p.negate();        // i >= 100
        Predicate<Integer> all = notP.and(q).or(r);  // 100 <= i && i < 200 || i % 2 ==0
        Predicate<Integer> all2 = notP.and(q.or(r)); // 100 <= i && (i < 200 || i % 2 ==0)


    }
}
