package pcoject.day0701;
/*
 * 
 * 	f(x) = x^2 + 2x + 1
 * 
 * f(1) = 1^2 +2*1 + 1  -> 4
 * f(2) = 2^2 +2*2 + 1  -> 9
 * f(3) = 3^2 +2*3 + 1 -> 16
 * f(4) = 4^2 +2*4 + 1 -> 25
 * 
 * 
 */
public class MainApp_Func {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubx
		int [] arr1 = new int [10];
		int [] arr2 = new int [5];
		int [][] arr3 = new int [3][6];
		
		
		SetArray(arr1);
		printArray(arr1);
		
		SetArray(arr2);
		printArray(arr2);
		
		for(int i = 0; i < arr3.length; i++) {
			SetArray(arr3[i]);
			printArray(arr3[i]);
		}
		
		System.out.println(absolute(-100));
		System.out.println(absolute(100));
	}
	public boolean login(String id, String pw){
			if (id == "admin" && pw == "1234") 
					return true;
			else return false;
		
	}
	public static int f(int x) {
		int y= x* x + 2*2 +1;
		return y;
	}
	public static int absolute(int x) {
		if (x < 0) return -x;
		else return x;
	}
	
	public static void SetArray(int[] target) {
		for(int i = 0; i < target.length;i++)
			target[i] = (int)(Math.random()*100);
	}
	
	public static void printArray(int [] target) {
		for(int i = 0 ; i < target.length; i++)
			System.out.printf("%2d ", target[i]);
		System.out.println();
		return;
	}
	

	

}
