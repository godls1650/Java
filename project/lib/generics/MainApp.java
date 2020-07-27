package project.lib.generics;

import java.util.Vector;

/*  바구니 클래스 
 *   --> 과일만 담을 수 있음 
 *   
 *   바구니 클래스의 타입변수 T는 반드시 과일 클래스를 상속 받은 클래스만 사용 할 수 있다.
 *    ㄴ--> 와일드 카드 
 * 
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Pair<Integer,  FruitBox<Fruit>>> vec1 = new Vector<Pair<Integer,FruitBox<Fruit>>>();
		vec1.add(new Pair<Integer, FruitBox<Fruit>>(1234215, new FruitBox<Fruit>()));
	
		
	}

}
