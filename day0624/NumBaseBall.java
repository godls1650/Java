package project.day0624;
/* 
 * ����� 31���� ���ƶ�  --> count  --> for
 * 
 * �� �ܿ￡ ���뱸���� ���� �������� ���ƶ� --> while
 * 
 * 
 * for��
 * 
 * for(A ; B ; C )
 * 
 * A : ī��Ʈ�� ������ ���� 
 * B : ũ��� ����   A�� ����� ������ �ִ� ���� ������ �� ����
 * C : ����� �ѹ� ���� �� ������ A�� ����, ���� ��Ű�� ���� 
 */
public class NumBaseBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i < 10; i ++) {
			System.out.println("<< "+i+"�� >>");
			
			for(int j = 1; j < 10; j ++) {
				System.out.println((i+" x "+j+"=" + i*j));
			}
			System.out.println();
		}
		
		
	}

}
