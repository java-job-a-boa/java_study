# 자바를 자바보자 2주차

### 05, 06 클래스와 객체

함수 호출 => 스택 ( 아래서부터)



- 클래스 선언 형식 : 

```java
public class ClassA {
    // 접근성 class 클래스명{}
    String name;
    public String getName(){
        // 접근성 반환값 함수명(인자){}
    }
}
```

- 클래스 생성 :

```java
ClassA kim = new ClassA();
//클래스명 인스턴스명 = new 클래스명(인자)
```

변수들은 stack으로 저장, 인스턴스는 heap메모리에 저장. stack에 저장된 내용은 heap 메모리의 주소



- 생성자 선언:

```java
public class ClassA {
   	String name;
    public ClassA(String n){
        name = n;
    }
}
```

​	생성자 여러개 추가 가능, 이렇게 생성자를 추가하면 디폴트 생성자는 없어짐. 사용하기 위해서는 따로 추가.

- 정보 은닉 :

  ​	- `public`: 어디서나 접근 가능

  ​	- `protected`: 같은 패키지 내부, 상속관계 클래스에서만

  ​	- 아무것도 없으면 같은 패키지에서만

   - `private`: 같은 클래스 내부에서만

- static :

  인스턴스가 아닌 class에서 사용하는 변수(django의 pk처럼 사용가능)

  `public static int getstatic()`과 같은 방식으로 static 메서드 생성 가능

- 변수 유효 범위

  - 지역(local) 변수 : 함수나 메서드 내에서만 생겼다 사라짐
  - 멤버(instance) 변수
  - 클래스(static) 변수 : stack이 아닌 데이터 영역 메모리에 저장

- 싱글톤 패턴

  - 어떤 클래스의 인스턴스를 하나만 생성하여 사용하는 방식

    ```java
    public class singleton(){
        private static Singleton instanceA = new Singleton();
        private singleton(){}
        public static Singleton getInstance(){
            if(intanceA == null){
                instanceA = new Singleton();
            }
        }
    }
    ```

### 07 배열과 ArrayList

- 배열 선언

  ```java
  int[] arr = new int[n];
  int arr[] = new int[n];
  int[] arr = new int[]{1, 2, 3}; // 길이 선언 대신 한번에 초기화
  int[] arr = {1, 2, 3}; // 이것도 가능
  ```

  `arr.length`로 길이를 가져옴

- 배열 복사

  ```java
  System.arrcopy(복사할 배열, 복사 시작 위치, 붙여넣을 배열, 붙여넣을 시작 위치, 복사할 개수)
  	// 주소로 복사하는 얕은 복사임. 깊은 복사는 for문으로 직접
  ```

  ```java
  int[] arr = new int[]{1, 2, 3};
  for(int a : arr){
      // 이런 식의 for문을 활용하면 더 편하게 복사 가능.
  }
  ```

- 다차원 배열

  ```java
  int[][] arr = new int[2][3];
  ```

- ArrayList

  기존 배열과 달리 길이 **추가, 제거 가능**. 기본 라이브러리에서 import

  ```java
  import java.util.ArrayList;
  ArrayList<Integer> arr = new ArrayList<Integer>();
  ```

