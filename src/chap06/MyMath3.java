package chap06;

public class MyMath3 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static int add(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
            return result;
        }
        return result;
    }

}
