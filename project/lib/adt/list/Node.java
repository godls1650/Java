package project.lib.adt.list;

public class Node {
	private int Value;// 사용할 값
	private Node Next;// 다음순서 데이터
	private Node Prev;// 이전순서 데이터
	
	{
		Next = null;
		Prev = null;
	}
	
	public Node() { this(0);}
	public Node(int v) {Value = v;}
	public Node(Node n) { this(n.Value);}
	
	public void setValue(int value) { 	Value = value; }
	public void setNext(Node next) { Next = next; }
	public void setPrev(Node prev) { Prev = prev; }
	
	public int getValue() { return Value; }
	public Node getNext() { return Next; }
	public Node getPrev() { return Prev; }
	
	
	
}

