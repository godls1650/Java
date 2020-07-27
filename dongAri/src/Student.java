package dongAri.src;

public class Student extends Attend{
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Student src) {
		super(src);
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int joinYear, String address, String phonenum, int Grade, int Position) {
		super(name, joinYear, address, phonenum, Grade, Position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int setPosition(int pos) {
		// TODO Auto-generated method stub
		if(pos < MinParam || pos > MaxParam) {
			pos = 0;
		}
		this.position = pos;
		return 0;
	}

	@Override
	public String getPosString() {
		// TODO Auto-generated method stub
		return szPosition[this.position];
	}

	@Override
	public void LoadFromFile(String fileName) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new String().format("%-20s %2d기  %d학년 %-10s %-30s %s",
				sName, nCardinal, nGrade, szPosition[position]  ,sAddress,sPhoneNum);
		//      이름    XX기    X학년    회원  주소가 주르르르륵
	}
}




