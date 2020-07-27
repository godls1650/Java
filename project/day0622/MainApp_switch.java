package project.day0622;

import java.util.Scanner;

/* switch - case 
 *  한 정수 값을 switch 로
 *  그 정수 변수가 갖게 될 값 중 하나를 분기점(case)로 나누어 실행 하게 되는 제어문 
 *  swtich에 사용되는 변수의 값이  <3> 인 경우
 *  case 3이 swith 블록의 실행지점이 된다.
 *  
 *  case 에 사용할 수 있는 값 
 *   - 숫자 상수 / 숫자 심벌릭 상수 / 문자열 상수(JDK 1.7)
 *  
 *  case 에 사용할 수 없는 값
 *   - 함수 리턴 값 / 변수의 명칭 / 실수 데이터 ..etc
 */
public class MainApp_switch {
/*	파일의 계정 권한을 할당하는 경우 
 *  rwx
 *  111 --> 7 
 *  110 --> 6
 *  100 --> 4
 */
	final static int Circle = 1;
	final static int Rectangel = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select = 0;
		Scanner sc = new Scanner(System.in);
		String str;
	
		
		System.out.print("1. 원  2. 삼각형  3. 사각형");
		select = 1;
		
		switch(select) {
		case 7:
			System.out.println("실행 권한을 할당");
		case 6:
			System.out.println("쓰기 권한 할당");
		case 4: 
			System.out.println("읽기권한을 할당");
		}
		
		final int triangle = 2;
		// break : 제어문 블록을 중단하고 블록 밖으로 실행 커서를 옮긴다. 
		
		switch(select) { // select 변수에 저장되어있는 값을 기준으로 
		case Circle: // select == 1 인 경우 시작 지점은 이 라인이 된다.
			System.out.println("원을 그린다.");
			break;
		case triangle: // select == 2 인 경우 시작 지점
			System.out.println("삼각형을 그린다.");
			break;
		case Rectangel: // select == 3인 경우 시작지점
			System.out.println("사각형을 그린다.");
			break;
		}
		
		System.out.print("몇월 입니까 > ");
		select = sc.nextInt();
		switch(select) {
	
		case 1: case 2: case 12: 
			System.out.println("겨울입니다.");
			break;
		case 3: case 4: case 5: 
			System.out.println("봄입니다.");
			break;
		case 6: case 7: case 8: 
			System.out.println("여름입니다.");
			break;
		case 9: case 10: case 11: 
			System.out.println("가을입니다.");
			break;
		default : 
			System.out.println("1 ~ 12 사이 값이 아닙니다.");
			break;
		}
		
		
		
		if(select == 1 ||select == 2 || select == 12) System.out.println("겨울");
		else if(select == 3 ||select == 4 || select == 5) System.out.println("봄");
		else if(select == 6 ||select == 7 || select == 8) System.out.println("여름");
		else if(select == 9 ||select == 10 || select == 11) System.out.println("가을");
		else System.out.println("1 ~ 12 사이 값이 아닙니다.");
		
	}
	
	public static void Score_Switch() {
		int score = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적을 입력 하세요 > ");
		score = sc.nextInt();
		
		
		switch (score/10) {
		case 10 : case 9 : System.out.println("A"); break;
		case 8 : System.out.println("B"); break;
		case 7 : System.out.println("C"); break;
		case 6 : System.out.println("D"); break;
		default : 
			System.out.println("F"); break;
		}
		
	}

}





















