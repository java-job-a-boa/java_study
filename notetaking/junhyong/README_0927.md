# 8 상속과 다형성

### 8-1 상속이란

- 상속받는 형식

```java
public class Child extends Parent {
    // 변수나 생성자 등은 똑같이 생성
    // 별도 처리 없을 경우 부모 클래스의 변수, 생성자, 메서드 등 그대로 적용
    // 부모에서 변수, 메서드 등을 protected로 설정할 경우 자식 클래스가 상속받아 내용 변경해서 사용 가능
}
```



### 8-2 상속에서 클래스 생성과 형 변환

- 자식 클래스의 인스턴스를 생성자로 생성하는 순간 부모 클래스의 생성자 역시 같이(먼저) 사용됨. 

- `this`가 자기 자신의 주소인 것처럼 `super`는 상위 클래스의 주소.
- 자식 클래스의 생성자는 보이지 않는 `super()`를 통해 부모 클래스의 생성자를 사용하고 있음

```java
public class Child extends Parent{
    public Child(){
        //보이지 않는 super();
        ...
    }
}
```

- 부모 클래스의 생성자를 필요한 매개 변수를 포함하게 지정하여 호출할 수 있음

```java
public class Child extends Parent{
    public Child(){
        super(ID, name); // 직접 사용
        ...
    }
}
```

- 다른 부모 클래스의 변수나 메서드 등도 `super`를 통해 참조 가능

### 8-3 메서드 오버라이딩

- 부모 클래스의 `public int calc(int price)`라는 메서드가 정의되어 있을 때, 다음과 같이 오버라이딩하여 자식 클래스에서 메서드를 재정의할 수 있다.

  ```java
  public class Child extends Parent{
      ...
      @Override //애노테이션이라고 부르고, 사용 의도를 java컴파일러에게 알려주는 주석같은 역할
      public int calc(int price){
          ... //재정의
      }
  }
  ```

- 변수는 인스턴스가 생성될 때 만들어진 힙 메모리에 저장되지만 메서드는 인스턴스가 아닌 클래스에 속해있는 개념이기 때문에 메서드 영역이라는 곳에 따로 저장됨. 따라서 같은 클래스의 다른 인스턴스에서 메서드를 실행해도, 메서드 영역에 있는 하나의 메서드를 호출하여 실행.
- 재정의(Override)라는 것은 위의 메서드 영역에 다른 메서드로서 저장한다는 의미.
- 인스턴스는 생성될 때 그 메서드 영역의 주소를 가지고 있는듯(??)
-  따라서 `Child`형의 인스턴스를 `Parent`형으로 형변환하여 재정의된 메서드를 실행하면, 같은 이름의 `Parent`의 메서드가 아닌 `Child`의 메서드가 실행됨



### 8-4, 5 다형성, 다형성 활용하기

- 하나의 부모를 상속받는 여러 자식클래스에서, 부모의 메서드를 다른 방식으로 상속, 재정의하여 사용하는 것.
- 다른 역할을 하는 메서드를 하나의 이름, 형태(받는 인자)로 관리할 수 있다는 장점
- 자식이 부모 클래스의 일부인 개념(구체화되는 개념)일 때는 상속을 사용하는 것이 좋지만, 그렇지 않은 관계에서 단순히 부모 클래스의 코드를 재사용할 때는 상속보다는 멤버 변수로 해당 클래스를 포함시켜 코드 내용을 불러오는 것이 적절. 



### 8-6 다운 캐스팅과 intanceof

- 다운 캐스팅 : 필요에 의해 상위 클래스로 형변환되었던 하위 클래스의 인스턴스를 다시 원래 하위 클래스로 형변환하는 것.
- `instanceof` : `a` 인스턴스가 `A`클래스의 인스턴스형인지 확인할 때 사용하는 예약어 ex)`if(a instanceof A){  };`
- `instanceof`를 통해 원래 자료형을 확인했다면 `A a2 = (A)a`와 같이 명시적으로만 형변환 가능.
- 자료형이 맞지 않은데 다운 캐스팅할 경우, 컴파일은 되지만 실행할 때 오류가 발생
