package pcoject.day0701;

import java.util.Scanner;

public class MainApp_StarPrint {
	final static String STAR = "*";
	final static String ENTER = "\n";
	final static String SPACE = " ";
	final static int SIZE = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < SIZE; i++) {
			for(int k = 0; k < SIZE; k++) {
				if(i == k) System.out.print(STAR);
				else System.out.print(SPACE);
			}
			System.out.print(ENTER);
		}
		System.out.println();
		for(int i = 0 ; i < SIZE; i++) {
			for(int k = 0; k < SIZE; k++) {
				if(i == SIZE-1 - k) System.out.print(STAR);
				else System.out.print(SPACE);
			}
			System.out.print(ENTER);
		}
		System.out.println();
		for(int i = 0 ; i < SIZE; i++) {
			for(int k = 0; k < SIZE; k++) {
				if(i == k || i == SIZE-1 - k) System.out.print(STAR);
				else System.out.print(SPACE);
			}
			System.out.print(ENTER);
		}
		System.out.println();
		for(int i = 0 ; i < SIZE; i++) {
			for(int k = 0; k < SIZE*2; k++) {
				if(k == SIZE + i ||k == SIZE - i ) System.out.print(STAR);
				else System.out.print(SPACE);
			}
			System.out.print(ENTER);
		}
		
		System.out.println();
		for(int i = 0 ; i < SIZE; i++) {
			for(int k = 0; k < SIZE; k++) {
				if(k == SIZE + i ||k == SIZE - i ) System.out.print(STAR);
				else System.out.print(SPACE);
			}
			System.out.print(ENTER);
		}
		
		for(int i = 0; i < SIZE;i++) {
			if(i <= SIZE / 2) {
				for(int j = 0; j < SIZE ;j++) {
					if(j == 2 - i||j == 2 + i)System.out.print(STAR);
					else System.out.print(SPACE);
				}
			}
			else {
				for(int j = 0; j < SIZE ;j++) {
					if(j == 2 - (SIZE-1-i)||j == 2 + (SIZE-1-i))System.out.print(STAR);
					else System.out.print(SPACE);
				}
			}
			System.out.println();
		}
		
	
	int [][] Point = new int[10][10];
	int x = 0, y = 0;
	
	Scanner sc = new Scanner(System.in);
	
	for(int i =0 ; i < 10; i++) {
		for(int j =0; j <10; j++) {
			if((i == 0 || i == 9)||(j == 0 || j == 9)) Point[i][j] = 1;
			
			
		}
	}
	
	
	for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(Point[i][j] == 0)
				System.out.print(" ¡¤");
				if(Point[i][j] == 1) System.out.print(" ¡Ú");
			}
			System.out.println();
		}
	
	}
}






