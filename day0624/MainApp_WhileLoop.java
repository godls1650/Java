package project.day0624;

import java.util.Scanner;

/* 반복제어문 
 *  일정 구간( 블록) 의 코드를 반복시키는 제어문
 *   - 사용자가 'N' 또는 'n'을 입력하기 전 까지 계속 프로그램을 실행한다.
 *   - 데이터의 첫번째 값 부터 마지막 값 까지 모두 사용한다.
 *   - 무한 반복
 *   - ..etc
 *   
 *   if -> 조건확인 -> 블록 실행 여부를 결정  --> 실행 -> 블록 밖의 라인으로 이동
 *   while -> 조건 확인 블록 실행 여부를 결정 --> 실행 -> 조건 연산으로 이동 -> 조건확인 ->실행 ->...
 * 
 */
public class MainApp_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int x = 0;
		int y = 0;
		double result = 0.0;
		
		int num1 = 0;
		int num2 = 3;
		
		
		
		while(true) {
			//y = 0.0;
			System.out.print("분자를 입력하세요 > ");
			x = sc.nextInt();
			
			
			do{
				System.out.print("분모를 입력하세요 > ");
				y = sc.nextInt();
			}while(y == 0);
			 
			 
			result = (double)x/y;
			//   1/
			//   /0  ==> Infinite -->  Exception  =>  Divide by Zero
			System.out.println(x + "/" + y + "=" + result);
		}
	}

}


/* 

Scanner sc = new Scanner(System.in);
System.out.print("숫자를 입력 하세요 > ");
number = sc.nextInt();

if(number < 0) {
	System.out.print("IF_CONTROL : 음수를 입력했습니다. 재입력 >");
	number = sc.nextInt();
}

while( number < 0 ) {
	System.out.print("while_CONTROL : 음수를 입력했습니다. 재입력 >");
	number = sc.nextInt();
}

		int number2 = 0;
while(number <= 0) {
	System.out.print("while_CONTROL : 음수를 입력했습니다. 재입력 >");
	number = sc.nextInt();
	
	//if(number > 0) break;
}

System.out.println("입력된 숫자 : " + number);

// 0을 제외한 다른값을 입력받는다. 

사용자에게 입력받은 수가 음수라면 다시 입력받게한다.*/




