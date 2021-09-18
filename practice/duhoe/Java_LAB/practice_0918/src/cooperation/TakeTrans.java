package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student duhoe = new Student("Duhoe", 4, 10000);
		Student eunji = new Student("Eunji", 4, 5000);
		
		Bus bus3 = new Bus(3);
		Subway subway1 = new Subway(1);
		
		duhoe.takeBus(bus3);
		eunji.takeBus(bus3);
		bus3.showInfo();
		
		duhoe.takeSubway(subway1);
		eunji.takeSubway(subway1);
		subway1.showInfo();
		
		duhoe.showInfo();
		eunji.showInfo();
		
	}
}
