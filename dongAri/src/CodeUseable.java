package dongAri.src;

public interface CodeUseable {
	public static final int MaxParam = 6;
	public static final int MinParam = 0;
	
	public static final int defMember = 0;
	public static final int chairman = 1;
	public static final int subchairman = 2;
	public static final int steward = 3;
	public static final int executer = 4; // �Ϲ��ӿ� 
	public static final int cardinal_mst = 5;
	public static final int cardinal_submst = 6;
	
	public static final String [] szPosition = {"ȸ��", "ȸ��", "��ȸ��","�ѹ�", "�ӿ�", "����", "�α���"};
	
	// ���л��� ��� 0 ~ 6 ��� ���Ҹ� ��� �� �� �ִ�.
	// ���Ի��� ��� 5, 6, 0 3������ ��� �� �� �ִ�.
	public abstract int setPosition(int pos);
	public abstract String getPosString();
	
}
