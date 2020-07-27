package project.day0706;
/* Simula

 *  �繰�̳� ������ ���� �����ϴ� �κ� --> �Ӽ� (Attribute)
 *  �繰�̳� ������ ����,�ൿ, ���, ó�� ..etc���� �ڵ�� ������ �κ� --> �޼���(Method) 
 *  
 *  class �� {
	 *   ǰ��
	 *   ǰ��_Sound
	 *   �̸�
	 *   Ű, ������
	 *   ������� 
	 *   ..etc
	 *   
	 *   ¢�´�.
	 *   �Դ´�.
	 *   �ܴ�.
	 *   �̵��Ѵ�.
 *   }
 */


/*
 * ��ü���� ���α׷��� 
 * ��ü���� 3���
 * 
 * ĸ��ȭ (enCapsulation) --> ���õ� ��� �͵��� �ϳ��� ������.
 *                      --> ����� ��� ������ �ܺη� ���� ��ȣ�Ѵ�. 
 *                           �� �ܺ��� ���ٿ����� ������ �㰡, ���� �Ѵ�. 
 *   <<Ŭ���� ���� ����>>
 * ���� ������ (Access Modifier)
 * private   : ��� ������ ����  ------------------> ���� ����
 * protected : ��Ӱ��� �� ���� Ŭ������ ������ ���
 * public	 : ��� ���ٿ����� ���
 * default   : �� ��Ű�� �ȿ����� ������ ��� ���
 * 
 *   -> �ܺ��� ������ ����ϸ�
 *     main�Լ��� B Ŭ������ �ν��Ͻ��� �������� A Ŭ������ �ν��Ͻ��� ���� ������ �� �ִ�.
 *     ==> main�Լ��� B Ŭ������ �ν��Ͻ��� ���۸���  A Ŭ������ �ν��Ͻ��� ���� ������ �� �ִ�.
 *     
 *     AŬ������ �ν��Ͻ� ���� BŬ������ �ν��Ͻ��� ������ ����� �� ����. ---> ���յ��� ����/ �������� ���� / ������ ����������.
 *                                                         -> �������̽��� ����������.
 *     ->  BŬ������ AŬ������ ��� ���ҿ� ���ٰ����ؾ� �Ѵ�.
 *     
 *   
 * ��Ӽ� / ������ 
 * 
 * 
 * ��ü���� 5��Ģ (SOLID ��Ģ)
 * 
 * S - Single Responsibility Principle  (SRP) : ���� å�� ��Ģ
 *  - ��� Ŭ������ �� �ϳ��� å���� ���´�. 
 *    ex) ��� ��ü�� ��¸� �ϸ�ȴ�.
 *        ��ĳ�� ��ü�� �Է¸� �ϸ�ȴ�.
 *        Dog ��ü�� Dog�� ����ó���� �ϸ� �ȴ�.
 *        
 *        
 *    =============> �����͸� �ʱ�ȭ �ϴ� ���� --> ������ (Constructor)
 *                   �����͸� ����ϴ� ��� ���� --> Method()
 *                                               �� �����͸� �� ����ϴ� �޼��� --> getter / setter
 *        
 *  OLID 
 */




import java.util.Scanner;

import project.day0706.Dog;


public class MainApp {
	public static void Swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		
	}
	public static void Swap(int [] x, int [] y) {
		int temp = x[0];
		x[0] = y[0];
		y[0] = temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV();
		int sw = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1. ChUP 2.ChDn 3. VUp 4. VDn 5.Power");
			sw = sc.nextInt();
			switch(sw) {
			case 1: myTV.ChannelUp(); break;
			case 2: myTV.ChannelDown(); break;
			case 3: myTV.VolumeUp(); break;
			case 4: myTV.VolumeDown(); break;
			case 5: myTV.pushPwrButton(); break;
			
			}
			System.out.println(myTV);
		}
		
	}

}









