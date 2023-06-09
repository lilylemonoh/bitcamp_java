package example.threadTest;

public class ThreadNotSafety extends Thread {
	
	static int share;
	
	public static void main(String[] args) {
		ThreadNotSafety t1 = new ThreadNotSafety();
		ThreadNotSafety t2 = new ThreadNotSafety();
		
		t1.start();
		t2.start();

	}
	
	public void run() {
		for(int count = 0; count < 10; count++) {
			System.out.println(share++);
			
			try {sleep(10); }
			catch (InterruptedException e) {}
		}
	}
	

}
