package project.day0710;

public class Cloth extends Product{
	private boolean gender;
	public Cloth() {
		super(0,"",0);
		gender = false;
	}
	public Cloth(int code, String title, String sGender, int price) {
		super(code, title, price);
		gender = sGender.compareTo("��") == 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new String().format(
				"��ǰ�ڵ� : %d\n�з� : �Ƿ�\n��ǰ�� : %s\n���� : %s����\n�ݾ� : %d��\n",
				Code,Title,
					gender ? "��" : "��",
				Price);
	}
}
