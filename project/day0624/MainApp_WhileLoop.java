package project.day0624;

import java.util.Scanner;

/* �ݺ���� 
 *  ���� ����( ���) �� �ڵ带 �ݺ���Ű�� ���
 *   - ����ڰ� 'N' �Ǵ� 'n'�� �Է��ϱ� �� ���� ��� ���α׷��� �����Ѵ�.
 *   - �������� ù��° �� ���� ������ �� ���� ��� ����Ѵ�.
 *   - ���� �ݺ�
 *   - ..etc
 *   
 *   if -> ����Ȯ�� -> ��� ���� ���θ� ����  --> ���� -> ��� ���� �������� �̵�
 *   while -> ���� Ȯ�� ��� ���� ���θ� ���� --> ���� -> ���� �������� �̵� -> ����Ȯ�� ->���� ->...
 * 
 */
public class MainApp_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int x = 0;
		int y = 0;
		double result = 0.0;
		
		int num1 = 0;
		int num2 = 3;
		
		
		
		while(true) {
			//y = 0.0;
			System.out.print("���ڸ� �Է��ϼ��� > ");
			x = sc.nextInt();
			
			
			do{
				System.out.print("�и� �Է��ϼ��� > ");
				y = sc.nextInt();
			}while(y == 0);
			 
			 
			result = (double)x/y;
			//   1/
			//   /0  ==> Infinite -->  Exception  =>  Divide by Zero
			System.out.println(x + "/" + y + "=" + result);
		}
	}

}


/* 

Scanner sc = new Scanner(System.in);
System.out.print("���ڸ� �Է� �ϼ��� > ");
number = sc.nextInt();

if(number < 0) {
	System.out.print("IF_CONTROL : ������ �Է��߽��ϴ�. ���Է� >");
	number = sc.nextInt();
}

while( number < 0 ) {
	System.out.print("while_CONTROL : ������ �Է��߽��ϴ�. ���Է� >");
	number = sc.nextInt();
}

		int number2 = 0;
while(number <= 0) {
	System.out.print("while_CONTROL : ������ �Է��߽��ϴ�. ���Է� >");
	number = sc.nextInt();
	
	//if(number > 0) break;
}

System.out.println("�Էµ� ���� : " + number);

// 0�� ������ �ٸ����� �Է¹޴´�. 

����ڿ��� �Է¹��� ���� ������� �ٽ� �Է¹ް��Ѵ�.*/




