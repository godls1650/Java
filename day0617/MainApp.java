package project.day0617;

import java.util.Scanner;

public class MainApp {
	/* ��Ʈ ������ : ����� �������� ���� bit������ ó���ϴ� ������.
	 *    - ��Ʈ �� ������ 
	 *        A & B : ����� ��Ʈ�� �ּ� �� ���� ���� ū ��Ʈ���� and���� �Ѵ�. (A,B�� ��Ʈ���� 1�̸� ����� 1)
	 *        A | B : ����� ��Ʈ�� �ּ� �� ���� ���� ū ��Ʈ����  or���� �Ѵ�. (A�Ǵ�B�� ��Ʈ���� 1�̸� ����� 1)
	 *        A ^ B : ����� ��Ʈ�� �ּ� �� ���� ���� ū ��Ʈ����  xor���� �Ѵ�.(A��B�� ��Ʈ���� �ٸ��� ����� 1)
	 *         ~ A  : A ������ ����� ��Ʈ���� ������Ų��. (1�� ���� ����� ����)
	 *      - ��Ʈ ����Ʈ ������
	 *        A << B  A�� B��Ʈ �������� �о��.		( <<----   )
	 * 		  A >> B  A�� B��Ʈ ���������� �о��.   (  ----->> )
	 * ��Ʈ & ������ Ȱ�� : MASK ��� 
	 *  ����� ����ũ 255.255.255.0
	 */
	final static int Locate_Deajeon = 0xF3;
	final static int Locate_Seoul = 0xF2;
	public static void main(String[] args) {
		/* �Ķ� �ſ� �ִ� 20ml �� ��װ�   ���� �ſ� �ִ� 10ml �� ����� ���� �ʰ� �Ű� ��´�.*/
		int blueCup = 20;
		int redCup = 10;
		int emptyCup = 0;
		
		/*�ӽ� ������ �̿��ؼ� �����͸� �±�ȯ �ϴ� ��� : Data Swap*/
		
		System.out.println("10 << 1 : " + (10 << 1));
		System.out.println("10 << 2 : " + (10 << 2));
		System.out.println("10 >> 1 : " + (10 >> 1));
		
		int EmployeeCode  = 0x00F34232;
		System.out.println("���� �ڵ� : " + EmployeeCode);
		int Mask = 0x00FF0000;
		int result = EmployeeCode & Mask;
		System.out.println("�����ڵ忡�� ������ : " + result);
		result = result >> 16;
		System.out.println("�����ڵ忡�� �����ſ� �ڸ����� ���� : " + result);
		
		
		
		
		System.out.println("�Ķ� ���� ��� : " + blueCup + "  ���� ���� ��� : " + redCup );
		emptyCup = blueCup;
		blueCup = redCup;
		redCup = emptyCup;
		System.out.println("�Ķ� ���� ��� : " + blueCup + "  ���� ���� ��� : " + redCup );
		
		blueCup ^= redCup;
		redCup ^= blueCup;
		blueCup ^= redCup;
		
		System.out.println("�Ķ� ���� ��� : " + blueCup + "  ���� ���� ��� : " + redCup );
	}
	
	
	
