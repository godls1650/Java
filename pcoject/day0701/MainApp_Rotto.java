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
		int [] ResultLotto = new int [7];// ���ʽ� ��ȣ ���� 7�� ����
		int Cnt = 0;
		boolean �λ����� = false;
		int money = 0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		/*�ݾ��� �Է¹޴´�. */
		
		while(!�λ�����) {
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
			//System.out.print("�ݾ� ���� > ");
			price = 5000;/*sc.nextInt();*/
		}while(price >5000);
		/* �ڵ����� ������ �ζ� ������ ��� */
		
		length = price / 1000;
		
		/* �ڵ� ������ �ζ� ��ȣ�� ������ �迭�� �Ҵ��Ѵ� */
		myLotto = new int[length][6];
		
		// �� �࿡ 1~ 45������ ������ �Է��Ѵ�. �� ������ ���ο� �ߺ����� ����.
		for(int i =0; i < length;i++) {
			LINEINPUT:
			for(int j = 0; j < 6; j++) {
								 
				myLotto[i][j] = (int)(Math.random()*45) + 1;//rd.nextInt(45) + 1; // 1 ~ 45 ���� ���� 
				/*�ߺ��� �ִ��� Ȯ��*/
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
		// ��ü �ݺ� �ߴ�
		
		String [] alpha = {"A","B","C","D","E"};
		for(int i = 0 ; i < length; i++) {
			System.out.printf("�ڵ� %s > ", alpha[i]);
			for(int j = 0; j < 6; j++) {
				System.out.printf("%2d ",myLotto[i][j]);	
			}
			System.out.println();
		}
		
		//for(int i = 0; i < length; i++) System.out.println(Arrays.toString(myLotto[i])) ;
		//for( int [] i : myLotto) System.out.println(Arrays.toString(i));
		
		System.out.printf("<%d ȸ�� ���>\n", ++Cnt);
		
		for(int i = 0; i < 6;i++) {
			System.out.printf("%2d ",ResultLotto[i]);
		}
		System.out.println("+ "+ResultLotto[6]);
		
		int []LCnt = new int [length];
		//ResultLotto �迭�� myLotto�� �� �࿡ �Էµ� ���� ������ Ȯ�� (���� ������ ��� ����)
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
			//System.out.printf("�ڵ� %s > %d\n", alpha[i], LCnt[i]);
			switch(LCnt[i]) {
			case 6: System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ١�1��١ڡ١ڡ١ڡ١ڡ١ڡ�");
				money += 2144799638;
			�λ����� = true;break;
			case 5:
				for(int j = 0; j < 6;j++) {
					if(myLotto[i][j] == ResultLotto[6]) {
						System.out.println("�ڡ١ڡ١ڡ١ڡ١�2��١ڡ١ڡ١ڡ١ڡ�");
						bBean = true;
						money += 76056725;
						break;
					}
				}
				if(!bBean)System.out.println("�ڡ١ڡ١ڡ١�3��١ڡ١ڡ١ڡ�");
				money += 15881711;
				break;
			case 4: System.out.println("�ڡ١ڡ�4�� : 50,000���ڡ١ڡ�");
				money += 50000;
			break;
			case 3: System.out.println("5�� : 5,000��");
			money += 5000;
			break;
			default :
				//System.out.println("��");
				break;
			}
			
		}
		
		}
		System.out.println("�� ���ɾ� : "+ money);
		System.out.println("��� : "+ Cnt * 5000);
		
	}

}











