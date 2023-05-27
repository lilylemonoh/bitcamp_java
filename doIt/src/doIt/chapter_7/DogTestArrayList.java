package doIt.chapter_7;
import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		Dog dog1 = new Dog();
		dog1.setName("초코");
		dog1.setType("푸들");
		
		Dog dog2 = new Dog();
		dog2.setName("참지않기");
		dog2.setType("말티즈");
		
		dogs.add(dog1);
		dogs.add(dog2);
		
		for(Dog dog : dogs) {
		System.out.println(dog.showDogInfo());
		}

	}

}
