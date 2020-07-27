package project.day0710;

public class Cloth extends Product{
	private boolean gender;
	public Cloth() {
		super(0,"",0);
		gender = false;
	}
	public Cloth(int code, String title, String sGender, int price) {
		super(code, title, price);
		gender = sGender.compareTo("남") == 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new String().format(
				"상품코드 : %d\n분류 : 의류\n상품명 : %s\n성별 : %s성용\n금액 : %d원\n",
				Code,Title,
					gender ? "남" : "여",
				Price);
	}
}
