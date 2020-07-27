package project.day0710;
/*	클래스간의 관계 
 * 
 */
public class MainApp {
	//리모콘은 TV의 정보를 갖고 있다. --> Remote Instance HAS A Tv Instance 
	//도서관 클래스는 도서 클래스와  열람실 클래스를 갖고 있다.
	
	// 도서 클래스   만화책 클래스
	// 도서 클래스   소설 클래스
	
	// 사람 클래스   사원 클래스
	// 사람 클래스   학생 클래스    ---> student().personInstance.getName()
	//							student().Name
	// 사원 클래스   정규직 클래스
	// 사원 클래스   계약직 클래스
	// 사원 클래스   영업직 클래스 
	
	// 학생의 이름 --> 학생의 정보--> Student Attribute --> 학생 객체에서 직접 데이터 변경이 가능 
	
	// 학생은 사람을 갖는다.
	// 학생은 사람이다.		Student is a Person    일반적인 확장(상속) 관계 는   A  is a  B 관계가 성립 --> A -> B 
	// 리모콘은 티비다.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
