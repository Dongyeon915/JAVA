package functionPackage;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
//       get메소드는 매개값을 가지지 않으므로 람다식도()를 사용한다. 하나의값을 무조건 리턴해줘야한다.

//      매개 변수가 없고 반환값만이 존재 (int) (Math.random()*100 + 1)
        Supplier<Integer> supplier = () -> (int) (Math.random()*100 + 1);
        System.out.println(supplier.get());

//       Example
        IntSupplier intSupplier = () -> {
            int num =  (int) (Math.random()*100 + 1);
            return num;
        };

        int num = intSupplier.getAsInt();
        System.out.println("임의수" + num);



    }
}
