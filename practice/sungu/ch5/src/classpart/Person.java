package classpart;

public class Person {
	String name;
	int age;
	int height;
	double weight; 	//������
	char gender;	//����
	boolean married;	//��ȥ����
	
	//������
	public Person(String pname) {
		name = pname;
	}
	
//	public Person(String name) {
//		this.name = name;
//	}
	
	public Person() {
		
	}
	
	public Person(String pname, int pheight, double pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("sungu");
		Person p2 = new Person("sun", 171, 78);
		System.out.println(p1.name);
		System.out.println(p2.name);
	}
}
