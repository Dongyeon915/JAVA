package Lamda;
@FunctionalInterface
public interface MyFunction {
// 함수형 인터페이스 - 단 하나의 추상 메서드만 선언된 인터페이스 / 람다식을 다루기위한 인터페이스
// 사용하는 람다식도 a,b만을 사용해서 int 를 반환해야한다.
   public abstract int max(int a,int b);

}
