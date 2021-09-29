package practice;
import java.util.ArrayList;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dog[] dog_array = new Dog[5];
		ArrayList<Dog> dog_array; 
		int name_idx = 1;
		
		dog_array = new ArrayList<Dog>();
		
		for(int i = 0; i < 5; i++) {
			// dog_array[i] = new Dog("퍼피"+name_idx, "시고르자브종");
			Dog dog = new Dog("퍼피"+name_idx, "시고르자브종");
			dog_array.add(dog);
			name_idx++;
		}
		
		for(Dog dog_dog: dog_array) {
			System.out.println(dog_dog.showDogInfo());
		}
		
	}

}
