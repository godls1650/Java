package project.day0715;

import java.util.Arrays;

/*	함수 객체 
 * 
 * 
 */



public class MainApp {
	public static void SortArray(int[] arr, TestInter Sorter) {
		
		int temp = 0;
		int k = 0;
		for(int i = 0 ; i < arr.length-1; i++) {
			temp = arr[i];
			for(int j = i+1; j <arr.length; j++ ) {
				if(Sorter.func(temp, arr[j]) == -1) {
					temp = arr[j];
					k = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInter Sorter = (x,y)-> {return ((x-y) > 0) ? 1  : (x-y == 0) ? 0 : -1 ; };
		TestInter Sorter2 = (x,y)-> {return ((x-y) < 0) ? 1  : (x-y == 0) ? 0 : -1 ; };
		int [] arr = {10,20,34,56,12,5,12,7};
		SortArray(arr, Sorter);
		System.out.println(Arrays.toString(arr));
		SortArray(arr, Sorter2);
		System.out.println(Arrays.toString(arr));
		
		Cls1 adder = new Cls1();
		Cls2 minner = new Cls2();
		System.out.println(adder.func(10, 20));
		System.out.println(minner.func(10, 20));
		
		// 익명 객체 --> 인터페이스에 추상함수 1개만 존재하는 경우 
		TestInter Multiflexer = new TestInter() {
			public int func(int x, int y) {
				return x * y;
			}
		};
		
		// 람다함수 --> 람다식 
		TestInter Divider = (x, y)->{ return x /y ;};
		
		
		
		// 함수 하나를 처리하기위해 클래스를 작성하는 비용을 제거 
		System.out.println(Multiflexer.func(10, 20));
		System.out.println(Divider.func(100, 5));
	}

}
