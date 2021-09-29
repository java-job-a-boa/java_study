package arraylist;
import java.util.ArrayList;

public class Student {
	// Student Ŭ���� ��� ����
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // ArrayList ����
	
	// ������
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // ArrayList ����
	}
	
	// �л��� �����ϴ� ������ subjectList �迭�� �ϳ��� �߰��ϴ� �޼���
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); 	// Subject ����
		subject.setName(name);				// ���� �̸� �߰�
		subject.setScorePoint(score);		// ���� �߰�
		subjectList.add(subject);			// �迭�� ����
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("�л� " + studentName + "�� " + s.getName() + " ���� ������ " + s.getScorePoint() + "�� �Դϴ�.");
		}
		System.out.println("�л� " + studentName + "�� ������ " + total + "�� �Դϴ�.");
	}
}
