package project.day0710;
/*	�����ε�  --> �̸��� ���� ���ο� �޼��带 ���� �Ѵ�. --> Create
 *  ���� ���̵� -> ��� ���� �޼��带 �����Ѵ�.       --> Modify
 */
public class StudentEx extends Person{
	private int [] Score;
	
	{
		Score = new int [5];
	}
	
	public StudentEx() { super(); }
	public StudentEx(String name, int age , int k, int e, int m, int sc, int so) { super(name,age);
		Score[0] = k;
		Score[1] = e;
		Score[2] = m;
		Score[3] = sc;
		Score[4] = so;
	}
	//public void ShowInfo() --> super.showInfo()��� ���� ������ �� �޼��� ��
	public void showInfo() { //   �ڽ� Ŭ�������� �����ϴ� ��� : �Ű������� ���� X --> �����ε�X
		//		�޼��� ���� ���̵� (Overriding)
		super.showInfo();
		System.out.printf("\n����:%d\n����:%d\n����:%d\n����:%d\n��ȸ:%d\n",
				Score[0],Score[1],Score[2],Score[3],Score[4]);
	}
}
