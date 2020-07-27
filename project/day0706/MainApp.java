package project.day0706;
/* Simula

 *  사물이나 개념의 값을 저장하는 부분 --> 속성 (Attribute)
 *  사물이나 개념의 동작,행동, 계산, 처리 ..etc등을 코드로 구현한 부분 --> 메서드(Method) 
 *  
 *  class 개 {
	 *   품종
	 *   품종_Sound
	 *   이름
	 *   키, 몸무게
	 *   생년월일 
	 *   ..etc
	 *   
	 *   짖는다.
	 *   먹는다.
	 *   잔다.
	 *   이동한다.
 *   }
 */


/*
 * 객체지향 프로그래밍 
 * 객체지향 3요소
 * 
 * 캡슐화 (enCapsulation) --> 관련된 모든 것들을 하나로 모은다.
 *                      --> 모아진 모든 정보를 외부로 부터 보호한다. 
 *                           ㄴ 외부의 접근에대해 접근을 허가, 불허 한다. 
 *   <<클래스 접근 제어>>
 * 접근 제어자 (Access Modifier)
 * private   : 모든 접근을 차단  ------------------> 정보 은닉
 * protected : 상속관계 의 하위 클래스의 접근을 허용
 * public	 : 어느 접근에서든 허용
 * default   : 한 패키지 안에서의 접근은 모두 허용
 * 
 *   -> 외부의 접근을 허용하면
 *     main함수나 B 클래스의 인스턴스의 동작으로 A 클래스의 인스턴스의 값을 변경할 수 있다.
 *     ==> main함수나 B 클래스의 인스턴스의 동작만이  A 클래스의 인스턴스의 값을 변경할 수 있다.
 *     
 *     A클래스의 인스턴스 들은 B클래스의 인스턴스가 없으면 사용할 수 없다. ---> 결합도가 높다/ 의존성이 높다 / 재사용이 불편해진다.
 *                                                         -> 인터페이스가 복잡해진다.
 *     ->  B클래스는 A클래스의 모든 원소에 접근가능해야 한다.
 *     
 *   
 * 상속성 / 다형성 
 * 
 * 
 * 객체지향 5원칙 (SOLID 원칙)
 * 
 * S - Single Responsibility Principle  (SRP) : 단일 책임 원칙
 *  - 모든 클래스는 단 하나의 책임을 갖는다. 
 *    ex) 출력 객체는 출력만 하면된다.
 *        스캐너 객체는 입력만 하면된다.
 *        Dog 객체는 Dog의 동작처리만 하면 된다.
 *        
 *        
 *    =============> 데이터를 초기화 하는 동작 --> 생성자 (Constructor)
 *                   데이터를 사용하는 모든 동작 --> Method()
 *                                               ㄴ 데이터를 입 출력하는 메서드 --> getter / setter
 *        
 *  OLID 
 */




import java.util.Scanner;

import project.day0706.Dog;


public class MainApp {
	public static void Swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		
	}
	public static void Swap(int [] x, int [] y) {
		int temp = x[0];
		x[0] = y[0];
		y[0] = temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV();
		int sw = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1. ChUP 2.ChDn 3. VUp 4. VDn 5.Power");
			sw = sc.nextInt();
			switch(sw) {
			case 1: myTV.ChannelUp(); break;
			case 2: myTV.ChannelDown(); break;
			case 3: myTV.VolumeUp(); break;
			case 4: myTV.VolumeDown(); break;
			case 5: myTV.pushPwrButton(); break;
			
			}
			System.out.println(myTV);
		}
		
	}

}









