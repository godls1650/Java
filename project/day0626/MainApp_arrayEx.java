package project.day0626;

import java.util.Random;
import java.util.Scanner;

public class MainApp_arrayEx {
/*숫자 야구 */
	final static int Size = 3;
	final static int Strike = 0;
	final static int Ball = 1;
	final static int Out = 2;
	final static int Decimal = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []Quest = new int [Size]; // 랜덤값
		int [] SBO = new int [Size]; // 결과 나열한 배열 
		int [] AsArr = new int [Size]; // Answer를 분할해서 저장할 배열 선언		
		int Answer = 0;
		boolean bSame = false;
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		/*---------------Random 이 저장되는 부분  : Game 1회 당 한번 실행  ------------*/
		for(int i = 0; i < Size; i++) {
			Quest[i] = rd.nextInt(Decimal - 1) + 1; 		// 1 ~ 9 사이 숫자 값을 입력 
			for(int k = 0; k < i; k++) { 		// k는 0 ~ i의 값 미만 까지 반복하면서
				if(Quest[k] == Quest[i]) { 		// Quest의 K번째 데이터와 Quest I번째 데이터를 비교해서 
					i--;						// 같다면 i를 감소 
					break;						// 반복 중단   --> 이후 i 값이 다시 증가 하면서 기존 인덱스에 
				}								// 1 ~ 9 사이값을 다시 입력
			}
		}										// I 반복문이 중단되면  3개의 다른 숫자가 배열에 나열된다.
		
		for(int i = 0; i < Size; i++)
			System.out.print(Quest[i]);			// enter 없이 배열에 저장한 3개 숫자를 출력 ( 나열 )
		System.out.println();    				// 179, 284, 943 , ...etc 등 3자리 숫자로 출력 
		/*---------------Random 이 저장되는 부분  : Game 1회 당 한번 실행  ------------*/
		
		
		/*---------------------사용자가 입력하고 처리되는 부분----------------------*/
		
		while(true){
		
			System.out.print("3자리의 각 자리의 숫자가 다른 값을 입력하세요 > ");
			Answer = sc.nextInt(); //Answer 3자리 값을 입력
			
			for(int i = Size-1; i >= 0; i--) {
				AsArr[i] = Answer % Decimal; // Answer의 1의 자리 값을 AsArr[2]에 저장 
				Answer /= Decimal;           // Answer의 자리수 하나를 뺌
			}
			
			for(int i = 0; i < Size; i++) {
				if(AsArr[i] == Quest[i]) {
					SBO[Strike]++;
					bSame = true;
				}
				for(int k = 0; k < Size; k++) {
					if(i == k) continue; // 건너뛰고 재실행 
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
		
		String [] res = {"가위", "바위", "보자기"};
		int com = (int)(Math.random()*100) % 3; // 0 ~ 2
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 가위  2. 바위  3. 보자기   \n select > ");
		int user = sc.nextInt();
		user -=1 ; // 0  ~ 2
		
		
		System.out.println("user" + res[user] + "vs " + res[com] + ": com");
		// result -> 0,1,2,3,4,5,6,7,8,9;
		int index = user * 3 + com; // 1 * 3  + 1 --> 4  result[4]
		
		System.out.println(result[index]);
				
	}

}
