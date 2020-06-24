package project.day0622;

import java.util.Random;
import java.util.Scanner;

/*	���� �� (�ǻ� ���� ����) 
 * 
 *  1. Math.random
 *     --> (int)(Math.random() * n) % range + minimum
 *     
 *  2. Random rd
 *     rd.nextInt(Range) + Minimum;
 *     
 *     user������ ����� �Է��� �̿��ؼ� ���� (1), ����(2) , ���ڱ�(3) �� �Է¹޴´�.
 *     com ������ ���� �Լ��� ����ؼ�  1 ~ 3 �� �ϳ��� ���� �����ϰ� �Է¹޴´�.
 *     
 *     ���������� ����� ����ϴ� ���α׷� �ۼ�
 * 
 */
public class MainApp_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int UsrNumber = 0, ComNumber = 0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("1.����   2.����   3.���ڱ� \nselect > ");
		UsrNumber = sc.nextInt();
		ComNumber = rd.nextInt(3)+1;
		/*u\c 1  2  3
		 *  1 D  L  W				
		 *  2 W  D  L
		 *  3 L  W  D
		 * 
		 */
		System.out.print("User : ");
		if(UsrNumber == 1) System.out.print("����");
		else if(UsrNumber == 2) System.out.print("����");
		else System.out.print("���ڱ�");
		
		System.out.print("  VS COM : ");
		if(ComNumber == 1) System.out.println("����");
		else if(ComNumber == 2) System.out.println("����");
		else System.out.println("���ڱ�");
		
		
		int result = UsrNumber - ComNumber;
		switch(result) {
		case 0 : System.out.println("Draw"); break;
		case -1 : case 2: System.out.println("Lose"); break;
		case -2 : case 1: System.out.println("Win"); break;
		
		
		
		}
	}

}





