package silver.five;

import java.util.Scanner;

public class Num2942_ {

	public static void main(String[] args) {
		// 스캐너 생성, string 입력받기, length로 길이 입력 후 
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
	
		String minusdz = word.replaceAll("dz=", "d");
		String minusequal = minusdz.replaceAll("=", "");
		String minusdash = minusequal.replaceAll("-", "");
		String minuslj = minusdash.replaceAll("lj", "l");
		String minusnj = minuslj.replaceAll("nj", "n");
		
		System.out.println(minusnj.length());
			
		scan.close();
	}

}
