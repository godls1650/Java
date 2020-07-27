package dongAri.src;
/*	-> ���� �ۼ����� Ŭ������   ���� �ν��Ͻ�ȭ �� ���� ����.
 *     --> ���� �ۼ����� Ŭ������ ��� ���� ���� �ۼ� �Ǿ��ִ�.
 * 	   --> ��쿡 ���� �� Ŭ������ �޼���� ���� �� �ʿ䰡 ���� �� �ִ�.
 *       ---> �� Ŭ������ �޼��� �� ����� ��� �ڽ� Ŭ�������� ������ �޼��带 ����ϰ� �ϱ� ���ؼ�
 *             �޼����� ���¸� �ְ� ���� �� �ʿ䰡 ���� --> ��� ���� ��ü�� �������̵� �ؼ� ���� �ϰ� �Ѵ�.(������)
 */
public abstract class Member { // �߻� Ŭ����  --> ���ǵ� �޼��� �� �߻� �޼��尡 �ִ�.
	
	public static final int FoundingYear = 1984; // â�� �⵵ 
	protected String sName;		// �̸�
	protected int nCardinal; 	// ���
	
	protected String sAddress;	// �ּ�
	protected String sPhoneNum; // ��ȭ��ȣ
	
	//Constructor  --> �����ڴ� �߻�ȭ ��ų �� ����.//
	public Member() {
		this("",2020,"","");
	}
	public Member(String name,int joinYear, String address,String phonenum) {
		sName = new String(name);
		nCardinal = joinYear - FoundingYear;
		
		sAddress = new String(address);
		sPhoneNum = phonenum;
	}
	public Member(Member src) {
		this(src.sName, 0,src.sAddress, src.sPhoneNum);
		this.nCardinal  = src.nCardinal;
	}
	
	// ���� ���� ���� ����� �Լ� 
	public abstract void LoadFromFile(String fileName);
	
}





