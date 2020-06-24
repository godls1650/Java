package project.day0615;

import java.util.Scanner;

/* 데이터의 종류 
 *  변수 (variable) : 메모리 공간을 할당시켜서 원하는 상수 중 하나를 저장하는 [공간]을 만든다.
 *  상수 (Constant) : 일반적인 값으로 하나의 문자가 하나의 값을 갖는 형태
 *                    'A' : 문자 A는 컴퓨터 내부에서 문자 'A' 로만 취급한다.
 *                    10  : 숫자 10은 정수형으로 크기가 10인 값으로만 취급된다.
 *                     =====> 표기 그대로가 하나의 값을 나타내는 상수를 
 *                              Literal  (리터럴 상수) 라고 한다.
 *                    --> PI(파이) / e(자연상수) / Ln (자연로그) 등등 ??? 
 *  
 *  연산자 (Operator)
 * 피연산자 (Operand)
 *  단항연산자 : 타입변환연산자 : 캐스팅연산자    (타입명)피연산자
 *  이항연산자
 *  삼항연산자
 * 
 *   - 대입 연산자 :   
 */
public class MainApp {
	final static double PI = 3.141592;// PI라는 변수를 생성 
	final static int MAX_VALUE	 = 100;
	final static int MIN_VALUE	 = 0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		int result = 0;
		result = x + y;
		
		System.out.println((x + y));
		
		System.out.println("x : " + x);
		int money = 123650;
		System.out.println("금액은 " + money / 1000 +","+ money %1000 + "원입니다.");
		
		
		System.out.println("10 을 3 으로 나눈 몫 : " + (10 / 3));
		System.out.println("10 을 3 으로 나눈 나머지 : " + (10 % 3));
		System.out.println(10.0 / 3);
		System.out.println((double)10 / 3);
		System.out.println((double)(10 / 3));
		
		MoneyChecker();
		//GetCircleRound();
		//GetCircleAreaEx();
		// 반지름을 저장할 변수를 선언	
		// 원넓이의 계산 결과를 저장할 변수 선언
		// 키보드로 입력할 스캐너 선언
		//입력 전 정보 출력
		// 스캐너를 이용해서 반지름 입력
		// 결과 변수에 원 넓이 계산 결과 저장
		// 결과 출력
	}
	
	public static void MoneyChecker() {
		int kor_money = 50000;
		int MyMoney = 0;
		int number = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요 > ");
		MyMoney = sc.nextInt();
		
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 5;
		number += 1;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 2;
		number++;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 5;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 2;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 5;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 2;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 5;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 2;
		
		
		
		
		
		
	}
	
	
	
	
	public static void GetCircleAreaEx() {
		double r = 0.0;		// 반지름을 저장할 변수를 선언	
		double result = 0.0; // 원넓이의 계산 결과를 저장할 변수 선언
		Scanner sc = new Scanner(System.in); // 키보드로 입력할 스캐너 선언
		
		System.out.print("반지름을 입력합니다 > "); //입력 전 정보 출력
		r = sc.nextDouble();  // 스캐너를 이용해서 반지름 입력
		result = r * r * PI;  // 결과 변수에 원 넓이 계산 결과 저장
		
		System.out.println("반지름이 " + r + "인 원의 넓이는 " + result + "입니다."); // 결과 출력
		
	}
	public static void GetCircleRound() {
		double r = 0.0;		
		double result = 0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력합니다 > ");
		r = sc.nextDouble();
		result = 2 * r * PI;
		
		System.out.println("반지름이 " + r + "인 원의 둘레 " + result + "입니다.");
		
	}
	
	
	
	
	
	public static void ValuesEx() {
		boolean bTest = true;
		bTest = false;
		double dData = 0.0;
		float fData = 0.0F;
		long lNumber = 0L;
		char text = '\0';
		
		//PI = 1.2314; // 심볼릭 상수로 사용하고자 하는 메모리는 초기화 이후 변경할 수 없어야 한다.
		int number = 0;
		if(number > MIN_VALUE && number < MAX_VALUE);
	}
	
	

}
