package practice_0913;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String adress;
	
	public String getStudentName( ) {
		return studentName;
	}
	
	public Student() {}
	
	public Student(String pname) {
		studentName = pname;
	}
	
	public static void main(String[ ] args) {
		Student studentKim = new Student("���ȸ"); // Ŭ���� ��ü ����
		
		System.out.println(studentKim.studentName);
	}
}

