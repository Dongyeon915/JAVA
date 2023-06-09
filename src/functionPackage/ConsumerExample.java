package functionPackage;

import java.util.function.Consumer;

public class ConsumerExample  {

    public static void main(String[] args) {

//     배개변수만 있고 반환값이 없다
        Consumer<Integer> c = i -> System.out.println(i);
        c.accept(3);
    }
}
