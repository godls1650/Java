package project.lib.generics;

import java.util.Vector;
/*	���ϵ� ī���� ����
 *  1. ���� ���� : <? extends T>�ְ� ����Ŭ������ ������ �Ѵ�. 
 *  2. ���� ���� : <?  super  T> T Ŭ���� ���¿� �� ����Ŭ������ 
 *  3. ������     <T>
 */
public class FruitBox<T extends Fruit> {
	private Vector<T> list;
	public static <T extends Fruit> int getCount(FruitBox<T> l) {
		return l.list.size();
	}
	
	public static  int getCount2(FruitBox<? extends Fruit> l) {
		return l.list.size();
	}
	
	public static int compareBox(FruitBox<? extends Fruit> l1, FruitBox<? extends Fruit> l2) {
		if(l1.list.size() - l2.list.size() > 0) return 1;
		else if(l1.list.size() - l2.list.size() < 0) return -1;
		else return 0;
	}
	
	public static <T extends Fruit> int compareBox2(FruitBox<T> l1, FruitBox<T> l2) {
		if(l1.list.size() - l2.list.size() > 0) return 1;
		else if(l1.list.size() - l2.list.size() < 0) return -1;
		else return 0;
	}
	
	
	public FruitBox() {
		list = new Vector<T>();
	}
	public void SetFruit(T one) {
		list.add(one);
	}

	public void showInBox() {
		for (T t: list) {
			System.out.println(t);
		}
		
	}
	
}
