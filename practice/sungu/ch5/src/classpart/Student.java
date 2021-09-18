package classpart;

public class Student {
	int studentID;	//학번
	String studentName; //학생 이름
	Subject korean;
	Subject math;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
	