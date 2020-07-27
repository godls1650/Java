package project.day0710;
/*	오버로딩  --> 이름만 같은 새로운 메서드를 정의 한다. --> Create
 *  오버 라이딩 -> 상속 받은 메서드를 개량한다.       --> Modify
 */
public class StudentEx extends Person{
	private int [] Score;
	
	{
		Score = new int [5];
	}
	
	public StudentEx() { super(); }
	public StudentEx(String name, int age , int k, int e, int m, int sc, int so) { super(name,age);
		Score[0] = k;
		Score[1] = e;
		Score[2] = m;
		Score[3] = sc;
		Score[4] = so;
	}
	//public void ShowInfo() --> super.showInfo()상속 받은 데이터 중 메서드 를
	public void showInfo() { //   자식 클래스에서 변경하는 방식 : 매개변수의 변경 X --> 오버로딩X
		//		메서드 오버 라이딩 (Overriding)
		super.showInfo();
		System.out.printf("\n국어:%d\n영어:%d\n수학:%d\n과학:%d\n사회:%d\n",
				Score[0],Score[1],Score[2],Score[3],Score[4]);
	}
}
