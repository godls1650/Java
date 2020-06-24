package project.day0622;

import java.util.Random;
import java.util.Scanner;

/*	랜덤 값 (의사 난수 추출) 
 * 
 *  1. Math.random
 *     --> (int)(Math.random() * n) % range + minimum
 *     
 *  2. Random rd
 *     rd.nextInt(Range) + Minimum;
 *     
 *     user변수는 사용자 입력을 이용해서 가위 (1), 바위(2) , 보자기(3) 을 입력받는다.
 *     com 변수는 랜덤 함수를 사용해서  1 ~ 3 중 하나의 값을 랜덤하게 입력받는다.
 *     
 *     가위바위보 결과를 출력하는 프로그램 작성
 * 
 */
public class MainApp_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int UsrNumber = 0, ComNumber = 0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("1.가위   2.바위   3.보자기 \nselect > ");
		UsrNumber = sc.nextInt();
		ComNumber = rd.nextInt(3)+1;
		/*u\c 1  2  3
		 *  1 D  L  W				
		 *  2 W  D  L
		 *  3 L  W  D
		 * 
		 */
		System.out.print("User : ");
		if(UsrNumber == 1) System.out.print("가위");
		else if(UsrNumber == 2) System.out.print("바위");
		else System.out.print("보자기");
		
		System.out.print("  VS COM : ");
		if(ComNumber == 1) System.out.println("가위");
		else if(ComNumber == 2) System.out.println("바위");
		else System.out.println("보자기");
		
		
		int result = UsrNumber - ComNumber;
		switch(result) {
		case 0 : System.out.println("Draw"); break;
		case -1 : case 2: System.out.println("Lose"); break;
		case -2 : case 1: System.out.println("Win"); break;
		
		
		
		}
	}

}





