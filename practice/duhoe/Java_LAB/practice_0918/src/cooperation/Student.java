package cooperation;

public class Student {
	String name;
	int grade;
	int money;
	
	public Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(this.name + this.money);
	}
}
