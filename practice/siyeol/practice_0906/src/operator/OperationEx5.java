package operator;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B00000101;
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
		
		int num2 = 0B11111111111111111111111111110101;
		System.out.println(num2);

	}

}
