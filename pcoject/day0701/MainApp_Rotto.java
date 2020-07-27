package pcoject.day0701;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainApp_Rotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 0;
		int length = 0;
		int [][]myLotto;
		int [] ResultLotto = new int [7];// 보너스 번호 포함 7개 숫자
		int Cnt = 0;
		boolean 인생역전 = false;
		int money = 0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		/*금액을 입력받는다. */
		
		while(!인생역전) {
		for(int i = 0; i < ResultLotto.length; i++) {
			ResultLotto[i] = rd.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if (ResultLotto[i] == ResultLotto[j]) {
					i--;
					break;
				}
			}
		}
		
		
		do {
			//System.out.print("금액 투입 > ");
			price = 5000;/*sc.nextInt();*/
		}while(price >5000);
		/* 자동으로 생성할 로또 개수를 계산 */
		
		length = price / 1000;
		
		/* 자동 생성할 로또 번호를 저장할 배열을 할당한다 */
		myLotto = new int[length][6];
		
		// 각 행에 1~ 45까지의 난수를 입력한다. 단 각행의 내부엔 중복값이 없다.
		for(int i =0; i < length;i++) {
			LINEINPUT:
			for(int j = 0; j < 6; j++) {
								 
				myLotto[i][j] = (int)(Math.random()*45) + 1;//rd.nextInt(45) + 1; // 1 ~ 45 값을 저장 
				/*중복이 있는지 확인*/
				SAMESEARCH:
				for(int k = 0; k < j; k++) {
					if(myLotto[i][j] == myLotto[i][k]) {
						j--;
						break SAMESEARCH;
					}
				} //SAMESEARCH END
			}
			//LININPUT END
		}
		// 전체 반복 중단
		
		String [] alpha = {"A","B","C","D","E"};
		for(int i = 0 ; i < length; i++) {
			System.out.printf("자동 %s > ", alpha[i]);
			for(int j = 0; j < 6; j++) {
				System.out.printf("%2d ",myLotto[i][j]);	
			}
			System.out.println();
		}
		
		//for(int i = 0; i < length; i++) System.out.println(Arrays.toString(myLotto[i])) ;
		//for( int [] i : myLotto) System.out.println(Arrays.toString(i));
		
		System.out.printf("<%d 회차 결과>\n", ++Cnt);
		
		for(int i = 0; i < 6;i++) {
			System.out.printf("%2d ",ResultLotto[i]);
		}
		System.out.println("+ "+ResultLotto[6]);
		
		int []LCnt = new int [length];
		//ResultLotto 배열과 myLotto의 각 행에 입력된 값이 같은지 확인 (나열 순서에 상관 없이)
		// myLotto[0]
		for(int i  = 0; i < length; i++) {
			for(int j = 0; j < 6;j++) {
				for(int k = 0; k < 6; k++) {
					if(ResultLotto[j] == myLotto[i][k]) {
						LCnt[i]++;
					}
				}
			}
		}
		boolean bBean = false;
		for(int i = 0 ; i < length; i++) {
			//System.out.printf("자동 %s > %d\n", alpha[i], LCnt[i]);
			switch(LCnt[i]) {
			case 6: System.out.println("★☆★☆★☆★☆★☆★1등☆★☆★☆★☆★☆★☆");
				money += 2144799638;
			인생역전 = true;break;
			case 5:
				for(int j = 0; j < 6;j++) {
					if(myLotto[i][j] == ResultLotto[6]) {
						System.out.println("★☆★☆★☆★☆★2등☆★☆★☆★☆★☆");
						bBean = true;
						money += 76056725;
						break;
					}
				}
				if(!bBean)System.out.println("★☆★☆★☆★3등☆★☆★☆★☆");
				money += 15881711;
				break;
			case 4: System.out.println("★☆★☆4등 : 50,000원★☆★☆");
				money += 50000;
			break;
			case 3: System.out.println("5등 : 5,000원");
			money += 5000;
			break;
			default :
				//System.out.println("꽝");
				break;
			}
			
		}
		
		}
		System.out.println("총 수령액 : "+ money);
		System.out.println("비용 : "+ Cnt * 5000);
		
	}

}











