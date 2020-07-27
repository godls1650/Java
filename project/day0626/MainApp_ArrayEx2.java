package project.day0626;

import java.util.Random;

public class MainApp_ArrayEx2 {
/*	arr1 �迭�� 10���� ���� ������ ����
 *  arr2 �迭�� arr1�� ���Ҹ� ����
 *  arr3 �迭�� arr2�� ���Ҹ� �������� ����
 *  
 *  arr1�� �迭 ���̸� 20���� �÷��� �ڿ� ������ 10���� �߰� 
 *  
 *  
 */
	final static int Size = 10;
	final static int Cols= 5;
	final static int Rows= 6;
	public static void Swap(int x, int y) {
		int temp = x; 
		x = y;
		y = temp;
	}
	
	public static void Swap2(int[] x, int[] y) {
		int temp = x[0]; 
		x[0] = y[0];
		y[0] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int [] arr1 = new int[Size];
		int [] arr2 = new int[Size];
		int [] arr3 = new int[Size];
		int [] number1 = {10}, number2 = {20};
		System.out.println(number1[0]  + "  "+ number2[0]);
		Swap2(number1, number2);
		System.out.println(number1[0]  + "  "+ number2[0]);
		
		
		for(int i = 0; i < Size; i++) { arr1[i] = rd.nextInt(100) + 1; }
		
		for(int i = 0; i <Size; i++) { arr2[i] = arr1[i]; }
		
		for(int i = 0; i <Size; i++) { arr3[Size-1-i] = arr1[i]; }
		
		for(int i = 0; i < Size; i++) System.out.print(arr1[i] + " ");
		System.out.println();
		for(int i = 0; i < Size; i++) System.out.print(arr2[i] + " ");
		System.out.println();
		for(int i = 0; i < Size; i++) System.out.print(arr3[i] + " ");
		System.out.println();
		
		
		
		
		int [] temp = arr1;
		
		int len = Size;
		arr1 = new int[Size + len];
		for(int i = 0; i <Size; i++) { arr1[i] = temp[i]; }
		
		for(int i = Size; i < Size + len; i++) {
			arr1[i] = rd.nextInt(100) + 1;
		}
		
		for(int i = 0; i < Size*2; i++)System.out.print(arr1[i] + " ");
		System.out.println();
		
		
		/* 25�� �ε����� ���� �迭�� 5�� �ε��� �� ��� 5���� �迭�� ��� */
		int [] test = new int [Cols * Rows];  // 5 * 6
		/*					  i       j
		test[0] ~ test[4]	5*0 + (0 to 5)
		test[5] ~ test[9]   5*1 + (0 to 5)
		test[10] ~ test[14] 5*2 + (0 to 5)
		test[15] ~ test[19] 5*3 + (0 to 5)
		test[20] ~ test[24] 5*4 + (0 to 5)
		*/
		for(int i = 0; i < Cols; i++) {
			for(int j = 0; j < Rows; j++) {
				test[i*5+j] = rd.nextInt(45)+1;
				for(int k = 0; k < j; k++) {
					if(test[i*5 + j] == test[i*5+k]) {
						j--;
						break;
					}
				}
			}
		}
		
		for(int i = 0; i < Cols; i++) {
			for(int j = 0; j < Rows; j++) {
				System.out.print(test[i*5 + j] + " ");
			}
			System.out.println();
		}
		int [][]board = new int[Cols][Rows];
		for(int i = 0 ; i < Cols; i++) {
			for(int j = 0 ; j < Rows; j++) {
				board[i][j] = 0;
			}
			
		}
		
	}
	
	

}
