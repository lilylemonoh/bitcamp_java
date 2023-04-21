package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListLottoQuiz {

	public static void main(String[] args) {
		/*
		 * 1. Lotto복권은 1~45범위의 숫자중 6개를 뽑아 추첨하는 복권입니다.

			List<Integer> 타입 변수에 구현체를 대입해주시고
			해당 변수에 중복 없이 6개의 번호가 들어가도록 해 주세요.

			2. 1번 과제를 마친 분들은 당첨될때까지 다시 번호를 무작위로 계속 뽑는 코드를 
			작성해서 몇 번 만에 로또복권이 당첨되는지 확인하는 시뮬레이션 코드를 만들어주세요.

	hint : .equals()로 배열끼리 비교할 때는 배열 내부 요소의 순서와 자료 모두를 비교합니다
	ex) [1, 2, 3] 과 [1, 2, 3]은 true로 비교되지만
	    [1, 2, 3]과 [1, 3, 2]는 false로 비교됩니다.
		 */

		//1. 
		List<Integer> list = new ArrayList<>();

		while(list.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			if(list.contains(num)) {
				continue;
			} else {
			list.add(num);
			}
		}
		Collections.sort(list);
		System.out.println("로또 당첨 번호 : " + list);
		
		
		
		List<Integer> lottoTry = new ArrayList<>();
		
		int count = 0;
		boolean flag = true;
		
		while(flag) {
		
		while(lottoTry.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			if(lottoTry.contains(num)) {
				continue;
			} else {
				lottoTry.add(num);
			}
		}
		Collections.sort(lottoTry);
		System.out.println(lottoTry);
		count++;
		System.out.println(count);		
//		list와 lottoTry가 일치하는지 확인
		if(list.containsAll(lottoTry)) {
				System.out.println("로또에 당첨되었습니다.");
				flag = false;
			}else {
				lottoTry.clear();
		}		
		}
		
		System.out.println("로또 구입 횟수 : " + count + "번");
		//1000만 번을 사도 당첨이 안돼서.. 뭔가 잘못짠 것 같다
	
	}

}
