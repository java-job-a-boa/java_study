package arraylist;
import java.util.ArrayList;

public class Student {
	// Student 클래스 멤버 변수
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // ArrayList 선언
	
	// 생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // ArrayList 선언
	}
	
	// 학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); 	// Subject 생성
		subject.setName(name);				// 과목 이름 추가
		subject.setScorePoint(score);		// 점수 추가
		subjectList.add(subject);			// 배열에 저장
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "점 입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + "점 입니다.");
	}
}
