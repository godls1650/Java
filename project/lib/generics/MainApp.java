package project.lib.generics;

import java.util.Vector;

/*  �ٱ��� Ŭ���� 
 *   --> ���ϸ� ���� �� ���� 
 *   
 *   �ٱ��� Ŭ������ Ÿ�Ժ��� T�� �ݵ�� ���� Ŭ������ ��� ���� Ŭ������ ��� �� �� �ִ�.
 *    ��--> ���ϵ� ī�� 
 * 
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Pair<Integer,  FruitBox<Fruit>>> vec1 = new Vector<Pair<Integer,FruitBox<Fruit>>>();
		vec1.add(new Pair<Integer, FruitBox<Fruit>>(1234215, new FruitBox<Fruit>()));
	
		
	}

}
