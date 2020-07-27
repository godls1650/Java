package project.day0619;

import java.util.Random;
import java.util.Scanner;

/*	삼항 연산자
 *   피연산자가 3개인 연산자 (조건연산자    ?  :  )
 *     A  ? B : C 
 *  --> 두 개의 정수값을 비교해서 큰 숫자를 출력하는 프로그램 작성 
 *  
 *  --> 제어문 : 코드의 진행 방향을 변경(제어) 하는 명령어 
 *  	분기 제어 - 1. boolean 타입 값에 따라서 진행 방향을 구분
 *               2. 정수 값에 따라서 여러 코드블록 중 하나를 실행 
 *               
 *     boolean 값으로 분기를 나누는 제어문 : if()문 
 *     
 *     [제어 명령어] ([제어의 기준값])
 *     {
 *     	제어에 귀속된 코드 
 *     }
 *     
 *     if 구문에서 false 값이 결과 인  경우
 *     ---> 바로 위의 명령어 구문이 if 
 *     1. else if 
 *     2. else 
 *     
 *     if( A )  { B  } else { C }
 *     
 *     만약 A라면 B이고 그 외에 경우는 C 이다 .
 *     
 *     if( A )  { B  } else if(C) { D } else if ..... }  else { Z }
 *     
 *    	만약 A 라면 B이고 그 외의 경우 중 C 라면 D 이고 그 외의 경우 중 ......
 *      그외의 경우 Z 이다.
 *      
 *      if  else if   else 구문을 이용해서   
 *     입력한 성적에 따라서 
 *     
 *     100 ~ 90 까지는 A를 출력
 *     89 ~ 80 까지는 B를 출력
 *     79 ~ 70 까지는 C를 출력
 *     69 ~ 60 까지는 D를 출력
 *     60 미만은 F를 출력
 */
public class MainApp {
	public static int func() {
		
		return 10;
	}
	public static void main(String[] args) {
		int Score = func();
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt()+"를 입력했습니다.");
		System.out.print("성적을 입력하세요 > ");
		Score = sc.nextInt();
		String Grade = "";
		if(Score > 100) {
			System.out.println("잘못 입력하였습니다.");
			return ;
		}
		else if (Score >= 90) Grade = "A";
		else if (Score >= 80) Grade = "B";
		else if (Score >= 70) Grade = "C";
		else if (Score >= 60) Grade = "D";
		else Grade = "F";
		
		System.out.println("귀하의 성적은 " + Grade + "입니다.");
		
		if(Grade == "D" || Grade == "F") {
			System.out.println("☆★☆★☆★재수강☆★☆★☆★");
		}
	}
	
	public static void main2(String[] args) {
		int com = 0, user = 0;
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		com = rd.nextInt(100) % 3 + 1;
		System.out.println("1.가위  2.바위 3.보자기");
		System.out.print("select > ");
		user = sc.nextInt();
		System.out.print("com : "); 
		if(com == 1) 		System.out.print("가위 ");
		else if(com == 2) 	System.out.print("바위 ");
		else		 		System.out.print("보자기 ");
		System.out.print("vs user : ");
		if(user == 1) 		System.out.println("가위 ");
		else if(user == 2) 	System.out.println("바위 ");
		else		 		System.out.println("보자기 ");
		
		
		System.out.println("결과 : ");
		if(user == com) {System.out.println("비김");}
		else if(user - com == 1 || user- com == -2) System.out.println("이김");
		else System.out.println("짐");
		
	}
	
	
	
	
	public static void BusTest() {
		int myAge = 29;       // 내 나이 
		int myMileage = 500; // 카드에 들어있는 금액
		int BusFare = 0;
		String Script = "";
		//17 ~ 19세는 버스요금이 860원 
		if(myAge >= 20) 		{
			BusFare = 1250;
			if(myMileage < BusFare) {
				System.out.println("잔액이 부족합니다.");
				
			}
			Script = "성인 입니다. ";   
		}
		else if(myAge >= 17)	{ 
			BusFare = 860; 
			Script = "청소년 입니다.";
		}
		else if(myAge >= 8) 	{
			BusFare = 740; 
			Script = "초.중딩 입니다."; 
		}
		else {
			Script = "아동 입니다.";
		}
	
		myMileage -= BusFare;
		
		System.out.println(Script + " 요금은 " + BusFare + "원 입니다.");
	
		return;
	}
	public static void ConditionOpEx() {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		int first = n1 < n2 ? n2 : n1;
		int second = first < n3 ? n3 : first;
		
		int result = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
		
		int height  = 140;
		int Age = 9;
		
		String Girin = (height >= 150) && (Age >= 9) ? "통과" : "아웃";
		
		// n1 과 n2 를 비교한다 --> n1
		
		// n1  n3
		
	}

}
/*
 * int nAge = 36;
		
		String text; // 문자열을 저장하는 변수
		
		text = (nAge >= 20) ? "성인" : "미성년자";
		
		System.out.println(nAge + " 세는 " + text + " 입니다.");
		
		int x = 0,y = 0,Result = 0;
		//수동 입력 : INPUT(X), INPUT(Y)
		// Scanner  class 외부에 
		// import java.util.Scanner 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력 > ");
		x = sc.nextInt();
		System.out.print("두번째 정수를 입력 > ");
		y = sc.nextInt();
		// 판단 : X와 Y의 크기를 비교한다.
		
		// 판단식의 결과가 TRUE 인 경우 결과변수 X값 저장
		// 판단식의 결과가 FALSE인 경우  Y값 저장
		
		// 삼항 연산자  A ? B : C
		Result = (x > y) ?  x : y;
		// 출력 : OUTPUT(Result)
		System.out.println("두 숫자 중 큰 값은 "+Result + "입니다.");
 * 
 */




