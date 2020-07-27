package project.day0708;

import java.util.Scanner;

public class Book {
	// Book Class Attribute
	static int Count;
	
	private int m_Key;
	private String m_Title;
	private String m_Author;
	private String m_Company;
	private int price;
	
	// Book Class Constructor
	public Book(){this("","","",0);}  //����Ʈ �����ڸ� ���� 
	/* this ��ü 
	 *  --> �� ��ü�� ���̳� �޼��带 ��Ÿ���� ���ؼ� ���Ǵ� ��ü 
	 *      �޼����� ��ȯ���� ���� �� ��ü�� ��� --> return  
	 */
	// ������ �����ε� 
	public Book(String title, String author, String company, int price){ //����Ʈ �����ڸ� ���� 
		m_Title = new String(title);  //default ������ --> ������ ������ �ʱ�ȭ�� null ������ �ϱ� ������ 
		m_Author = new String(author);
		m_Company = new String(company);
		this.price = price; // �� ��ü������ ��
		this.m_Key = SetCode(this);
		Count ++;
	}
	// �ٸ� �ν��Ͻ��� �����ϴ� ������ --> ���� ������ 
	public Book(Book other){
		this(other.m_Title, other.m_Author,other.m_Company,other.price);
	}
	
	//�츮 ��ü�� ��� ������ �Ϸù�ȣ�� ���� ����� �����ϴ�.
	private static int SetCode(Book instance) {
		// �Ϸù�ȣ --> �ߺ��� �� ���� .
		int Code = 0;
		int t = instance.m_Title.hashCode();
		t /=1000;
		t = t < 0 ? -t : t;
		Code += t;
		t = instance.m_Author.hashCode();
		t /=1000;
		t = t < 0 ? -t : t;
		Code += t;
		
		t = instance.m_Company.hashCode();
		t /=1000;
		t = t < 0 ? -t : t;
		Code += t;
		
		Code += instance.price;
		
		System.out.println(instance.m_Title+ "�� ������ ������ȣ : " + Code);
		
		return Code;
	}
	
	public int GetCode() {
		return this.m_Key;
	}
	
	public void show() {
		System.out.printf("[%d]%-20s%-20s%-20s%3d,%03d��\n", 
				m_Key,m_Title,m_Author,m_Company,price/1000, price %1000);
		
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ > ");		this.m_Title = sc.nextLine();
		System.out.print("��   �� > ");	this.m_Author = sc.nextLine();
		System.out.print("���ǻ� > ");		this.m_Company = sc.nextLine();
		System.out.print("��   �� > ");	this.price = sc.nextInt();
		this.m_Key = SetCode(this);
	}
	public String getM_Title() {
		return m_Title;
	}
	public void setM_Title(String m_Title) {
		this.m_Title = m_Title;
	}

}






