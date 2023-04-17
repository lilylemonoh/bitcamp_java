package JavaJungSuk;

public class Jj209_6_5 {

	static double getDistance(int x, int y, int x1, int y1) {
		int xLength = 0;
		int yLength = 0;
		
		if(x > x1) 
			xLength = x - x1;
		 
		xLength = x1 - x;
		
		if(y > y1) 
			yLength = y - y1;
		
		yLength = y1 - y;
		
		double a = Math.sqrt((double)xLength + yLength);
		return a ;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getDistance(1, 1, 2, 2));

	}

}
