package chap5;

class Animal {
	String name2;

	public void setName(String name2) {
		this.name2 = name2;
	}

}


public class Chap5_2 {

	public static void main(String[] args) {
		Animal cat2 = new Animal();
		Animal dog2 = new Animal();
		Animal horse2 = new Animal();
		
		cat2.setName("bobby");
		System.out.println(cat2.name2);

		dog2.setName("happy");
		
		System.out.println(dog2.name2);
		
	}

}
