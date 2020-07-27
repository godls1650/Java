package project.day0622;

import java.util.Scanner;

/* switch - case 
 *  �� ���� ���� switch ��
 *  �� ���� ������ ���� �� �� �� �ϳ��� �б���(case)�� ������ ���� �ϰ� �Ǵ� ��� 
 *  swtich�� ���Ǵ� ������ ����  <3> �� ���
 *  case 3�� swith ����� ���������� �ȴ�.
 *  
 *  case �� ����� �� �ִ� �� 
 *   - ���� ��� / ���� �ɹ��� ��� / ���ڿ� ���(JDK 1.7)
 *  
 *  case �� ����� �� ���� ��
 *   - �Լ� ���� �� / ������ ��Ī / �Ǽ� ������ ..etc
 */
public class MainApp_switch {
/*	������ ���� ������ �Ҵ��ϴ� ��� 
 *  rwx
 *  111 --> 7 
 *  110 --> 6
 *  100 --> 4
 */
	final static int Circle = 1;
	final static int Rectangel = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select = 0;
		Scanner sc = new Scanner(System.in);
		String str;
	
		
		System.out.print("1. ��  2. �ﰢ��  3. �簢��");
		select = 1;
		
		switch(select) {
		case 7:
			System.out.println("���� ������ �Ҵ�");
		case 6:
			System.out.println("���� ���� �Ҵ�");
		case 4: 
			System.out.println("�б������ �Ҵ�");
		}
		
		final int triangle = 2;
		// break : ��� ����� �ߴ��ϰ� ��� ������ ���� Ŀ���� �ű��. 
		
		switch(select) { // select ������ ����Ǿ��ִ� ���� �������� 
		case Circle: // select == 1 �� ��� ���� ������ �� ������ �ȴ�.
			System.out.println("���� �׸���.");
			break;
		case triangle: // select == 2 �� ��� ���� ����
			System.out.println("�ﰢ���� �׸���.");
			break;
		case Rectangel: // select == 3�� ��� ��������
			System.out.println("�簢���� �׸���.");
			break;
		}
		
		System.out.print("��� �Դϱ� > ");
		select = sc.nextInt();
		switch(select) {
	
		case 1: case 2: case 12: 
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 3: case 4: case 5: 
			System.out.println("���Դϴ�.");
			break;
		case 6: case 7: case 8: 
			System.out.println("�����Դϴ�.");
			break;
		case 9: case 10: case 11: 
			System.out.println("�����Դϴ�.");
			break;
		default : 
			System.out.println("1 ~ 12 ���� ���� �ƴմϴ�.");
			break;
		}
		
		
		
		if(select == 1 ||select == 2 || select == 12) System.out.println("�ܿ�");
		else if(select == 3 ||select == 4 || select == 5) System.out.println("��");
		else if(select == 6 ||select == 7 || select == 8) System.out.println("����");
		else if(select == 9 ||select == 10 || select == 11) System.out.println("����");
		else System.out.println("1 ~ 12 ���� ���� �ƴմϴ�.");
		
	}
	
	public static void Score_Switch() {
		int score = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� �ϼ��� > ");
		score = sc.nextInt();
		
		
		switch (score/10) {
		case 10 : case 9 : System.out.println("A"); break;
		case 8 : System.out.println("B"); break;
		case 7 : System.out.println("C"); break;
		case 6 : System.out.println("D"); break;
		default : 
			System.out.println("F"); break;
		}
		
	}

}





















