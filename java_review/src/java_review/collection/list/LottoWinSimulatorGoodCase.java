package java_review.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoWinSimulatorGoodCase {

		private int count;
		
		public List<Integer> getLottoNumbers(){
			List<Integer> lottoNumbers = new ArrayList<>();
			Random rn = new Random();
			
			while(lottoNumbers.size() < 6) {
				Integer getNumber = rn.nextInt(1, 46);
				if(!lottoNumbers.contains(getNumber)) {
					lottoNumbers.add(getNumber);
				}
			}
			Collections.sort(lottoNumbers);
			return lottoNumbers;
		}

		public int getCount() {
			return this.count;
		}
		
		public void addCount() {
			this.count++;
		}
	
		public void tryWinLoop(List<Integer> winNumbers, 
				List<Integer> getNumbers) 
		{while(!winNumbers.equals(getNumbers)) {
			getNumbers = getLottoNumbers();
			addCount();
		}
			
		}

}
