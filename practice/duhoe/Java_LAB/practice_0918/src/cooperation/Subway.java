package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
		this.passengerCount = 0;
		this.money = 0;
	}
	
	public void take(int fee) {
		this.money += fee;
		this.passengerCount ++;
	}
	
	public void showInfo() {
		System.out.println(this.lineNumber + this.money + this.passengerCount);
	}
}
