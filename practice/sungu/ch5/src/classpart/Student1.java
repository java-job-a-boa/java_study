package classpart;

public class Student1 {
	int studentID;	//�й�
	String studentName; //�л� �̸�
	int grade;	//�г�
	String address;	//��� ��
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student1 studentAhn = new Student1();		//Student Ŭ���� �ۼ�
		studentAhn.studentName = "��ö��";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}