package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee= new Student(1001, "Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 55);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("����", 90);
		studentKim.addSubject("����", 55);
		
		studentLee.showStudentInfo();
		System.out.println("======================");
		studentKim.showStudentInfo();
	}

}
