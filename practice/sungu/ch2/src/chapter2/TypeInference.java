package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";	//다른 문자열은 대입 가능
		//str = 3;		다른 자료형을 넣을 수 없음
	}

}
