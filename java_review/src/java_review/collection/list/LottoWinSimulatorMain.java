package java_review.collection.list;

import java.util.List;

public class LottoWinSimulatorMain {

	public static void main(String[] args) {
		LottoWinSimulatorGoodCase ls = new LottoWinSimulatorGoodCase();
		
		List<Integer> lottoWinNumbers = ls.getLottoNumbers();
		
		List<Integer> lottoGetNumbers = ls.getLottoNumbers();
		
		ls.tryWinLoop(lottoWinNumbers, lottoGetNumbers);
		
		System.out.println("반복 횟수 : " + ls.getCount());

	}

}
