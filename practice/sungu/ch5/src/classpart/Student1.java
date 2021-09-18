package classpart;

public class Student1 {
	int studentID;	//학번
	String studentName; //학생 이름
	int grade;	//학년
	String address;	//사는 곳
	
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
		Student1 studentAhn = new Student1();		//Student 클래스 작성
		studentAhn.studentName = "안철수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}