package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5]; // Book 클래스형으로 객체 배열 생성!
		// 이때 만들어지는 것은 인스턴스 주소 값을 담을 공간 5개이다.
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}

	}

}
// 실행 시 주소를 담을 공간이 만들어지고 그 공간이 초기화 됐다는 것을 보여주는 null이 나온다.