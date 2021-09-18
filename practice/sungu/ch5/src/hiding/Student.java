package hiding;

public class Student {
	int studentID;	//학번
	private String studentName; //학생 이름
	int grade;
	String address;
	
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
	