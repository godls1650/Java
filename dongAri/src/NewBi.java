package dongAri.src;

public class NewBi extends Attend{
	private boolean m_bCost;
	
	public NewBi() {
		super();
		// TODO Auto-generated constructor stub
		this.m_bCost = false;
	}

	public NewBi(NewBi src) {
		super(src);
		// TODO Auto-generated constructor stub
		this.m_bCost = src.m_bCost;
	}

	public NewBi(String name, int joinYear, String address, String phonenum,
			int Grade, int Position, boolean cost) {
		super(name, joinYear, address, phonenum, Grade, Position);
		// TODO Auto-generated constructor stub
		this.m_bCost = cost;
	}
	
	@Override
	public int setPosition(int pos) {
		// TODO Auto-generated method stub
		if(pos == 5 || pos == 6) this.position = pos;
		else position = 0;
		return 0;
	}

	@Override
	public String getPosString() {
		// TODO Auto-generated method stub
		return szPosition[position];
	}

	@Override
	public void LoadFromFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new String().format("%-20s %2d기  %d학년 %-15s %-10s %-30s %s",
				sName, nCardinal, nGrade,
				m_bCost ? "회비 납입" : "회비 미납"
				, szPosition[position]  ,sAddress,sPhoneNum);
		//      이름    XX기    X학년    회원  주소가 주르르르륵
	}
}
