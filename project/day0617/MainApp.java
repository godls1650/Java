package project.day0617;

import java.util.Scanner;

public class MainApp {
	/* 비트 연산자 : 저장된 데이터의 값을 bit단위로 처리하는 연산자.
	 *    - 비트 논리 연산자 
	 *        A & B : 저장된 비트의 최소 값 부터 가장 큰 비트까지 and연산 한다. (A,B의 비트값이 1이면 결과가 1)
	 *        A | B : 저장된 비트의 최소 값 부터 가장 큰 비트까지  or연산 한다. (A또는B의 비트값이 1이면 결과가 1)
	 *        A ^ B : 저장된 비트의 최소 값 부터 가장 큰 비트까지  xor연산 한다.(A와B의 비트값이 다르면 결과가 1)
	 *         ~ A  : A 변수에 저장된 비트값을 반전시킨다. (1의 보수 연산과 동일)
	 *      - 비트 시프트 연산자
	 *        A << B  A를 B비트 왼쪽으로 밀어낸다.		( <<----   )
	 * 		  A >> B  A를 B비트 오른쪽으로 밀어낸다.   (  ----->> )
	 * 비트 & 연산의 활용 : MASK 기법 
	 *  서브넷 마스크 255.255.255.0
	 */
	final static int Locate_Deajeon = 0xF3;
	final static int Locate_Seoul = 0xF2;
	public static void main(String[] args) {
		/* 파란 컵에 있는 20ml 의 용액과   빨간 컵에 있는 10ml 의 용액을 섞지 않고 옮겨 담는다.*/
		int blueCup = 20;
		int redCup = 10;
		int emptyCup = 0;
		
		/*임시 변수를 이용해서 데이터를 맞교환 하는 방식 : Data Swap*/
		
		System.out.println("10 << 1 : " + (10 << 1));
		System.out.println("10 << 2 : " + (10 << 2));
		System.out.println("10 >> 1 : " + (10 >> 1));
		
		int EmployeeCode  = 0x00F34232;
		System.out.println("직원 코드 : " + EmployeeCode);
		int Mask = 0x00FF0000;
		int result = EmployeeCode & Mask;
		System.out.println("직원코드에서 빼낸거 : " + result);
		result = result >> 16;
		System.out.println("직원코드에서 빼낸거에 자리수를 없앰 : " + result);
		
		
		
		
		System.out.println("파란 컵의 용액 : " + blueCup + "  빨간 컵의 용액 : " + redCup );
		emptyCup = blueCup;
		blueCup = redCup;
		redCup = emptyCup;
		System.out.println("파란 컵의 용액 : " + blueCup + "  빨간 컵의 용액 : " + redCup );
		
		blueCup ^= redCup;
		redCup ^= blueCup;
		blueCup ^= redCup;
		
		System.out.println("파란 컵의 용액 : " + blueCup + "  빨간 컵의 용액 : " + redCup );
	}
	
	
	
