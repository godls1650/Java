package project.day0710;

public class StudentDef {
	private String sName;
	private int nAge;
	private int [] Score;
	{
		Score = new int [5];
	}
	public StudentDef() {
		
		this("",0,0,0,0,0,0);
	}
	public StudentDef(String n , int age,int k, int e, int m, int sc, int so) {
		sName = new String(n); 
		nAge = age;
		Score[0] = k;
		Score[1] = e;
		Score[2] = m;
		Score[3] = sc;
		Score[4] = so;
	}
	
	public void showInfo() {
		System.out.printf("name : %s\nage : %d",sName, nAge);
		System.out.println("����");
		System.out.printf("����:%d\n����:%d\n����:%d\n����:%d\n��ȸ:%d\n",
				Score[0],Score[1],Score[2],Score[3],Score[4]);
		
	}
	
}
