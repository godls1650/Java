package project.lib.adt.list;

import java.util.Iterator;
import java.util.LinkedList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iterator<E>
		
		List L1 = new List();
		L1.add(10);
		L1.add(8);
		L1.add(7);
		L1.add(9);
		L1.add(14);
		L1.ShowListElements();
		
		
		
		for(List.myIterator it = L1.new myIterator(); !(it.equals(L1.end())) ; it.increase()) {
				it.set( it.get()*10 );
				System.out.println(it.get());
		}
		
		
		//Ư�� �ϳ��� �� --> ����Ʈ�� ���Ե� ����� ���� ó���ϴ� �޼����� ���� 
	}
}


