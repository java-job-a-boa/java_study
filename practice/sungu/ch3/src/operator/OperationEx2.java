package operator;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;	//���ӿ��� ȹ���� ������ 150��
			
		int lastScore1 = ++gameScore;	//gameScore�� 1��ŭ ���� ���� lastScore1�� ����
		System.out.println(lastScore1); //151
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2); //150
	}

}