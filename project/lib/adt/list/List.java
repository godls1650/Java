package project.lib.adt.list;

public class List {
	private Node Head;
	private Node Tail;
	private int Capacity;
	private int Size;
	
	{
		Head = new Node();
		Tail = new Node();
		Head.setNext(Tail);
		Tail.setPrev(Head);
		Size = 0;
	}
	public List() {this.Capacity = 10;}
	public List(int Capacity) {
		this.Capacity = Capacity;
	}
	public void add(int v) {
		Node newNode = new Node(v);
		// ���� �������� �߰��� ���� Tail ��� ���̿�  �� ��带 �߰��Ѵ�.
		Node Last = this.Tail.getPrev();
		newNode.setPrev(Last);
		newNode.setNext(Tail);
		Last.setNext(newNode);
		Tail.setPrev(newNode);
	}
	public void ShowListElements() {
		Node cursor = Head.getNext();
		
		while(cursor != Tail) {
			System.out.printf("%2d -> ", cursor.getValue());
			cursor = cursor.getNext();
		}
		System.out.printf("\n");
	}
	
	public int deleteElement(int locate) {
		Node cursor = Head;
		for(int i =0; i < locate; i++) 
			cursor = cursor.getNext();
		
		cursor.getPrev().setNext(cursor.getNext());
		cursor.getNext().setPrev(cursor.getPrev());
		
		return cursor.getValue();
	}
	public Node start() {	return Head.getNext();}
	public Node end() {	return Tail;}
	
	// ���� Ŭ����
	class myIterator{
		private Node Iter;
		{
			Iter = null;
		}
		public myIterator() {
			Iter = Head.getNext();
			
		}
		public void increase() {
			Iter = Iter.getNext();
		}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if (obj instanceof Node) {
				if(Iter == Tail) return true;
				else return false;
			}
			return false;
		}
		public int get() {return Iter.getValue();}
		public void set(int v) {
			Iter.setValue(v);
			}
	}
	
}











