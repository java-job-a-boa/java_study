package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		this.passengerCount = 0;
		this.money = 0;
	}
	
	public void take(int fee) {
		this.money += fee;
		this.passengerCount ++;
	}
	
	public void showInfo() {
		System.out.println("??ȣ"+this.busNumber +"??"+ this.money + "?°?" + this.passengerCount);
	}
}