	/* �� ������  , �� ������ 
	 *  �� ������ --> ��ġ ��
	 *   x < 160
	 *  �ʰ� ( A > B)   �̸� (A < B)   �̻� (A >= B)     ���� (A <= B) 
	 *  ���� (A == B)     �ٸ���(A != B)
	 */
	public static void LogicEx() {
		int x = 0;
		x = 170;
		boolean bSmall = false;
		bSmall = x < 160;
		System.out.println(x + " < 160 --> " + bSmall);
		x = 150;
		bSmall = x < 160;
		System.out.println(x + " < 160 --> " + bSmall);
		
		
		int age = 23;
		boolean bHealthy = true;
		boolean HogukYoRam = false;
		/* 
		 * 20�� �̻��� ��ü �ǰ��� �����̸� 
		 *  ���� �մϴ�.
		 */
		
		HogukYoRam = (age >= 20 && age <34)  && bHealthy;
		
		System.out.println("���ߵ˴ϱ�? " + HogukYoRam);
		System.out.println("NO!!!!!" + !HogukYoRam);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
	
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		
		/* �� ������ : �ΰ��� boolean����� ���� ���� �Ǵ� ���� 
		 *            �ջ��ϴ� ���� 
		 * 
		 * ��ü�� �ǰ��ϴ� �׸��� 20�� �̻��̴�.   ---> AND ����  &&
		 * ���̰� 7�� ���� �̴�. �Ǵ� 70�� �̻��̴�. -> OR ����    ||
		 * 
		 *  ������ ����� �����Ѵ�.  ---> NOT ���� 			!   
		 */
		
		/*	true : not Zero
		 *  false : Zero */
		
		
	} 
	public static void ArithmeticEx(){
		//calcScore();
		/* ���� 1�� ���� ��Ų��.  x += 1 --> "+= 1" => ++
		 * ���� 1�� ���� ��Ų��.  x -= 1 --> "-= 1" => --
		 * 
		 */
		int number = 10;
		System.out.println("number ++ : " + --number); // 9
		System.out.println("number ++ : " + number++); //9
		System.out.println("number ++ : " + ++number);//11
		System.out.println("number ++ : " + number);//11
		System.out.println("number ++ : " + number--);//11
		System.out.println("number ++ : " + number--);//10
		//9
		
		number++;
		System.out.println(number);
		++number;
		System.out.println(number);
		 
		/*	number �� println�� �Ű������� ���ȴ�.
		 *  ++ �� �ǿ����� 
		 * 
		 *  ���������ڴ� �����ڰ� �ǿ������� �ڿ� �ִ� ��� �ٸ� ���ó�� ���� ���߿� ó���ȴ�..
		 *  ���������ڴ� �����ڰ� �ǿ������� �տ� �ִ� ��� �ٸ� ���ó�� ���� ���� ó���ȴ�..
		 */
		System.out.println("number : " + number);
		int x = 10;
		int y = 5;
		int z = 0;
		
		z = x++ + ++y;
	}
	public static void calcScore() {
		int Kor_Score = 0;
		int Eng_Score = 0;
		int Math_Score = 0;
		int Total_Score = 0;
		double Average_Score = 0.0;
		/* ���� ���� */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� > ");
		Kor_Score = sc.nextInt();
		Total_Score  = Total_Score + Kor_Score;
		
		System.out.print("���� ���� > ");
		Eng_Score = sc.nextInt();
		Total_Score  += Eng_Score;
		
		
		System.out.print("���� ���� > ");
		Math_Score = sc.nextInt();
		Total_Score = Total_Score + Math_Score;
		
		Average_Score = (double)Total_Score / 3; // double = 83.0  83.333333333
		
		System.out.println("���� : "+ Total_Score+ "\n��� : "+ Average_Score);
		
		
		
	}
	public static void Example01() {
		// TODO Auto-generated method stub
		int number = 10;
		byte oneByteInt = 10;
		short twoByteInt = 10;
		long BigSizeInt = 10L;
		number = 100;
		int x = 0, y = 0, z = 0;
		
		
		double dData = 3.16315;
		float fData = 13.4362f;
		/*number = 316.123;// Type MisMatch
		 * */
		/*	oneByteInt = BigSizeInt; Error : 1Byte ������ 8Byte ũ���� ���� �Է½õ� �ؼ�
		 * 									OverFlow
		 * 
		 */
		
		x = y = z = 100; 
		
		twoByteInt = oneByteInt; // 2Byte <- 1Byte
		number = twoByteInt;    // 4Byte <- 2Byte
		BigSizeInt = number;    // 8Byte <- 4Byte
		dData = fData;
		
		System.out.println(number);
		/* 
		 * ��Ģ ���� ( + , - , *  , / , % ) 
		 */
		
		x = 100; 
		y = 3;
		
		/* - : ���׿����� -> ��Ģ���� ����
		 *   : ���׿����� -> ���� ������ 
		 */
		z = - x + y;
		
		x = x + y;
		
		System.out.println(z);
		
		/* ���� ���� ���� ������ �Է��ϰ�  ������ ��������� ���Ѵ�.*/
		
		
	}
	
}