	/* 비교 연산자  , 논리 연산자 
	 *  비교 연산자 --> 수치 비교
	 *   x < 160
	 *  초과 ( A > B)   미만 (A < B)   이상 (A >= B)     이하 (A <= B) 
	 *  같다 (A == B)     다르다(A != B)
	 */
	public static void LogicEx() {
		int x = 0;
		x = 170;
		boolean bSmall = false;
		bSmall = x < 160;
		System.out.println(x + " < 160 --> " + bSmall);
		x = 150;
		bSmall = x < 160;
		System.out.println(x + " < 160 --> " + bSmall);
		
		
		int age = 23;
		boolean bHealthy = true;
		boolean HogukYoRam = false;
		/* 
		 * 20세 이상의 신체 건강한 남성이면 
		 *  가야 합니다.
		 */
		
		HogukYoRam = (age >= 20 && age <34)  && bHealthy;
		
		System.out.println("가야됩니까? " + HogukYoRam);
		System.out.println("NO!!!!!" + !HogukYoRam);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
	
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		
		/* 논리 연산자 : 두개의 boolean결과를 갖는 수식 또는 값을 
		 *            합산하는 연산 
		 * 
		 * 신체가 건강하다 그리고 20세 이상이다.   ---> AND 연산  &&
		 * 나이가 7세 이하 이다. 또는 70세 이상이다. -> OR 연산    ||
		 * 
		 *  수식의 결과를 부정한다.  ---> NOT 연산 			!   
		 */
		
		/*	true : not Zero
		 *  false : Zero */
		
		
	} 
	public static void ArithmeticEx(){
		//calcScore();
		/* 값을 1씩 증가 시킨다.  x += 1 --> "+= 1" => ++
		 * 값을 1씩 감소 시킨다.  x -= 1 --> "-= 1" => --
		 * 
		 */
		int number = 10;
		System.out.println("number ++ : " + --number); // 9
		System.out.println("number ++ : " + number++); //9
		System.out.println("number ++ : " + ++number);//11
		System.out.println("number ++ : " + number);//11
		System.out.println("number ++ : " + number--);//11
		System.out.println("number ++ : " + number--);//10
		//9
		
		number++;
		System.out.println(number);
		++number;
		System.out.println(number);
		 
		/*	number 는 println에 매개변수로 사용된다.
		 *  ++ 의 피연산자 
		 * 
		 *  증감연산자는 연산자가 피연산자의 뒤에 있는 경우 다른 사용처에 비해 나중에 처리된다..
		 *  증감연산자는 연산자가 피연산자의 앞에 있는 경우 다른 사용처에 비해 먼저 처리된다..
		 */
		System.out.println("number : " + number);
		int x = 10;
		int y = 5;
		int z = 0;
		
		z = x++ + ++y;
	}
	public static void calcScore() {
		int Kor_Score = 0;
		int Eng_Score = 0;
		int Math_Score = 0;
		int Total_Score = 0;
		double Average_Score = 0.0;
		/* 복합 대입 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 > ");
		Kor_Score = sc.nextInt();
		Total_Score  = Total_Score + Kor_Score;
		
		System.out.print("영어 점수 > ");
		Eng_Score = sc.nextInt();
		Total_Score  += Eng_Score;
		
		
		System.out.print("수학 점수 > ");
		Math_Score = sc.nextInt();
		Total_Score = Total_Score + Math_Score;
		
		Average_Score = (double)Total_Score / 3; // double = 83.0  83.333333333
		
		System.out.println("총점 : "+ Total_Score+ "\n평균 : "+ Average_Score);
		
		
		
	}
	public static void Example01() {
		// TODO Auto-generated method stub
		int number = 10;
		byte oneByteInt = 10;
		short twoByteInt = 10;
		long BigSizeInt = 10L;
		number = 100;
		int x = 0, y = 0, z = 0;
		
		
		double dData = 3.16315;
		float fData = 13.4362f;
		/*number = 316.123;// Type MisMatch
		 * */
		/*	oneByteInt = BigSizeInt; Error : 1Byte 공간에 8Byte 크기의 값을 입력시도 해서
		 * 									OverFlow
		 * 
		 */
		
		x = y = z = 100; 
		
		twoByteInt = oneByteInt; // 2Byte <- 1Byte
		number = twoByteInt;    // 4Byte <- 2Byte
		BigSizeInt = number;    // 8Byte <- 4Byte
		dData = fData;
		
		System.out.println(number);
		/* 
		 * 사칙 연산 ( + , - , *  , / , % ) 
		 */
		
		x = 100; 
		y = 3;
		
		/* - : 이항연산자 -> 사칙연산 뺄셈
		 *   : 단항연산자 -> 음수 연산자 
		 */
		z = - x + y;
		
		x = x + y;
		
		System.out.println(z);
		
		/* 국어 영어 수학 점수를 입력하고  총점과 평균점수를 구한다.*/
		
		
	}
	
}
