package array;

public class TwoDimension2 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3]; // 2행 3열
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println(); // 개행
		}
		System.out.println(arr.length);
		System.out.println(arr[0].length);
	}

}
// 배열 선언 후 초기화 하지 않았기 때문에 0으로 자동 초기화 된다.