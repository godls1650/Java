package dongAri.src;
/*
 * 직책값을 상수로 처리한다.
 * 코드값 --> 문자열 상수로 치환 
 * 
 * 직책 코드에 관련된 상수값을 따로 다른 파일에 작성 
 * 관련 동작을 실행하는 메서드도 포함 시켜서 
 * 
 * 상수값과  추상 메서드만을 가지고 있는 구조의 라이브러리를 추가하는 경우 
 *  --> implements --> 인터페이스 추가에 사용 
 *  
 *  interface 어떤 동작을 가능하게 구성해 준 것
 */

// 추상 클래스 (Member)를 상속 받고 인터페이스(CodeUseable)를 장착한  추상클래스(Attend)
// 재학중인 학생(재학생 + 신입생) 부모 클래스 

public abstract class Attend extends Member implements CodeUseable{

	protected int nGrade;		// 학년
	protected int position; 	// 직책
	
	public Attend() {
		super();
		// TODO Auto-generated constructor stub
		this.nGrade = 1;
		this.position = 0;
	}
	
	public Attend(String name, int joinYear, String address, String phonenum, int Grade, int Position) {
		// TODO Auto-generated constructor stub
		super(name, joinYear, address, phonenum);
		this.nGrade = Grade;
		if(Position < MinParam || Position > MaxParam) {
			this.position = defMember;
		}
		else {
			this.position = Position;
		}
		
	}

	public Attend(Attend src) {
		super(src);
		// TODO Auto-generated constructor stub
		this.nGrade = src.nGrade;
		this.position = src.position;
	}
	
	
	
	
	
}










