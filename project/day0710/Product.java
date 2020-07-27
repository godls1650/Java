package project.day0710;
/*	메타 데이터 
 * 
 *  모든 클래스는 Object 클래스를 상속받는다.
 */

// 사용될 모든 상품의 공통 부분 만을 작성한 클래스 --> 모든 상품정보의 공통 부분으로 추상화 한다.
public class Product {
	protected int Code;
	protected String Title;
	protected int Price;
	public Product() {this(0,"",0);}
	public Product(int c,String title, int p) {
		Title = new String(title);
		Code = c; Price = p;
	}
	public Product(Product obj) {this(obj.Code, obj.Title, obj.Price);}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub   
						//↓임시 객체
			return new String().format("상품코드 : %d\n상품명 : %s\n금액%d\n", Code,Title, Price);
		}
	
}
