package project.lib.adt.list;

public class Node {
	private int Value;// ����� ��
	private Node Next;// �������� ������
	private Node Prev;// �������� ������
	
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

