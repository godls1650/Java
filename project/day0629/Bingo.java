package project.day0629;

import java.util.Scanner;

/*
 * 서식문자
 * %d   : decimal    10진수 정수 출력
 * %o   : octal       8진수 정수 출력
 * %x   : hexa Dec   16진수 정수 출력
 * %s   : String	문자열을 추력
 * %c   : Character	문자하나	
 * %f	: Float		float 형태
 * %lf  : Double	더블형태
 * %e   : 1.34E004  부동소수점 출력
 * 
 * 서식문자의 옵션 추가 --> % 와 타입문자 사이에 
 * # : 진수표현식 출력
 * 정수숫자 : 자리수 정리 
 */
public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][] Board = new int [5][5];
		
		int temp = 0;
		int x = 0, y = 0;
		int Number = 0;
		int line = 0;
		Scanner sc = new Scanner(System.in);
			//Board에 1 ~ 25를 순서대로 저장 
			for(int i = 0 ; i < 5; i++) {
				for(int j = 0 ; j < 5; j++) {
					Board[i][j] = i*5 + j + 1;
				}
			}
			// Shuffle
			for(int i = 0 ; i < 5; i++) {
				for(int j = 0 ; j < 5; j++) {
					x = (int)(Math.random() * 5);
					y = (int)(Math.random() * 5);
					temp = Board[i][j];
					Board[i][j] = Board[x][y];
					Board[x][y] = temp;
				}
			}
			
			do {
			//Print
			line = 0;
				for(int i = 0 ; i < 5; i++) {
					for(int j = 0 ; j < 5; j++) {
						System.out.printf("%2d ",Board[i][j]);
					}
					System.out.println();
				}
				
				System.out.print("숫자를 선택 > ");
				Number = sc.nextInt();
				
				SEARCHVALUE:
				for(int i = 0 ; i < 5; i++) {
					for(int j = 0 ; j < 5; j++) {
						if(Board[i][j] == Number) {
							Board[i][j] = 0;
							break SEARCHVALUE;
						}
					}
				}

			}while(line < 5);
	}

}

/*
 *
		
 */
