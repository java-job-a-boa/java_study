package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentJ.takeBus(bus100);
		studentJ.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2È£¼±");
		studentT.takeSubway(subwayGreen);
		studentT.showInfo();
		subwayGreen.showInfo();
	}
}
