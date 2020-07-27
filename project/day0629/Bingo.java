package project.day0629;

import java.util.Scanner;

/*
 * ���Ĺ���
 * %d   : decimal    10���� ���� ���
 * %o   : octal       8���� ���� ���
 * %x   : hexa Dec   16���� ���� ���
 * %s   : String	���ڿ��� �߷�
 * %c   : Character	�����ϳ�	
 * %f	: Float		float ����
 * %lf  : Double	��������
 * %e   : 1.34E004  �ε��Ҽ��� ���
 * 
 * ���Ĺ����� �ɼ� �߰� --> % �� Ÿ�Թ��� ���̿� 
 * # : ����ǥ���� ���
 * �������� : �ڸ��� ���� 
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
			//Board�� 1 ~ 25�� ������� ���� 
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
				
				System.out.print("���ڸ� ���� > ");
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
