package project.day0710;
/* 상속을 사용하지 않은 Student class */
public class Student {
	private Person st_p;
	private int [] Score;
	{
		Score = new int [5];
	}
	public Student() {
		st_p = new Person();
	}
	public Student(String name, int age, int k, int e, int m, int sc, int so) {
		st_p = new Person(name, age);
		Score[0] = k;
		Score[1] = e;
		Score[2] = m;
		Score[3] = sc;	
		Score[4] = so; 
	}
	public void showInfo() { // 상속 받은 데이터 중 메서드 를
		this.st_p.showInfo();
		System.out.printf("\n국어:%d\n영어:%d\n수학:%d\n과학:%d\n사회:%d\n",
				Score[0],Score[1],Score[2],Score[3],Score[4]);
	}
	
}
