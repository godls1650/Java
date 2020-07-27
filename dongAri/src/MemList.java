package dongAri.src;

public class MemList {
	// main 함수의 지역 변수로 객체 배열을 사용한다 .X
	// Member 객체로 이루어진 배열만 처리(관리)하는 클래스
	private Member[] arr; // 회원을 저장할 배열
	private int Capacity; // 배열의 최대 인덱스
	private int Size;// 배열의 현재 인덱스
	{	// 초기화 블록
		Size = 0;
	}
	public MemList(int capacity) {
		this.arr = new Member[capacity];
		this.Capacity = capacity; 
	}
	// 졸업생
	public void append(String name,int joinYear, String address,String phonenum) {
		if(Size == Capacity) return ;
		arr[Size] = new Graduate(name, joinYear, address, phonenum);
		Size ++;
	}
	
	public void append(String name, int joinYear, String address, String phonenum, int Grade, int Position) {	
		if(Size == Capacity) return ;
		arr[Size] = new Student(name,joinYear, address, phonenum, Grade, Position);
		Size ++;
	}
	
	public void append(String name, int joinYear, String address, String phonenum, int Grade, int Position, boolean cost) {
		if(Size == Capacity) return ;
		arr[Size] = new NewBi(name,joinYear, address, phonenum, Grade, Position,cost);
		Size ++;
	}
	// append()
	public void append(Member Load) {
		//instanceof 연산자 
		if(Size == Capacity) return ;
		
		if(Load instanceof NewBi) 			arr[Size] = new NewBi((NewBi)Load);
		else if(Load instanceof Student) 	arr[Size] = new Student((Student)Load);
		else 								arr[Size] = new Graduate((Graduate)Load);
		Size ++;
	}
	
	public void showList() {
	
		for(int i = 0 ; i < Size; i++) {
				System.out.println(arr[i]);
		}
	}
	public void ViewNewBiCluster() {
		for(int i = 0 ; i < Size; i++) {
			if(arr[i] instanceof NewBi)
				System.out.println(arr[i]);
		}
	}
	
}








