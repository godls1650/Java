package project.day0710;
/* 접근제어자 protected    상속 관계인 자식 클래스의 접근은 허용한다.  그 외의 접근은 차단.
 * 
 */

public class Person {
	protected String sName;
	protected int nAge;
	
	public Person() {
		this("",0);
	}
	public Person(String n , int age) {
		sName = new String(n); 
		nAge = age;
	}
	public Person(Person obj) {
		this( obj.sName,obj.nAge );
	}
	
	public void showInfo() {
		System.out.printf("name : %s\nage : %d",sName, nAge);
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getnAge() {
		return nAge;
	}
	public void setnAge(int nAge) {
		this.nAge = nAge;
	}
}
