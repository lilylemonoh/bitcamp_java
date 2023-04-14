package chap5;

class Calculator {
     int result2 = 0;

     int add(int num2) {
        result2 += num2;
        return result2;
    }
     int sub(int num2) {
    	 result2 =+ num2;
    	 return result2;
     }
     
}

class Calculator1 {
    static int result2 = 0;

    static int add(int num2) {
        result2 += num2;
        return result2;
    }
}

class Calculator2 {
    static int result2 = 0;

    static int add(int num2) {
        result2 += num2;
        return result2;
    }
}

public class Chap5_1 {

	public static void main(String[] args) {
//		System.out.println(Calculator.add(3));
//	    System.out.println(Calculator.add(4));
      
	    System.out.println(Calculator1.add(3));
        System.out.println(Calculator1.add(4));

        System.out.println(Calculator2.add(3));
        System.out.println(Calculator2.add(7));
	    
        Calculator cal12 = new Calculator(); 
        Calculator cal22 = new Calculator();  
        
        System.out.println(cal12.add(3));
        System.out.println(cal12.add(4));

        System.out.println(cal22.add(3));
        System.out.println(cal22.add(7));

	    
	}

}
