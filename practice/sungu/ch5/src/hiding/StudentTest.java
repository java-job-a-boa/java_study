package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.grade = 100;
		studentLee.setStudentName("¿Ãº±±∏");
		
		
		System.out.println(studentLee.getStudentName());
	}

}
