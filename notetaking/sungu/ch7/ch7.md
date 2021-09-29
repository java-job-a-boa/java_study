### 배열 초기화

```java
int[] studentIDs = new int[] {1, 2, 3};	 //개수 생략

int[] studentIDs = new int[3] {1, 2, 3}; //오류 발생

int[] studentIDs = new int[3] {1, 2, 3}; 

//다음과 같이 자료형을 먼저 선언하는 경우, 초기화 할 때 new int[] 생략 불가
int[] studentIDs;
studentIDs = new int[] {1, 2, 3}; 
```



### 배열 복사

```java
System.arraycopy(Array1, 복사할 배열의 시작 위치, Array2, 붙여넣을 배열의 시작 위치, 복사할 요소 개수);
```





### 얕은 복사

- 반복문이나 System.arraycopy() 메서드를 사용할 시

- 객체 배열의 요소에 저장되는 값은 인스턴스 자체가 아니고 인스턴스의 주소 값이다.
- 따라서, 얕은 복사 시 인스턴스가 따로 생성되는 것이 아니라 기존 인스턴스의 주소 값만 복사됨
- 결국 두 배열의 각 요소는 동일한 인스턴스를 가리킨다.



### 깊은 복사

- 각 배열의 인스턴스를 따로 관리하고 싶을 때
- 복사할 배열에 인스턴스를 따로 생성한 후, 요소 값을 복사한다.
- 두 배열은 서로 다른 인스턴스를 가리킨다.



### 향상된 for문

- 배열을 처음부터 끝까지 순회할 때



### ArrayList

- 객체 배열을 관리할 수 있는 멤버 변수와 메서드 제공
- add(E e), size(), get(int index), remove(int index), isEmpty() 등의 메서드





> 키워드를 편집 창에 입력 후 F1 를 누르면 JavaDoc 확인 가능
