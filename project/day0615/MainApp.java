package project.day0615;

import java.util.Scanner;

/* �������� ���� 
 *  ���� (variable) : �޸� ������ �Ҵ���Ѽ� ���ϴ� ��� �� �ϳ��� �����ϴ� [����]�� �����.
 *  ��� (Constant) : �Ϲ����� ������ �ϳ��� ���ڰ� �ϳ��� ���� ���� ����
 *                    'A' : ���� A�� ��ǻ�� ���ο��� ���� 'A' �θ� ����Ѵ�.
 *                    10  : ���� 10�� ���������� ũ�Ⱑ 10�� �����θ� ��޵ȴ�.
 *                     =====> ǥ�� �״�ΰ� �ϳ��� ���� ��Ÿ���� ����� 
 *                              Literal  (���ͷ� ���) ��� �Ѵ�.
 *                    --> PI(����) / e(�ڿ����) / Ln (�ڿ��α�) ��� ??? 
 *  
 *  ������ (Operator)
 * �ǿ����� (Operand)
 *  ���׿����� : Ÿ�Ժ�ȯ������ : ĳ���ÿ�����    (Ÿ�Ը�)�ǿ�����
 *  ���׿�����
 *  ���׿�����
 * 
 *   - ���� ������ :   
 */
public class MainApp {
	final static double PI = 3.141592;// PI��� ������ ���� 
	final static int MAX_VALUE	 = 100;
	final static int MIN_VALUE	 = 0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		int result = 0;
		result = x + y;
		
		System.out.println((x + y));
		
		System.out.println("x : " + x);
		int money = 123650;
		System.out.println("�ݾ��� " + money / 1000 +","+ money %1000 + "���Դϴ�.");
		
		
		System.out.println("10 �� 3 ���� ���� �� : " + (10 / 3));
		System.out.println("10 �� 3 ���� ���� ������ : " + (10 % 3));
		System.out.println(10.0 / 3);
		System.out.println((double)10 / 3);
		System.out.println((double)(10 / 3));
		
		MoneyChecker();
		//GetCircleRound();
		//GetCircleAreaEx();
		// �������� ������ ������ ����	
		// �������� ��� ����� ������ ���� ����
		// Ű����� �Է��� ��ĳ�� ����
		//�Է� �� ���� ���
		// ��ĳ�ʸ� �̿��ؼ� ������ �Է�
		// ��� ������ �� ���� ��� ��� ����
		// ��� ���
	}
	
	public static void MoneyChecker() {
		int kor_money = 50000;
		int MyMoney = 0;
		int number = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��ϼ��� > ");
		MyMoney = sc.nextInt();
		
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 5;
		number += 1;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 2;
		number++;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 5;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 2;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 5;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 2;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 5;
		
		System.out.println(number + "." + kor_money + " : " + MyMoney / kor_money);
		MyMoney %=kor_money;
		kor_money /= 2;
		
		
		
		
		
		
	}
	
	
	
	
	public static void GetCircleAreaEx() {
		double r = 0.0;		// �������� ������ ������ ����	
		double result = 0.0; // �������� ��� ����� ������ ���� ����
		Scanner sc = new Scanner(System.in); // Ű����� �Է��� ��ĳ�� ����
		
		System.out.print("�������� �Է��մϴ� > "); //�Է� �� ���� ���
		r = sc.nextDouble();  // ��ĳ�ʸ� �̿��ؼ� ������ �Է�
		result = r * r * PI;  // ��� ������ �� ���� ��� ��� ����
		
		System.out.println("�������� " + r + "�� ���� ���̴� " + result + "�Դϴ�."); // ��� ���
		
	}
	public static void GetCircleRound() {
		double r = 0.0;		
		double result = 0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� �Է��մϴ� > ");
		r = sc.nextDouble();
		result = 2 * r * PI;
		
		System.out.println("�������� " + r + "�� ���� �ѷ� " + result + "�Դϴ�.");
		
	}
	
	
	
	
	
	public static void ValuesEx() {
		boolean bTest = true;
		bTest = false;
		double dData = 0.0;
		float fData = 0.0F;
		long lNumber = 0L;
		char text = '\0';
		
		//PI = 1.2314; // �ɺ��� ����� ����ϰ��� �ϴ� �޸𸮴� �ʱ�ȭ ���� ������ �� ����� �Ѵ�.
		int number = 0;
		if(number > MIN_VALUE && number < MAX_VALUE);
	}
	
	

}
