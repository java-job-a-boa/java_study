package classpart;

public class Person {
	String name;
	int age;
	int height;
	double weight; 	//个公霸
	char gender;	//己喊
	boolean married;	//搬去咯何
	
	//积己磊
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
