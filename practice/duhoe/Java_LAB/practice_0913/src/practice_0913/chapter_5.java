package practice_0913;

public class chapter_5 {
	public static int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int sum = add(n1, n2);
		System.out.println(sum);
	}
}
