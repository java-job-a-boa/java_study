package array;

public class ArrayTest {

	public static void main(String[] args) {
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < num.length; i++) { // length 속성을 사용해 배열의 길이만큼 for문 반복
			System.out.println(num[i]);
		}

	}

}
