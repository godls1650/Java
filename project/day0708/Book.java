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
	public Book(){this("","","",0);}  //디폴트 생성자를 제거 
	/* this 객체 
	 *  --> 이 객체의 값이나 메서드를 나타내기 위해서 사용되는 객체 
	 *      메서드의 반환값이 현재 이 객체인 경우 --> return  
	 */
	// 생성자 오버로딩 
	public Book(String title, String author, String company, int price){ //디폴트 생성자를 제거 
		m_Title = new String(title);  //default 생성자 --> 참조형 변수의 초기화를 null 값으로 하기 때문에 
		m_Author = new String(author);
		m_Company = new String(company);
		this.price = price; // 이 객체내부의 값
		this.m_Key = SetCode(this);
		Count ++;
	}
	// 다른 인스턴스를 복사하는 생성자 --> 복사 생성자 
	public Book(Book other){
		this(other.m_Title, other.m_Author,other.m_Company,other.price);
	}
	
	//우리 업체는 모든 도서의 일련번호를 찍어내는 방식이 동일하다.
	private static int SetCode(Book instance) {
		// 일련번호 --> 중복될 수 없다 .
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
		
		System.out.println(instance.m_Title+ "의 생성된 관리번호 : " + Code);
		
		return Code;
	}
	
	public int GetCode() {
		return this.m_Key;
	}
	
	public void show() {
		System.out.printf("[%d]%-20s%-20s%-20s%3d,%03d원\n", 
				m_Key,m_Title,m_Author,m_Company,price/1000, price %1000);
		
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("도서명 > ");		this.m_Title = sc.nextLine();
		System.out.print("저   자 > ");	this.m_Author = sc.nextLine();
		System.out.print("출판사 > ");		this.m_Company = sc.nextLine();
		System.out.print("가   격 > ");	this.price = sc.nextInt();
		this.m_Key = SetCode(this);
	}
	public String getM_Title() {
		return m_Title;
	}
	public void setM_Title(String m_Title) {
		this.m_Title = m_Title;
	}

}






