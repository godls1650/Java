package project.lib.generics;
/* Pair  --> 한 쌍
 *   발생 시간 | 발생 신호값
 *   번호   | 정보
 *   명령 | 처리 
 *   한 쌍의 데이터 
 *     - Key : 데이터를 구분 할 수 있는 중복이 없는 값
 *     - Values : 식별에 사용할 수 없으나 하나의 개체정보를 표현할 수 있는 요소의 집합
 *     
 */
import java.text.*;

public class Pair<T1, T2> {
	final static String form = "Key : {0}  Values : {1}";
	private T1 Key;
	private T2 Values;
	
	public Pair() {
		Key = null;
		Values = null;
	}
	public Pair(T1 key, T2 value){
		Key = key;
		Values = value;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			
			Object[] arg = {Key, Values};
			
			return MessageFormat.format(form,arg);
		}

}









