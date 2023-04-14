package day05;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
  
    	Scanner scan = new Scanner(System.in);
    	
    	int[] iArr = new int[9];
    	for(int i = 0; i < 9; i++) {
    		iArr[i] = scan.nextInt();
    	} // 배열에 초기화
    	int max = iArr[0];
    	for(int i = 1; i <= 8; i++) {
    		if (max < iArr[i]) {
    			max = iArr[i];
    		}
    	}
    	System.out.println(max);
    	
    	for(int i = 0; i < 9; i++) {
    		if (iArr[i] == max) {
    			System.out.println(i + 1);
    		}
    	}
    	
    	
    	
    }
}