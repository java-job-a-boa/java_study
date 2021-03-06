# 0907

## 3장 연산자

### 자바의 `/`연산자는  나눗셈의 몫을 반환한다.

* 찐 나눗셈은 결과 변수의 자료형이 'double' 이어야 하고, 나눗셈을 진행하는 두 수 중에서 적어도 하나가 '실수' 여야한다.

### 증감 연산자 

* 값을 1만큼 늘리거나 줄임
* ++ 혹은 -- 
* 변수 앞, 뒤에 붙이는게 기능이 다름.
* 다른 변수에 할당하여도 **원본이 변한다**!!! 

### 논리연산자

* `&&` : and
* `||` : or
* `!` :not

### 조건 연산자

* `조건식 ? 결과 1: 결과 2` 의 형태
  * 조선식이 참이면 결과 1이, 거짓이면 결과 2가 실행

* 간단한 if -else 문은 조건 연산자로도 구현이 가능하다.

### 비트 연산자

* 반전 연산자 (~)  : 0과 1을 뒤집는다. 



## 4장 조건문, 반복문

### if-else if -else 문

```java
if(조건식){
    수행문;
}
else if{
    수행문2;
}
else{
    수행문3;
}
```

* 위와 같은 형태로 작성된다.
* if 문은 수행문이 하나일 때 중괄호를 쓰지 않아도 된다. 
  * 그러나, 가독성과 확장성을 생각해서 중괄호를 쓰는 습관을 들이길 추천

### switch-case문

```java
int rank = 값;
		char medalColor;
		
		switch(rank) {
			case 값1 : 수행문1;
					 break;
				
			case 값2 : 수행문2;
					 break;
			
			case 값3 : 수행문3;
					break;
			
			default : 수행문4;
		}
		
		System.out.println(medalColor);
```

* 위의 형태로 작성된다.
* case 의 수행문이 같을 경우 `case 1: case 2: 수행문;` 형태로 쓸 수 있다.
* break 가 없을 경우 dafualt 까지 내려간다 ㅋㅋㅋㅋㅋ 특이한 녀석..
* 값에 문자열도 사용할 수 있다.
* 단, **조건식을 사용할 수 없다**.
  * 따라서, 조건이 **하나의 변수값이나 상수값**으로 구분될 때 사용한다.

### while 문

```java
while(조건식) {
    반복수행문;
}
```

* 조건식이 참일 동안 반복
* break, continue 사용가능



### do-while 문

```java
do {
    수행문;
}while(조건식);
 수행문2;
```

* 조건식이 참이면 do를 실행하러 되돌아간다. 
* while 문과의 차이점은 **코드가 먼저 실행**되고 조건식을 판별한다는 점이다.



### for 문

```java
for(초기화식;조건식;증감식){
    수행문;
}
```

* 초기화식에서 변수를 새로 선언할 수 있다.
* break, continue 사용 가능
* 초기화식, 조건식, 증감식은 생략할 수 있다.
  * 초기화식 생략 : 다른 곳에 변수가 초기화 되어있을 경우
  * 조건식 생략 : 원하는 값이 나왔을 때, break로 대체 가능
  * 증감식 생략 : 증감식의 연산이 복잡하거나 다른 변수 연산 결과값에 의해 바뀐다면 증감식 생략하고 for 문내에서 처리
  * 요소 모두 생략하면 무한 반복한다.

