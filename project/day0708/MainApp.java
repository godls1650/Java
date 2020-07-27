package project.day0708;

import java.util.Arrays;
import java.util.Scanner;


/*	��� �Լ� (Recursive Funtion/Method)
 */



public class MainApp {
	// Ŭ���� ��ü�� �ν��Ͻ��� ���迪�� �̱� ������  �Ӽ� ���� �ν��Ͻ� ����� ����. 
	// �Ϻ� �ݺ� ���� ������ ���� �ϴ� ��� �� ������ �������� ���� �� �� �ִ�.
	public static int rc_Factorial(int n) {
		return n == 1 ? n : n*rc_Factorial(n-1);
	}
	
	public static int getFactorial(int n) {
		int result = 0;
		result = 1;
		
		for(int i = n; i > 0; i--) {
			result *= i; // 5 * 4 * 3 * 2 * 1
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Book Comics = new Book("������ 22��", "�����ô���", "�뿵�̵��", 4500);
		//Book Gossip = new Book("�ƽ� 6��ȣ", "�ƽ�", "�ƽ��ڸ���", 14500);
		//Book temp = new Book();
		//temp.input();
		
		Book [] BookList = new Book[100];
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int index = 0;
		int idx = 0;
		String title;
		
		BookList[0] = new Book("������ 22��", "�����ô���", "�뿵�̵��", 4500);
		BookList[1] = new Book("�ƽ� 6��ȣ", "�ƽ�", "�ƽ��ڸ���", 14500);
		
		do {
			System.out.println("1. ���� �߰�    2.���� ��� ��ȸ   3. �˻�   4. ���� ����  0. Exit");
			System.out.print("Select Menu > ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				index = Book.Count;
				BookList[index] = new Book();
				BookList[index].input();
				break;
			case 2:
				System.out.println("�� ���� ���� : " + Book.Count);
				for(int i = 0 ; i < Book.Count; i++) {
					BookList[i].show();
				}
				break;
			case 3:
				System.out.print("�˻��� ������ > ");
				title = sc.nextLine();
				for(int i = 0 ; i < Book.Count; i++) {
					if(title.compareTo(BookList[i].getM_Title()) == 0) {
						index = i;
						break;
					}
				}
				BookList[index].show();
				break;
			case 4:break;
			case 0: break;
			default :
				System.err.println("���� �޴��� ���� �߽��ϴ�.");
				break;
			}
			
			
		}while(menu != 0);
		
		
		/*
		Comics.show();
		Gossip.show();
		temp.show();
		*/
		
	}

}
