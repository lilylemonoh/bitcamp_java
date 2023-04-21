package collection.list;

import java.util.List;

public class LottoWinSimulatorMain {

	public static void main(String[] args) {
		// 로또 시뮬레이터 클래스의 기능을 실행만 합니다.
		// (프로그램을 공급한다는 관점에서) 갑자기 로또 시뮬레이터 -> 파워볼 시뮬레이터로 바뀌더라도 메인 부분의 메서드와 객체는 변경되면 안 된다. 
		
		LottoWinSimulatorGoodCase ls = new LottoWinSimulatorGoodCase();
		
		List<Integer> lottoWinNumbers = ls.getLottoNumbers();
		
		List<Integer> lottoGetNumbers = ls.getLottoNumbers();
		
		ls.tryWinLoop(lottoWinNumbers, lottoGetNumbers);
		
		System.out.println("반복 횟수 : " + ls.getCount());

	}

}
