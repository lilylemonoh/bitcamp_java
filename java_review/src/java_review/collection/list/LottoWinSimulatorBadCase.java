package java_review.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoWinSimulatorBadCase {

	public static void main(String[] args) {
		
		List<Integer> lottoWinNumbers = new ArrayList<>();
		Random rn = new Random();
		
		while(lottoWinNumbers.size() < 6) {
			Integer thisTimeGetNumber = rn.nextInt(1, 46);
			if(!lottoWinNumbers.contains(thisTimeGetNumber)) {
				lottoWinNumbers.add(thisTimeGetNumber);  
			}
		}
		
		Collections.sort(lottoWinNumbers);
		
		List<Integer> lottoTryNumbers = new ArrayList<>();
		
		int count = 0;
		
		while(!lottoTryNumbers.equals(lottoWinNumbers)) {
			count++;
			lottoTryNumbers.clear();
			while(lottoTryNumbers.size() < 6) {
				Integer thisTimeGetNumber = rn.nextInt(1, 46);
				if(!lottoTryNumbers.contains(thisTimeGetNumber)) {
					lottoTryNumbers.add(thisTimeGetNumber);
				}
			}
			Collections.sort(lottoTryNumbers);
			System.out.println(lottoTryNumbers);
			System.out.println(lottoWinNumbers);
			System.out.println("--------------");
		}
		System.out.println("당신은" + count + "장의 로또를 사고서 당첨되었습니다.");
	}

}
