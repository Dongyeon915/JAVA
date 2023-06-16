# 멤버변수의 초기화 시기와 순서
````
클래스 변수의 초기화 시점 : 클래스가 처음 로딩될 때 단 한번 초기화 된다.
인스턴스 변수의 초기화 시점 : 인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어진다.
클래스변수의 초기화 순서 : 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
인스턴스 변수의 초기화 순서 : 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자

*클래스 변수는 항상 인스턴스 변수보다 항상 먼저 생성되고 초기화 된다*

  class InitTest {

        //  명시적 초기화
        static int cv = 1;
        int iv = 1;

        //  클래스 초기화 블럭
        static {
            cv = 2;
        }

        //  인스턴스 초기화 블럭
        {
            iv = 2;
        }

        //   생성자
        InitTest() {
            iv = 3;
        }}
````
1. cv가 메모리 (method area)에 생성되고 cv에는 int형의 기본값인 0이 cv에 저장된다.
2. 그 다음에는 명시적 초기화(int c=1)에 의해서 cv에 1이 저장된다.
3. 마지막으로 클래스 초기화 블럭(cv=2)이 수행되어 cv에는 2가 저장된다
4. (인스턴스초기화진행)
5. IninTest클래스의 인스턴스가 생성되면서 iv가 메모리(heap)에 존재하게 된다. iv역시 int형 변수이므로 기본값 0이 저장된다.
6. 명시적 초기화에 의해서 iv에 1이 저장되고
7. 인스턴스 초기화 블럭이 수행되어 iv에 2가저장된다.
8. 마지막으로 생성자가 수행되어 iv에는 3이 저장된다
````
public class Product {

    //  정적 변수를 사용함에따라 고정된 초기값을 유지할수있다.
    static int count = 0;
    int serialNo;

    {
        ++count; // Product인스턴스가 생성될 때마다 count의 값을 1씩 증가시켜서 serialNo에 저장한다.
        serialNo = count;
    }

    public Product() {
    } // 기본생성자 생략 가능
}
    class ProductTest {

        public static void main(String[] args) {
            Product product = new Product();
            Product product2 = new Product();
            Product product3= new Product();

            System.out.println("product의 제품번호는" + product.serialNo);
            System.out.println("product2의 제품번호는" + product2.serialNo);
            System.out.println("product3의 제품번호는" + product3.serialNo);
            System.out.println("생성된 제품의 수는 모두" + Product.count + "입니다.");
        }
    }

````
ex2
````
public class Document {
    static int count = 0;
    String name;
    
    Document() {
     this("제목없음" + ++count);   
    }
    
    Document(String name){
        this.name = name;
        System.out.println("문서" + this.name + "가 생성되었습니다.");
    }
}

class DocumentTest {

    public static void main(String[] args) {
      Document document = new Document();
      Document document2 = new Document("문서예제");
      Document document3 = new Document();
      Document document4 = new Document();
    }
}
````
---------------------
# 상속
생성자와 초기화 블럭은 상속되지 않는다. 멤버만 상속된다.
자손 클래스의 멤버 갯수는 조상 클래스보다 항상 같거나 많다.
ex1
````
package chap06;

public class CaptionTvTest {

    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class CaptionTv extends Tv {

    boolean caption;

    void display(String text) {
        if (caption) { // true 일때만 text를 보여준다.
            System.out.println(text);
        }
    }
}

class CaptionTvTest2 {

    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10; // 조상 클래스로부터 상속받은 멤버
        ctv.channelUp();  // 조상 클래스로부터 상속받은 멤버
        ctv.caption = true;
        ctv.display("상봉동");

    }
}

````
