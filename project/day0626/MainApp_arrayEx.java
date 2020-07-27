package project.day0626;

import java.util.Random;
import java.util.Scanner;

public class MainApp_arrayEx {
/*���� �߱� */
	final static int Size = 3;
	final static int Strike = 0;
	final static int Ball = 1;
	final static int Out = 2;
	final static int Decimal = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []Quest = new int [Size]; // ������
		int [] SBO = new int [Size]; // ��� ������ �迭 
		int [] AsArr = new int [Size]; // Answer�� �����ؼ� ������ �迭 ����		
		int Answer = 0;
		boolean bSame = false;
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		/*---------------Random �� ����Ǵ� �κ�  : Game 1ȸ �� �ѹ� ����  ------------*/
		for(int i = 0; i < Size; i++) {
			Quest[i] = rd.nextInt(Decimal - 1) + 1; 		// 1 ~ 9 ���� ���� ���� �Է� 
			for(int k = 0; k < i; k++) { 		// k�� 0 ~ i�� �� �̸� ���� �ݺ��ϸ鼭
				if(Quest[k] == Quest[i]) { 		// Quest�� K��° �����Ϳ� Quest I��° �����͸� ���ؼ� 
					i--;						// ���ٸ� i�� ���� 
					break;						// �ݺ� �ߴ�   --> ���� i ���� �ٽ� ���� �ϸ鼭 ���� �ε����� 
				}								// 1 ~ 9 ���̰��� �ٽ� �Է�
			}
		}										// I �ݺ����� �ߴܵǸ�  3���� �ٸ� ���ڰ� �迭�� �����ȴ�.
		
		for(int i = 0; i < Size; i++)
			System.out.print(Quest[i]);			// enter ���� �迭�� ������ 3�� ���ڸ� ��� ( ���� )
		System.out.println();    				// 179, 284, 943 , ...etc �� 3�ڸ� ���ڷ� ��� 
		/*---------------Random �� ����Ǵ� �κ�  : Game 1ȸ �� �ѹ� ����  ------------*/
		
		
		/*---------------------����ڰ� �Է��ϰ� ó���Ǵ� �κ�----------------------*/
		
		while(true){
		
			System.out.print("3�ڸ��� �� �ڸ��� ���ڰ� �ٸ� ���� �Է��ϼ��� > ");
			Answer = sc.nextInt(); //Answer 3�ڸ� ���� �Է�
			
			for(int i = Size-1; i >= 0; i--) {
				AsArr[i] = Answer % Decimal; // Answer�� 1�� �ڸ� ���� AsArr[2]�� ���� 
				Answer /= Decimal;           // Answer�� �ڸ��� �ϳ��� ��
			}
			
			for(int i = 0; i < Size; i++) {
				if(AsArr[i] == Quest[i]) {
					SBO[Strike]++;
					bSame = true;
				}
				for(int k = 0; k < Size; k++) {
					if(i == k) continue; // �ǳʶٰ� ����� 
					else if(AsArr[i] == Quest[k]) {
							SBO[Ball] ++;
							bSame = true;
							break;
					}
				}
				
				if(!bSame) SBO[Out]++;
				bSame = false;
			}
			
			System.out.println("Strike : " + SBO[Strike]);
			System.out.println(" ball  : " + SBO[Ball]);
			System.out.println("  out  : " + SBO[Out]);
			
			if(SBO[Strike] == 3) break;
			else SBO[Strike] = SBO[Ball] = SBO[Out] = 0;
		}
	}
		
		

	public static void HomeWork1() {
		String [] result = {"draw", "lose", "win",
				 "win", "draw", "lose", 
				 "lose", "win","draw"};
		
		String [] res = {"����", "����", "���ڱ�"};
		int com = (int)(Math.random()*100) % 3; // 0 ~ 2
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ����  2. ����  3. ���ڱ�   \n select > ");
		int user = sc.nextInt();
		user -=1 ; // 0  ~ 2
		
		
		System.out.println("user" + res[user] + "vs " + res[com] + ": com");
		// result -> 0,1,2,3,4,5,6,7,8,9;
		int index = user * 3 + com; // 1 * 3  + 1 --> 4  result[4]
		
		System.out.println(result[index]);
				
	}

}
