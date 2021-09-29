package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; // 다른 문자열 대입 가능
		// str = 3; // 정수는 불가능
	}

}
