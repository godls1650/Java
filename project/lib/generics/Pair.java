package project.lib.generics;
/* Pair  --> �� ��
 *   �߻� �ð� | �߻� ��ȣ��
 *   ��ȣ   | ����
 *   ��� | ó�� 
 *   �� ���� ������ 
 *     - Key : �����͸� ���� �� �� �ִ� �ߺ��� ���� ��
 *     - Values : �ĺ��� ����� �� ������ �ϳ��� ��ü������ ǥ���� �� �ִ� ����� ����
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









