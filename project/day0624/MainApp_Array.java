package project.day0624;

import java.util.Random;

/* �迭 : ���� Ÿ���� ������ �ϳ��� �������� �ٷ��. 
 *  - ���������� ���Ǵ� ���� Ÿ���� ������ 
 *  - �뵵�� ���� �����͸� ����ȭ 
 *  
 *  type []  --> ������ ���� 
 *  
 *  �迭�� ���� 
 *  
 *  type [] �����̸�
 *  type �����̸�[] 
 *  
 *  ������ �������� ������ ���ϴ� ���
 *  1. �迭�� ����   = ��Ÿ���� ���� ����--> type[Size] �� ����(new) �Ҵ��Ų��.
 *  type [] �����̸� = new type[Size]  Size: ���� , ��� 
 *  
 *  * �迭�� ��Ҹ� �ϳ��� ����ϴ� ���  : �ε��� ������ [index]  index ���� ���� : 0  ~ Size-1 
 *  
 */
public class MainApp_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Rotto[] = new int[6]; // Rotto��� �̸��� ���� 6���� ������ �迭�� �����Ѵ�.
		Random rd = new Random(); // ���� ��ü�� ����
		
		// ���̸� �𸦰�� 
		 // [0] �� �Է��ϴ� ��� �ߺ� ����
		 // [1] �� �Է��ϴ� ���  [0]�� Ȯ��
		 // [2] �� �Է��ϴ� ��� [0][1]
		// [3] �� �Է��ϴ� ��� [0][1][2]
		// [4] �� �Է��ϴ� ��� [0][1][2][3]
//		/[5] �� �Է��ϴ� ��� [0][1][2][3][4]
		
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
		//  [] : ������
		int size = 10;
		int [] arr = new int[size];
		//					  ��  �ε��� ũ�� : ������ ���� 
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
