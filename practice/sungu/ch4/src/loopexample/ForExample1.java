package loopexample;

public class ForExample1 {

	public static void main(String[] args) {
		int i;
		int sum;
		for(i = 1, sum = 0; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum);
		
		//나 혼자 코딩
		int i2;
		for(i2=1; i2 <= 10; i2++) {
			System.out.println("안녕하세요" + i2);
		}
	}

}
