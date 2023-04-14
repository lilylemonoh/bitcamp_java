package chap5;

//class Animal {
//	String name2;
//	
//	void setName(String name2) {
//		this.name2 = name2;
//	}
//}

class Dog extends Animal {
	void sleep() {
		System.out.println(this.name2 + " zzz");
	}
}

class HouseDog extends Dog {
    void sleep() {
        System.out.println(this.name2 + " zzz in house");
    }
    void sleep(int hour2) {
        System.out.println(this.name2+" zzz in house for " + hour2 + " hours");
    } 
}




public class Chap5_5 {

	public static void main(String[] args) {

		Dog dog2 = new Dog();
		dog2.setName("poppy");
		System.out.println(dog2.name2);
		dog2.sleep();
		
        HouseDog houseDog2 = new HouseDog();
        houseDog2.setName("happy");
        houseDog2.sleep();  
        houseDog2.sleep(3);  
        
		
		
		
		
		
		
	}

}
