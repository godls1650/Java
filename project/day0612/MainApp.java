package project.day0612;
// ���� :    ���α׷��� ���� �� �� �ڵ�� �ν����� �ʴ� ���� 
/*
 *  �Լ� (function) : ���α׷��� ����  
 * �޼��� (method ) : ��� ��ü�� ���� 
 *   
 *   ��ü (Object, Instance) : �����̳� �繰 ��   
 */

/* ���� (Variable) : ���ѿ� ����� ��� �� �� �ϳ��� �����ϴ� ����
 * ������ Ÿ�� 
 *  ���� �̸�
 *  ������ ���� --> Ÿ�Ը�  �����̸�;
 *  ���� / ���� / �Ǽ� / ����  --> �⺻ ������ Ÿ�� (Default Data Type)
 */

import java.util.*;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������·� �غ��� ���̿� ���̸� �����ϴ� ������ �����.
		// �밡���� ǥ��� 
		int nWidth  = 0;
		int nHeight = 0;
		boolean bClear = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("�غ��� ���̸� �Է��ϼ��� > ");
		nWidth = sc.nextInt();
		System.out.println("���̸� �Է��ϼ��� > ");
		nHeight = sc.nextInt();
		
		//nWidth = 11;	/* ����  =   :: ��ȣ */
		//nHeight = 21;  /* ���α׷���  = :: ���� ���� */
		// ���̰� 20�̰� �غ��� 10�� �簢���� ���̴� 200 �Դϴ�.
		
		System.out.println("���̰� " + nHeight + "�̰� �غ��� " + nWidth + "�� �簢���� ���̴� " +
		                      nHeight * nWidth + " �Դϴ�.");
		
		System.out.println("���̰� " + nHeight + "�̰� �غ��� " + nWidth + "�� �ﰢ���� ���̴� " +
                nHeight * nWidth / 2 + " �Դϴ�.");
		
		System.out.println("hello world");
		System.out.println("hi!");
	}

}
