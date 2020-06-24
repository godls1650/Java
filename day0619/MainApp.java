package project.day0619;

import java.util.Random;
import java.util.Scanner;

/*	���� ������
 *   �ǿ����ڰ� 3���� ������ (���ǿ�����    ?  :  )
 *     A  ? B : C 
 *  --> �� ���� �������� ���ؼ� ū ���ڸ� ����ϴ� ���α׷� �ۼ� 
 *  
 *  --> ��� : �ڵ��� ���� ������ ����(����) �ϴ� ��ɾ� 
 *  	�б� ���� - 1. boolean Ÿ�� ���� ���� ���� ������ ����
 *               2. ���� ���� ���� ���� �ڵ��� �� �ϳ��� ���� 
 *               
 *     boolean ������ �б⸦ ������ ��� : if()�� 
 *     
 *     [���� ��ɾ�] ([������ ���ذ�])
 *     {
 *     	��� �ͼӵ� �ڵ� 
 *     }
 *     
 *     if �������� false ���� ��� ��  ���
 *     ---> �ٷ� ���� ��ɾ� ������ if 
 *     1. else if 
 *     2. else 
 *     
 *     if( A )  { B  } else { C }
 *     
 *     ���� A��� B�̰� �� �ܿ� ���� C �̴� .
 *     
 *     if( A )  { B  } else if(C) { D } else if ..... }  else { Z }
 *     
 *    	���� A ��� B�̰� �� ���� ��� �� C ��� D �̰� �� ���� ��� �� ......
 *      �׿��� ��� Z �̴�.
 *      
 *      if  else if   else ������ �̿��ؼ�   
 *     �Է��� ������ ���� 
 *     
 *     100 ~ 90 ������ A�� ���
 *     89 ~ 80 ������ B�� ���
 *     79 ~ 70 ������ C�� ���
 *     69 ~ 60 ������ D�� ���
 *     60 �̸��� F�� ���
 */
public class MainApp {
	public static int func() {
		
		return 10;
	}
	public static void main(String[] args) {
		int Score = func();
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt()+"�� �Է��߽��ϴ�.");
		System.out.print("������ �Է��ϼ��� > ");
		Score = sc.nextInt();
		String Grade = "";
		if(Score > 100) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			return ;
		}
		else if (Score >= 90) Grade = "A";
		else if (Score >= 80) Grade = "B";
		else if (Score >= 70) Grade = "C";
		else if (Score >= 60) Grade = "D";
		else Grade = "F";
		
		System.out.println("������ ������ " + Grade + "�Դϴ�.");
		
		if(Grade == "D" || Grade == "F") {
			System.out.println("�١ڡ١ڡ١�������١ڡ١ڡ١�");
		}
	}
	
	public static void main2(String[] args) {
		int com = 0, user = 0;
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		com = rd.nextInt(100) % 3 + 1;
		System.out.println("1.����  2.���� 3.���ڱ�");
		System.out.print("select > ");
		user = sc.nextInt();
		System.out.print("com : "); 
		if(com == 1) 		System.out.print("���� ");
		else if(com == 2) 	System.out.print("���� ");
		else		 		System.out.print("���ڱ� ");
		System.out.print("vs user : ");
		if(user == 1) 		System.out.println("���� ");
		else if(user == 2) 	System.out.println("���� ");
		else		 		System.out.println("���ڱ� ");
		
		
		System.out.println("��� : ");
		if(user == com) {System.out.println("���");}
		else if(user - com == 1 || user- com == -2) System.out.println("�̱�");
		else System.out.println("��");
		
	}
	
	
	
	
	public static void BusTest() {
		int myAge = 29;       // �� ���� 
		int myMileage = 500; // ī�忡 ����ִ� �ݾ�
		int BusFare = 0;
		String Script = "";
		//17 ~ 19���� ��������� 860�� 
		if(myAge >= 20) 		{
			BusFare = 1250;
			if(myMileage < BusFare) {
				System.out.println("�ܾ��� �����մϴ�.");
				
			}
			Script = "���� �Դϴ�. ";   
		}
		else if(myAge >= 17)	{ 
			BusFare = 860; 
			Script = "û�ҳ� �Դϴ�.";
		}
		else if(myAge >= 8) 	{
			BusFare = 740; 
			Script = "��.�ߵ� �Դϴ�."; 
		}
		else {
			Script = "�Ƶ� �Դϴ�.";
		}
	
		myMileage -= BusFare;
		
		System.out.println(Script + " ����� " + BusFare + "�� �Դϴ�.");
	
		return;
	}
	public static void ConditionOpEx() {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		int first = n1 < n2 ? n2 : n1;
		int second = first < n3 ? n3 : first;
		
		int result = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
		
		int height  = 140;
		int Age = 9;
		
		String Girin = (height >= 150) && (Age >= 9) ? "���" : "�ƿ�";
		
		// n1 �� n2 �� ���Ѵ� --> n1
		
		// n1  n3
		
	}

}
/*
 * int nAge = 36;
		
		String text; // ���ڿ��� �����ϴ� ����
		
		text = (nAge >= 20) ? "����" : "�̼�����";
		
		System.out.println(nAge + " ���� " + text + " �Դϴ�.");
		
		int x = 0,y = 0,Result = 0;
		//���� �Է� : INPUT(X), INPUT(Y)
		// Scanner  class �ܺο� 
		// import java.util.Scanner �ۼ�
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է� > ");
		x = sc.nextInt();
		System.out.print("�ι�° ������ �Է� > ");
		y = sc.nextInt();
		// �Ǵ� : X�� Y�� ũ�⸦ ���Ѵ�.
		
		// �Ǵܽ��� ����� TRUE �� ��� ������� X�� ����
		// �Ǵܽ��� ����� FALSE�� ���  Y�� ����
		
		// ���� ������  A ? B : C
		Result = (x > y) ?  x : y;
		// ��� : OUTPUT(Result)
		System.out.println("�� ���� �� ū ���� "+Result + "�Դϴ�.");
 * 
 */




