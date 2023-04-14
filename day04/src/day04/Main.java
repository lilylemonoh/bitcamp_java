package day04;

//import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    	
//        Scanner scan = new Scanner(System.in);
        
//        int year = scan.nextInt();
  
    	int sum=0;
    	int result=0;
    	
    	for (int i=1; i <= 10; i++) {
    		for(int j=1; j <= i; j++) {
    			sum += j;
    	} result += sum;
    	
    	}//for 끝
    		System.out.println(sum);
    	

        }

   
    }
//}


