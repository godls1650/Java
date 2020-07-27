package project.day0626;

import java.util.Random;

public class MainApp_ArrayEx2 {
/*	arr1 배열에 10개의 정수 난수를 저장
 *  arr2 배열에 arr1의 원소를 복사
 *  arr3 배열에 arr2의 원소를 역순으로 복사
 *  
 *  arr1의 배열 길이를 20으로 늘려서 뒤에 데이터 10개를 추가 
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
		
		
		/* 25개 인덱스를 갖는 배열을 5개 인덱스 씩 묶어서 5개의 배열로 사용 */
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
