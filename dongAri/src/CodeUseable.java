package dongAri.src;

public interface CodeUseable {
	public static final int MaxParam = 6;
	public static final int MinParam = 0;
	
	public static final int defMember = 0;
	public static final int chairman = 1;
	public static final int subchairman = 2;
	public static final int steward = 3;
	public static final int executer = 4; // 일반임원 
	public static final int cardinal_mst = 5;
	public static final int cardinal_submst = 6;
	
	public static final String [] szPosition = {"회원", "회장", "부회장","총무", "임원", "기장", "부기장"};
	
	// 재학생의 경우 0 ~ 6 모든 원소를 사용 할 수 있다.
	// 신입생의 경우 5, 6, 0 3가지만 사용 할 수 있다.
	public abstract int setPosition(int pos);
	public abstract String getPosString();
	
}
