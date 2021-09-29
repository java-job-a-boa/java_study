package inheritance;

public class OverridingTest1 {
	public static void main(String[] args) {
		//c1
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		
		//v1
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 12345);
		customerKim.bonusPoint = 10000;
		
		//vc2
		Customer vc = new VIPCustomer(10030, "������", 12346);
		vc.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + customerLee.calcPrice(price) + "�� �Դϴ�.");
		System.out.println(customerKim.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + customerKim.calcPrice(price) + "�� �Դϴ�.");
		System.out.println(vc.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(price) + "�� �Դϴ�.");
		
	}
}
