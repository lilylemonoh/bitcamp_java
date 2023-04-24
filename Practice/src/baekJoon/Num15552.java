package baekJoon;

import java.util.Scanner;

public class Num15552 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	int T = scan.nextInt(); //5

    	
    	int[][] Arr = new int[T][2];
    	    	
    	int j;
    	int i;
    	int sum = 0;
    	
    		for(i = 0; i < T; i++) { // 0 1 2 3 4
    			for(j = 0; j < 2; j++) { // 0 1
    				Arr[i][j] = scan.nextInt();
   		   } //내부 for문 끝
    	}//외부 for문 끝 //for문에서는 받아서 저장만 했음
    		
    		int m = 0;
    		for(int k = 0; k < T; k++) {
    	System.out.println(Arr[k][m]+Arr[k][m+1]);
    		}

	}

}
