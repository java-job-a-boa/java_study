package hiding;

public class Student {
	int studentID;	//�й�
	private String studentName; //�л� �̸�
	int grade;
	String address;
	
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
	