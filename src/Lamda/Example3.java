package Lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {
//
//        int[] arr = new int[5];
//        Arrays.setAll(arr,(i) -> (int)(Math.random()*10)+1);
//        for (int y : arr){
//            System.out.println(y);

//        MyFunction myFunction = (a, b) -> a > b ? a : b;
//        System.out.println(myFunction.max(2, 3));

//        리턴문이 있는경우 { 생략불가능
//        MyOneValueFunction myOneValueFunction = a -> {
//            return a + 3;
//        };
//        System.out.println(myOneValueFunction.oneValue(3));

//        내가 만든 인터페이스를 익명객체를 람다식으로 대체
//        MyFunction f = (int a,int b) -> a > b ? a: b;
//        익명 객체의 메서드를 호출
//        int big = f.max(3,5);
//        System.out.println(big);
//
//        List<String> list = Arrays.asList("동연","테스트");
//        Collections.sort(list,(o1, o2) -> o1.compareTo(o2));

//        람다식 내부 변수접근
        class Outer{
            int val = 10; // Outer.this.val
            class Inner {
                int val = 20; // this.val
                void method(int i){ // void method(final int i)
                    int val = 30; // final int val = 30;
                 //   i = 10; // 람다식 내에서 참조하는 *지역변수*는 값의변경이 불가능하다.

                    MyOneValueFunction f = () -> {
                        System.out.println("i" + i);
                        System.out.println("val" + val);
                        System.out.println("this.val" + ++this.val);
                        System.out.println("Outer.this.val" + ++Outer.this.val);
                    };
                    f.oneValue();
                }
            } // Inner 클래스의 끝
        } // Outer  클래스의 끝

        class LamdaMan{
            public static void main(String[] args) {
                Outer outer = new Outer();
                Outer.Inner inner = outer.new Inner();
                inner.method(100);
            }
        }
    }


    //    -------------------------------------------------------------------------------------------
//    public static int max(int a,int b){
//        return a > b ? a : b;
//    };



}
