package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5]; // Book Ŭ���������� ��ü �迭 ����!
		// �̶� ��������� ���� �ν��Ͻ� �ּ� ���� ���� ���� 5���̴�.
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}

	}

}
// ���� �� �ּҸ� ���� ������ ��������� �� ������ �ʱ�ȭ �ƴٴ� ���� �����ִ� null�� ���´�.