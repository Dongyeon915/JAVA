# 자바의 데이터타입 분류
````
primitive (원시 타입)
정수형
byte,char,short,int,long
실수형
float,double
논리타입
boolean

reference (참조 타입)
배열타입,열거타입,클래스,인터페이스
````

원시타입은 선언된 변수에 값을 저장하지만,
참조 타입은 변수는 메모리 번지의 값으로 번지를 통해 객체를 참조한다.

````
변수는 stack영역에 생성된다,

객체는 heap 영역에 생성된다
````

# 메소드 영역
````
코드에 사용되는 class들을 클래스 로더로 읽어 클래스별로 런타임 상수풀,필드데이터,메소드 데이터,메소드 코드,생성자 코드 등을 분류해서 저장한다.

메소드 영역은 JVM이 시작할 때 생성되고 모든 스레드가 공유하는 영역이다.
````

# 힙 영역
````
객체와 배열이 생성되는 영역이다.
JVM 스택영역의 변수나 다른 객체의 필드에서 참조한다.
참조하는 변수가 없는 객체나 배열은 JVM이 Garbage Collector를 실행시켜 쓰레기 객체를 힙 영역에서 제거한다.
````
# 스택 영역
````
각 스레드마다 하나씩 존재하며 스레드가 시작될 댸 할당된다.
자바 프로그램에서 추가적으로 스레드를 생성하지 않았다면 main 스레드만 존재하므로 JVM스택도 하나이다.
JVM 스택은 메소드를 호출할 때마다 프레임(Frame)을 추가(Push)하고 메소드가 종료되면 해당 프레임을 제거(pop)하는 동작을 수행한다
````
# null과 NullPointException
````
참조 타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로 null값을 가질 수 있으며 null 값도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 스택 영역에 생성된다.
````
# String 타입, new 연산자
````
자바는 문자열 리터럴이 동일하다면 String객체를 공유 하도록 되어있다
new 연산자는 힙 영역에 새로운 객체를 만들 때 사용하는 연산자로 객체 생성 연산자라고 
````

# new 연산자로 배열 생성
````
타입[] 변수 = new 타입[길이];

타입[] 변수 = null;
변수 = new 타입[길이];
배열은 초기값으로 null값을 갖는다
````

# 다차원 배열
````
int[][] score = new int[2][];
socre[0] = new int[2];  // 0,1
socre[1] = new int[3];  // 0,1,2
````
