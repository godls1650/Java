package project.day0724;
/*	NULLPTR , INDEXOUT, ARITHMETIC �� 
 *  ������ �ϴ� Ÿ���� ���� 
 *  int ���� ���� Ÿ��
 *  String  ���ڿ� ���� ��ü
 *  Book  å���� ����
 *  
 *  enum ErrorCode NULLPTR , INDEXOUT, ARITHMETIC �� �ϳ��� �����ϴ� Ÿ��
 */
public enum ErrorCode {
	NULLPTR(3306), INDEXOUT(4420), ARITHMETIC(1023);
	private final int erCode;
	ErrorCode(int v){
		erCode = v;
	}
	public int getErCode() {return erCode;}
	
	public static ErrorCode of(int v) {
		if(v != 3306 || v != 4420 || v != 1023) {
			throw new IllegalArgumentException("Invalid Value : " + v);
		}
		if(v == 3306)return (ErrorCode.values())[0];
		else if(v == 4420)return (ErrorCode.values())[1];
		else return (ErrorCode.values())[2];
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name();
	}
}


