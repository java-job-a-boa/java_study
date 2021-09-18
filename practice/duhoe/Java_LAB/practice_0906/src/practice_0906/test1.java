/**
 * 
 */
package practice_0906;

/**
 * @author 김두회
 *
 */
public class test1 {
	public static void main(String[] args) {
		int level;				// 변수 선언
		level = 10;				// 값 대입
		System.out.println(level);// 출력
		
		int age =26;
		System.out.println(age);
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		int ch3 = 97;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char a1 = 65;
		System.out.println(a1);
		
		var a = 10;
		var b = 'B';
		System.out.println(a);
		System.out.println(b);
		
		final var PI = 3.14;
		System.out.println(PI);
//		PI = 5; 상수를 변경하면 오류 발생! 
		
	}
}
