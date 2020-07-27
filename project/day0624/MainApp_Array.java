package project.day0624;

import java.util.Random;

/* 배열 : 같은 타입의 변수를 하나의 묶음으로 다룬다. 
 *  - 연속적으로 사용되는 같은 타입의 데이터 
 *  - 용도가 같은 데이터를 군집화 
 *  
 *  type []  --> 참조형 변수 
 *  
 *  배열의 선언 
 *  
 *  type [] 변수이름
 *  type 변수이름[] 
 *  
 *  나열된 데이터의 개수를 정하는 경우
 *  1. 배열을 선언   = 그타입의 원소 개수--> type[Size] 를 새로(new) 할당시킨다.
 *  type [] 변수이름 = new type[Size]  Size: 변수 , 상수 
 *  
 *  * 배열에 요소를 하나씩 사용하는 경우  : 인덱스 연산자 [index]  index 값의 범위 : 0  ~ Size-1 
 *  
 */
public class MainApp_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Rotto[] = new int[6]; // Rotto라는 이름의 정수 6개를 나열한 배열을 선언한다.
		Random rd = new Random(); // 랜덤 객체를 선언
		
		// 길이를 모를경우 
		 // [0] 에 입력하는 경우 중복 없음
		 // [1] 에 입력하는 경우  [0]과 확인
		 // [2] 에 입력하는 경우 [0][1]
		// [3] 에 입력하는 경우 [0][1][2]
		// [4] 에 입력하는 경우 [0][1][2][3]
//		/[5] 에 입력하는 경우 [0][1][2][3][4]
		
		for(int i = 0 ; i < Rotto.length;i++) {
			Rotto[i] = rd.nextInt(6) + 1;
			for(int j = 0; j < i; j++) {
				if(Rotto[i] == Rotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0 ; i < Rotto.length;i++) {
			System.out.print(Rotto[i]+" ");
		}
	}

}

/*
 * int a,b,c,d,e;
		//  [] : 참조형
		int size = 10;
		int [] arr = new int[size];
		//					  ㄴ  인덱스 크기 : 데이터 개수 
		int [] arr2 = {10,20,30,40,50};
		
		
		
		
		a = 10; 
		b = 20; 
		c = 30; 
		d = 40; 
		e = 50;
		
		for(int i = 0 ; i < 5; i++) arr[i] = (i+1)*100;
			
		for(int i = 0 ; i < 5; i++) System.out.print(arr[i] + " ");
		System.out.println();
		for(int i = 0 ; i < 5; i++) System.out.print(arr2[i]+ " ");
		System.out.println();
		
		
		
		a = e;
		
		a /= 2;
		System.out.println(e);
		
		
		for(int i = 0 ; i < 5; i++) arr2[i] /=2;
		for(int i = 0 ; i < 5; i++) System.out.print(arr[i] + " ");
		System.out.println();
 */
