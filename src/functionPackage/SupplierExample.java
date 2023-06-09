package functionPackage;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
//      매개 변수가 없고 반환값만이 존재 (int) (Math.random()*100 + 1)
        Supplier<Integer> supplier = () -> (int) (Math.random()*100 + 1);
        System.out.println(supplier.get());
    }
}
