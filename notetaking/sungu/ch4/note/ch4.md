# 04-1 조건문

### if & if-else 문



### if-else & if-else 문

- 하나의 조건을 만족하면 이후의 조건은 비교하지 않는다.

```java
if(age < 8) {
    charge = 1000;
    System.out.println("취학 전 아동입니다.");
}
else if(age < 14) {
    charge = 2000;
    System.out.println("초등학생입니다.");
}
```

- 이미 위의 조건식에서 (age < 8) 을 비교했으므로, 해당 내용이 모두 처리됨. 따라서, 이후엔 `age < 8` 을 조건식에 굳이 추가하지 않아도 된다.



### 조건문과 조건 연산자

```java
//if-else 문
if (a>b) {
    max = a;
}
else {
    max = b;
}


//조건 연산자
max = (a > b) ? a: b;
```





### switch-case문

- if문을 사용하기 번거로운 경우 사용할 수 있음
- 조건이 하나의 변수 값이나 상수 값으로 구분되는 경우 사용한다
- 하나의 값으로 조건을 비교할 수 있을 때 사용
- 주어진 값이 어떤 case에도 해당하지 않으면 맨 마지막 default 문을 수행한다.
- break문은 특정 case 만족 시 수행을 멈추고 탈출하도록 함

```java
switch(조건) {
    case 값1 : 수행문1;
        break;
    case 값2 : 수행문2;
        break;
    default : 수행문3;
}
```





- case문 동시에 사용하기
  - 여러 경우를 동시에 처리할 수도 있다.

```java
//각 달의 날짜를 출력하는 경우
case 1 : case 3 : case 5 : case 7 : case 12 : day = 31;
		break;
case 4: case 6 : day = 30;
		break;
case 2 : day = 28;
		break;
```



- break 문은 꼭 작성해야 함!



### case문에 문자열 사용

- case 값에 정수 뿐만 아니라 문자열도 사용 가능하다.





# 04-2 반복문



### while문




### do-while문

- {} 안의 문장을 무조건 한 번 수행한 후에 조건식을 검사한다.
- 중괄호 안의 문장을 반드시 한 번은 실행해야 할 때 사용할 수 있다.

```java
int num = 1;
int sum = 0;

do {
    sum += num;		//조건식이 참이 아니더라도 무조건 한 번 수행
    num++;
} while(num <= 10);

System.out.println(sum);
```



### for문

- 기본구조

```java
for(초기화식; 조건식; 증감식) {
    수행문;
}

//예시
int i;
int sum;
for(i = 1, sum = 0; i <= 10; i++) {
    sum += i;
}
```

- 초기화 부분과 증감식 부분도 콤마로 구문하여 여러 문장을 사용할 수 있다.



- for문을 사용하는 이유
  - 반복횟수를 관리할 수 있다.
  - while문에 비해 코드가 짧고 가독성이 좋음
  - 배열과 함께 자주 사용한다.



### for문 요소 생략

#### 1. 초기화식 생략

- 이미 이전에 다른 곳에서 변수가 초기화되어 중복으로 초기화할 필요 없을 때 생략 가능

```java
int i = 0;
for(; i < 5; i++) {
    ...
}
```



#### 2. 조건식 생략

- 특정 결과값이 나왔을 때 바로 for문의 수행을 멈출 필요가 있는 경우, for문안에 if문 사용

```java
for(i = 0; ; i++) {
    sum += i;
    if(sum>200) break;
}
```



#### 3. 증감식 생략

- 증감식의 연산이 복잡하거나 다른 변수의 연산 결과값에 의존하는 경우 증감식을 생략하고 for문안에 쓴다.

```java
for(i = 0; i < 5; ) {
    ...;
    i = (++i) % 10;
}
```



#### 4. 요소 모두 생략

- 무한 loop 경우에

```java
for( ; ; ) {
    ...
}
```





### continue문

- 반복문 내용 중 특정 조건에서는 수행하지 않고 건너뛰어야 할 때





### break 문

