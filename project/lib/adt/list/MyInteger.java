package project.lib.adt.list;

public class MyInteger {
	private int value;
	public MyInteger() {
		this(0);
	}
	public MyInteger(int Int) {
		value = Int;
	}
	public MyInteger(MyInteger source) {
		this(source.value);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new String().format("%d", value);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
