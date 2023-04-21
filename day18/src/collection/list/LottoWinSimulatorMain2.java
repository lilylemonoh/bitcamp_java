package collection.list;

import java.util.List;

public class LottoWinSimulatorMain2 {

	public static void main(String[] args) {
		// 로또 시뮬레이터 클래스의 기능을 실행만 합니다.
		// (프로그램을 공급한다는 관점에서) 갑자기 로또 시뮬레이터 -> 파워볼 시뮬레이터로 바뀌더라도 메인 부분의 메서드와 객체는 변경되면 안 된다. 
		
		LottoWinSimulatorGoodCase2 ls = new LottoWinSimulatorGoodCase2();
	
		// 14~17번 라인을 보고 싶지 않다면 LSGC2의 멤버변수로 해당 자료를 선언해도 됩니다. 
		List<Integer> powerWinNumbers = ls.getPowerNumbers();
		Integer powerWinNumber = ls.getPowerNumber();
		List<Integer> powerGetNumbers = ls.getPowerNumbers();
		Integer powerGetNumber = ls.getPowerNumber();
		ls.tryWinLoop(powerWinNumbers, powerGetNumbers, powerWinNumber, powerGetNumber);
		
		System.out.println("반복 횟수 : " + ls.getCount());

	}

}
