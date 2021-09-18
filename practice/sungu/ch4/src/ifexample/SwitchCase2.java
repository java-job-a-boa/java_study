package ifexample;

public class SwitchCase2 {

	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
		//나혼자 코딩
		int floor = 5;
		
		switch(floor) {
		case 1:
			System.out.println(floor + "층 약국입니다.");
			break;
		case 2:
			System.out.println(floor + "층 정형외과입니다.");
			break;
		case 3:
			System.out.println(floor + "층 피부과입니다.");
			break;
		case 4:
			System.out.println(floor + "층 치과입니다.");
			break;
		case 5:
			System.out.println(floor + "층 헬스 클럽입니다.");
			break;
		}

	}

}
