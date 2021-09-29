package array;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}}; // 2차원 배열 생성 및 초기화
		
		for(int i = 0; i < arr.length; i++) { // 행
			for(int j = 0; j < arr[i].length; j++) { // 열
				System.out.print(arr[i][j]);
			}
			System.out.println(); // 개행
		}

	}

}
