package staticex;

public class StudentTest2 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("������");
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("�ռ���");
		
		System.out.println(studentSon.studentID);
		System.out.println(studentLee.studentID);
	}
}
