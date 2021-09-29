//package constructor;
//
//public class Person {
//	String name;
//	float height;
//	float weight;
//	
//	public Person() {} // 디폴트
//}

package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {} // 디폴트
	
	public Person(String pname) { // 사람이름을 매개변수로 입력 받아서 Person 클래스를 생성하는 생성자
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}