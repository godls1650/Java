package dongAri.src;
/*
 * ��å���� ����� ó���Ѵ�.
 * �ڵ尪 --> ���ڿ� ����� ġȯ 
 * 
 * ��å �ڵ忡 ���õ� ������� ���� �ٸ� ���Ͽ� �ۼ� 
 * ���� ������ �����ϴ� �޼��嵵 ���� ���Ѽ� 
 * 
 * �������  �߻� �޼��常�� ������ �ִ� ������ ���̺귯���� �߰��ϴ� ��� 
 *  --> implements --> �������̽� �߰��� ��� 
 *  
 *  interface � ������ �����ϰ� ������ �� ��
 */

// �߻� Ŭ���� (Member)�� ��� �ް� �������̽�(CodeUseable)�� ������  �߻�Ŭ����(Attend)
// �������� �л�(���л� + ���Ի�) �θ� Ŭ���� 

public abstract class Attend extends Member implements CodeUseable{

	protected int nGrade;		// �г�
	protected int position; 	// ��å
	
	public Attend() {
		super();
		// TODO Auto-generated constructor stub
		this.nGrade = 1;
		this.position = 0;
	}
	
	public Attend(String name, int joinYear, String address, String phonenum, int Grade, int Position) {
		// TODO Auto-generated constructor stub
		super(name, joinYear, address, phonenum);
		this.nGrade = Grade;
		if(Position < MinParam || Position > MaxParam) {
			this.position = defMember;
		}
		else {
			this.position = Position;
		}
		
	}

	public Attend(Attend src) {
		super(src);
		// TODO Auto-generated constructor stub
		this.nGrade = src.nGrade;
		this.position = src.position;
	}
	
	
	
	
	
}










