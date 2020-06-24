package project.day0612;
// 설명문 :    프로그램이 실행 할 때 코드로 인식하지 않는 문장 
/*
 *  함수 (function) : 프로그램의 동작  
 * 메서드 (method ) : 어떠한 객체의 동작 
 *   
 *   객체 (Object, Instance) : 개념이나 사물 등   
 */

/* 변수 (Variable) : 무한에 가까운 상수 값 중 하나를 저장하는 공간
 * 데이터 타입 
 *  변수 이름
 *  변수의 선언 --> 타입명  변수이름;
 *  문자 / 정수 / 실수 / 논리형  --> 기본 데이터 타입 (Default Data Type)
 */

import java.util.*;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형태로 밑변의 길이와 높이를 저장하는 변수를 만든다.
		// 헝가리안 표기법 
		int nWidth  = 0;
		int nHeight = 0;
		boolean bClear = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변의 길이를 입력하세요 > ");
		nWidth = sc.nextInt();
		System.out.println("높이를 입력하세요 > ");
		nHeight = sc.nextInt();
		
		//nWidth = 11;	/* 수학  =   :: 등호 */
		//nHeight = 21;  /* 프로그래밍  = :: 대입 연산 */
		// 높이가 20이고 밑변이 10인 사각형의 넓이는 200 입니다.
		
		System.out.println("높이가 " + nHeight + "이고 밑변이 " + nWidth + "인 사각형의 넓이는 " +
		                      nHeight * nWidth + " 입니다.");
		
		System.out.println("높이가 " + nHeight + "이고 밑변이 " + nWidth + "인 삼각형의 넓이는 " +
                nHeight * nWidth / 2 + " 입니다.");
		
		System.out.println("hello world");
		System.out.println("hi!");
	}

}
