package project.day0710;
/* ���������� protected    ��� ������ �ڽ� Ŭ������ ������ ����Ѵ�.  �� ���� ������ ����.
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
