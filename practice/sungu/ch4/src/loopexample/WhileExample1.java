package loopexample;

public class WhileExample1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {		//num ���� 10���� �۰ų� ���� ����
			sum += num;			//�հ踦 ���ϴ� sum�� num�� ���ϰ�
			num++;				//num�� 1�� ���س���
		}
		System.out.println(sum);
	}

}
