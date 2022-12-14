# 상속
````
상속은 이미 잘 개발된 클래스를 재사용해서 새로운 클래스를 만들기 때문에 코드의 중복을 줄여준다.
상속을 해도 부모 클래스의 모든 필드와 메소드들을 물려받는 것은 아니다. 부모 클래스에서 private 접근 제한을 갖는 필드와 메소드는 상속 대상에서 제외된다.


상속을 이용하면 클래스의 수정을 최소화시킬 수도 있다. 부모 클래스의 수정으로 모든 자식 클래스들의 수정효과를 가져오기 때문에 유지 보수 시간을 최소화시켜준다.
다중 상속은 허용하지 않는다.
````
# 부모 생성자 호출
````
자바에서는 자식 객체를 생성하면, 부모 객체가 먼저 생성되고 자식 객체가 그 다음에 생성된다.
모든 객체는 클래스의 생성자를 호출해야한다.
부모생성자 super(); 는 자식 생성자의 맨첫줄에서 호출된다.
만약 부모 생성자를 호출 하지않는다면 컴파일러에 의해 기본 생성자가 만들어지므로 문제없이 실행된다.
명시적으로 super(매개값)을 넣어서 부모 생성자를 호출할수있다.
만약 매개값의 타입과 일치하는 부모 생성자가 없을 경우 컴파일 오류가 발생한다.
기본 super() 생성자는 필요하다.
super()는 반드시 자식 생성자 첫줄에 위치해야한다.
그렇지 않으면 컴파일러는 에러를 발생시킨다.
````
# 메소드 재정의
````
메소드 오버라이딩은 상속된 메소드의 내용이 자식 클래스에 맞지 않을경우. 자식 클래스에서 동일한 메소드를 재정의 하는것을 말한다.
메소드가 오버라이딩되었다면 부모 객체의 메소드는 숨겨지기 때문에 자식 객체에서 메소드를 호출하면 오버라이딩 된 자식 메소드가 호출된다.
오버라이딩에는 규칙이 존재한다
1. 부모의 메소드와 동일한 시그니처(리턴타입,메소드 이름,매개변수 리스트)를 가져야 한다.
2. 접근 제한을 더 강하게 오버라이딩할 수 없다.
3. 새로운 예외(Exception)를 throw할수 없다
````
# final 클래스와 final 메소드
````
final 키워드는 클래스,필드,메소드 선언 시에 사용할 수 있다.
final 키워드는 해당 선언이 최종상태이고 수정될수 없음을 뜻한다.
final Class 는 부모 클래스가 될 수 없어 자식 클래스를 만들수 없다.
````
# 추상 클래스
````
추상 클래스는 실체 클래스의 공통되는 필드와 메소드를 추출해서 만들었기 때문에 객체를 직접 생성해서 사용할수 없다.
추상 클래스는 new연산자를 사용해서 인스턴스를 생성시키지 못한다.
추상 클래스는 새로운 실체 클래스를 만들기 위해 부모 클래스로만 사용된다.
추상 클래스는 extends뒤에만 올수있는 클래스 이다.
서로다른 메소드를 만들수 있으므로 메소드의 이름을 통일할 목적으로 쓰인다. 
````