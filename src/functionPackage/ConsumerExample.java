package functionPackage;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample  {

    public static void main(String[] args) {

//     매개변수만 있고 반환값이 없다
        Consumer<Integer> c = i -> System.out.println(i);
        c.accept(3);

        Consumer<String> str = soutValue -> System.out.println(soutValue);
        str.accept("나는 소비만 한다");

//       객체 T와 U를 받아 소비
        BiConsumer<String,String> biConsumer = (String t,String u) -> System.out.println(t + u);
        biConsumer.accept("동","연");
//       double값으 받아 소비
        DoubleConsumer doubleConsumer = d -> System.out.println("더블값을 소비" + d);
        doubleConsumer.accept(9.15);

//       T 객체와 int값 두개를 가지기 때문에 람다식도 두개의 매개변수를 사용한다 T가 String타입이므로 람다식의 t매개변수는 String i 는 고정적으로 int타입
        ObjIntConsumer<String> objIntConsumer = (t,i) -> System.out.println(t + i);
        objIntConsumer.accept("여긴문자",15);

    }
}
