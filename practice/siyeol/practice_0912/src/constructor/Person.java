//package constructor;
//
//public class Person {
//	String name;
//	float height;
//	float weight;
//	
//	public Person() {} // ����Ʈ
//}

package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {} // ����Ʈ
	
	public Person(String pname) { // ����̸��� �Ű������� �Է� �޾Ƽ� Person Ŭ������ �����ϴ� ������
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}