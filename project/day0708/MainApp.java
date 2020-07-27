package project.day0708;

import java.util.Arrays;
import java.util.Scanner;


/*	재귀 함수 (Recursive Funtion/Method)
 */



public class MainApp {
	// 클래스 자체는 인스턴스의 설계역할 이기 때문에  속성 등의 인스턴스 멤버가 없다. 
	// 일부 반복 적인 동작을 구현 하는 경우 더 간결한 내용으로 구현 할 수 있다.
	public static int rc_Factorial(int n) {
		return n == 1 ? n : n*rc_Factorial(n-1);
	}
	
	public static int getFactorial(int n) {
		int result = 0;
		result = 1;
		
		for(int i = n; i > 0; i--) {
			result *= i; // 5 * 4 * 3 * 2 * 1
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Book Comics = new Book("나루토 22권", "누구시더라", "대영미디어", 4500);
		//Book Gossip = new Book("맥심 6월호", "맥심", "맥심코리아", 14500);
		//Book temp = new Book();
		//temp.input();
		
		Book [] BookList = new Book[100];
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int index = 0;
		int idx = 0;
		String title;
		
		BookList[0] = new Book("나루토 22권", "누구시더라", "대영미디어", 4500);
		BookList[1] = new Book("맥심 6월호", "맥심", "맥심코리아", 14500);
		
		do {
			System.out.println("1. 도서 추가    2.도서 목록 조회   3. 검색   4. 정보 수정  0. Exit");
			System.out.print("Select Menu > ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				index = Book.Count;
				BookList[index] = new Book();
				BookList[index].input();
				break;
			case 2:
				System.out.println("총 도서 개수 : " + Book.Count);
				for(int i = 0 ; i < Book.Count; i++) {
					BookList[i].show();
				}
				break;
			case 3:
				System.out.print("검색할 도서명 > ");
				title = sc.nextLine();
				for(int i = 0 ; i < Book.Count; i++) {
					if(title.compareTo(BookList[i].getM_Title()) == 0) {
						index = i;
						break;
					}
				}
				BookList[index].show();
				break;
			case 4:break;
			case 0: break;
			default :
				System.err.println("없는 메뉴를 선택 했습니다.");
				break;
			}
			
			
		}while(menu != 0);
		
		
		/*
		Comics.show();
		Gossip.show();
		temp.show();
		*/
		
	}

}
