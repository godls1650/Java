package project.day0710;
/*	��Ÿ ������ 
 * 
 *  ��� Ŭ������ Object Ŭ������ ��ӹ޴´�.
 */

// ���� ��� ��ǰ�� ���� �κ� ���� �ۼ��� Ŭ���� --> ��� ��ǰ������ ���� �κ����� �߻�ȭ �Ѵ�.
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
						//���ӽ� ��ü
			return new String().format("��ǰ�ڵ� : %d\n��ǰ�� : %s\n�ݾ�%d\n", Code,Title, Price);
		}
	
}
