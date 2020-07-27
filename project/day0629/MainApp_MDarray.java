package project.day0629;

public class MainApp_MDarray {
/*	다차원 배열 
 *  [][][][][]
 *  [][][][][]
 *  [][][][][]
 *  
 *  중학생 1개 반의 모든 학생의 성적 
 *  int [][] MiddleClass = new int[인원수][과목수 ]
 */
	final static int Row = 3;
	final static int Column = 5;
	final static int Lines = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr =  {{4,1,2,5,7}, {3,6,2,6,9}, {1,3,8,5,4}}; // [몇 묶음][몇 개 씩]
		int [][] arr2 = new int[Lines][];
		// 가변배열 
		arr2[0] = new int [35];
		
		arr2[1] = new int [30];
		arr2[2] = new int [32];
		arr2[3] = new int [28];
		arr2[4] = new int [33];
		
		int [][][] Grade3 = new int[8][][];
		int [] Count = new int[] {30,32,28,31,30,27,34,33,32};
		int Size = 0;
		for(int i = 0; i < Count.length; i++) {
			Size = Count[i]; 
			Grade3[i] = new int[Size][5];
			
		}
		
		
		
		for(int i = 0 ; i < Column; i++) {
			for(int j = 0; j <Row; j++) {	
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		
	}

}
