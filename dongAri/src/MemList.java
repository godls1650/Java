package dongAri.src;

public class MemList {
	// main �Լ��� ���� ������ ��ü �迭�� ����Ѵ� .X
	// Member ��ü�� �̷���� �迭�� ó��(����)�ϴ� Ŭ����
	private Member[] arr; // ȸ���� ������ �迭
	private int Capacity; // �迭�� �ִ� �ε���
	private int Size;// �迭�� ���� �ε���
	{	// �ʱ�ȭ ���
		Size = 0;
	}
	public MemList(int capacity) {
		this.arr = new Member[capacity];
		this.Capacity = capacity; 
	}
	// ������
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
		//instanceof ������ 
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








