package java_review.thread.thread2;

public class Me {

	public static void main(String[] args) {
		// 프린터기를 켜는 건 사람만 할 수 있음
		Runnable prt = new Printer();
		Runnable arm = new AlarmMachine();
		
		Thread prtThread = new Thread(prt);
		Thread armThread = new Thread(arm);
		
		System.out.println("저녁준비를 합니다.");
		System.out.println("프린터 명령이 내려왔습니다.");
		prtThread.start(); // 프린터기 전원 on
		armThread.start(); // 알람 전원 on
		try {
			System.out.println("밥을 합니다");
			Thread.sleep(3000);
			System.out.println("밥하기..");
			Thread.sleep(3000);
			System.out.println("밥 완성!");
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	System.out.println("배식하고 설거지까지 완료!");

	}

}
