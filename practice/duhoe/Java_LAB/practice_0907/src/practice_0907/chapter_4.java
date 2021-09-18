package practice_0907;

public class chapter_4 {
	public static void main(String[ ] args) {
		int rank = 5;
		char medalColor;
		
		switch(rank) {
			case 1 : medalColor = 'G';
					 break;
				
			case 5 : medalColor = 'S';
					 break;
			
			case 3 : medalColor = 'B';
			break;
			
			default : medalColor = 'A';
		}
		
		System.out.println(medalColor);
		
		int result = 0;
		for (int i = 1; i<=10; i++) {
			
			result += i;
		}
		System.out.println(result);
		
	}
}
