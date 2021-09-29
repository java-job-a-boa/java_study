package array;

public class EnhancedForLoop {

	public static void main(String[] args) {
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		for(String lang : strArray) { // lang 변수에 배열의 각 요소가 대입된다.
			System.out.println(lang);
		}

	}

}
