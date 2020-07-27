package project.lib.generics;

import java.util.Vector;
/*	와일드 카드의 종류
 *  1. 상한 제한 : <? extends T>최고 조상클래스에 제한을 한다. 
 *  2. 하한 제한 : <?  super  T> T 클래스 형태와 그 조상클래스만 
 *  3. 무제한     <T>
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
