package Lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example1 {


    public static void main(String[] args) {
//      기존 Comparator를 통한 배열정리방법
//        List<String> list = Arrays.asList("동6","동2","동3","동4");
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        System.out.println(list);


//    람다식으로 대체한방법
//        List<String> list =  Arrays.asList("동6","동2","동3","동4");
        //      비교대상 지정가능 방법 1
//        Collections.sort(list,(s1,s2) -> s1.compareTo(s2));
//      방법2 역순으로 하고싶다면
//        Collections.sort(list,Collections.reverseOrder());
//      방법3 String::compareTo로 정렬가능
//        Collections.sort(list, String::compareTo);
    }
}
