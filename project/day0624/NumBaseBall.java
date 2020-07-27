package project.day0624;
/* 
 * 운동장을 31바퀴 돌아라  --> count  --> for
 * 
 * 쌩 겨울에 알통구보를 땀이 날때까지 돌아라 --> while
 * 
 * 
 * for문
 * 
 * for(A ; B ; C )
 * 
 * A : 카운트할 변수를 선언 
 * B : 크기비교 연산   A에 사용한 변수가 최대 값에 도달할 때 까지
 * C : 블록을 한번 실행 할 때마다 A를 증가, 감소 시키는 수식 
 */
public class NumBaseBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i < 10; i ++) {
			System.out.println("<< "+i+"단 >>");
			
			for(int j = 1; j < 10; j ++) {
				System.out.println((i+" x "+j+"=" + i*j));
			}
			System.out.println();
		}
		
		
	}

}
