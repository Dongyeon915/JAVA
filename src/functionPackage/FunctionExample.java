package functionPackage;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
//        일반적인 함수.하나의 매개변수를 받아서 결과를 반환
        Function<Integer,Integer> function = i -> i/10*10; // i의 일의자리 없애기
        System.out.println(function.apply(25));


        // 람다식 합치기
        Function<String,Integer> f = (s) -> Integer.parseInt(s,16); // 들어온 값을 16진수로 변경
        Function<Integer,String> g = (i) -> Integer.toBinaryString(i);   // 2진수 문자열로 변경

//      f를 실행한 후 g를 실행 입출력 타입값이 일치해야한다
        Function<String,String> h = f.andThen(g);
    }
}
