package ifexample;

public class SwitchCase2 {

	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
		case "Gold":
			System.out.println("�ݸ޴��Դϴ�.");
			break;
		case "Silver":
			System.out.println("���޴��Դϴ�.");
			break;
		case "Bronze":
			System.out.println("���޴��Դϴ�.");
			break;
		default:
			System.out.println("�޴��� �����ϴ�.");
			break;
		}
		
		//��ȥ�� �ڵ�
		int floor = 5;
		
		switch(floor) {
		case 1:
			System.out.println(floor + "�� �౹�Դϴ�.");
			break;
		case 2:
			System.out.println(floor + "�� �����ܰ��Դϴ�.");
			break;
		case 3:
			System.out.println(floor + "�� �Ǻΰ��Դϴ�.");
			break;
		case 4:
			System.out.println(floor + "�� ġ���Դϴ�.");
			break;
		case 5:
			System.out.println(floor + "�� �ｺ Ŭ���Դϴ�.");
			break;
		}

	}

}
