package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "이선구";
		Student studentKim = new Student();
		studentKim.studentName = "김호연";
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
