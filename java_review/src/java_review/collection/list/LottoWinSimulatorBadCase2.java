package java_review.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoWinSimulatorBadCase2 {

	public static void main(String[] args) {
		List<Integer> powerWinNumbers = new ArrayList<>();
		Random rn = new Random();
		
		while(powerWinNumbers.size() < 5) {
			Integer thisTimeGetNumber = rn.nextInt(1, 71);
			if(!powerWinNumbers.contains(thisTimeGetNumber)) {
				powerWinNumbers.add(thisTimeGetNumber);
			}
		}
		Collections.sort(powerWinNumbers);
		Integer powerWinNumber = rn.nextInt(1, 27);
		List<Integer> powerTryNumbers = new ArrayList<>();
		Integer powerTryNumber = 0;
		int count = 0;
		
		while(!(powerTryNumbers.equals(powerWinNumbers) && 
				powerWinNumber.equals(powerTryNumber))); {
					count ++;
					powerTryNumbers.clear();
					while(powerTryNumbers.size() < 5) {
						Integer thisTimeGetNumber = rn.nextInt(1, 71);
						if(!powerTryNumbers.contains(thisTimeGetNumber)) {
							powerTryNumbers.add(thisTimeGetNumber);
						}
					}
					powerTryNumber = rn.nextInt(1, 27);
					Collections.sort(powerTryNumbers);
				}

		System.out.println("당신은 " + count + "장의 로또를 사고서야 당첨됐습니다.");
		System.out.println("투자 금액 : " + count * 1000 + "원");
	}

}
