package doIt.chapter_7;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[2];
		Dog dog1 = new Dog();
		dog1.setName("초코");
		dog1.setType("푸들");
		
		Dog dog2 = new Dog();
		dog2.setName("참지않기");
		dog2.setType("말티즈");
		
		dogs[0] = dog1;
		dogs[1] = dog2;
		
		for(int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
		

	}

}
