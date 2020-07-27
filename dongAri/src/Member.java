package dongAri.src;
/*	-> 현재 작성중인 클래스가   절대 인스턴스화 될 일이 없다.
 *     --> 현재 작성중인 클래스는 상속 만을 위해 작성 되어있다.
 * 	   --> 경우에 따라서 이 클래스의 메서드는 구현 할 필요가 없을 수 있다.
 *       ---> 이 클래스의 메서드 중 몇몇은 모든 자식 클래스에서 동일한 메서드를 사용하게 하기 위해서
 *             메서드의 형태만 있고 정의 할 필요가 없다 --> 상속 받은 객체가 오버라이딩 해서 정의 하게 한다.(강제적)
 */
public abstract class Member { // 추상 클래스  --> 정의된 메서드 중 추상 메서드가 있다.
	
	public static final int FoundingYear = 1984; // 창립 년도 
	protected String sName;		// 이름
	protected int nCardinal; 	// 기수
	
	protected String sAddress;	// 주소
	protected String sPhoneNum; // 전화번호
	
	//Constructor  --> 생성자는 추상화 시킬 수 없다.//
	public Member() {
		this("",2020,"","");
	}
	public Member(String name,int joinYear, String address,String phonenum) {
		sName = new String(name);
		nCardinal = joinYear - FoundingYear;
		
		sAddress = new String(address);
		sPhoneNum = phonenum;
	}
	public Member(Member src) {
		this(src.sName, 0,src.sAddress, src.sPhoneNum);
		this.nCardinal  = src.nCardinal;
	}
	
	// 이후 사용될 파일 입출력 함수 
	public abstract void LoadFromFile(String fileName);
	
}





