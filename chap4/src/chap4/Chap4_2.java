package chap4;

public class Chap4_2 {
 
	public static void main(String[] args) {
		int month2 = 8;
		String monthString2 = "";
		switch (month2) {
			case 1: monthString2 = "January";
					break;
			case 2:  monthString2 = "February";
	        		break;
			case 3:  monthString2 = "March";
			        break;
			case 4:  monthString2 = "April";
			        break;
			case 5:  monthString2 = "May";
			        break;
			case 6:  monthString2 = "June";
			        break;
			case 7:  monthString2 = "July";
			        break;
			case 8:  monthString2 = "August";
			        break;
			case 9:  monthString2 = "September";
			        break;
			case 10: monthString2 = "October";
			        break;
			case 11: monthString2 = "November";
			        break;
			case 12: monthString2 = "December";
			        break;
			default: monthString2 = "Invalid month";
					break;
		}
		System.out.println(monthString2);
	}
}
