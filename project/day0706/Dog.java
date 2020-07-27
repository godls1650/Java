package project.day0706;





public class Dog {
	private String NickName; // �̸�
	private String Race; 	// ǰ��
	private int Weight;		// ����
	private int Age;		// ����
	private boolean Gender; // ����
	private int Tension;
	public int[] helthCheck;
	/*	Ŭ������ ������ ���Ǵ� �޼��� (?) 
	 * 
	 */
	// super.Constructor�� Overriding  ��Ӽ� / ������
	
	
	public Dog() { // �Ű������� ���� ������ 
		NickName = new String();
		Race = new String();
		helthCheck = new int [12];
		Weight = 0;
		Age = 0;
		Gender = false;
		Tension = 0;
	}
	
	// �����ε� (Overloading)
	public Dog(String nickname, String race, int weight, int age,boolean gen, int tension) { // �Ű������� ���� ������ 
		NickName = new String(nickname);
		Race = new String(race);
		helthCheck = new int [12];
		Weight =  weight;
		Age = age;
		Gender = gen;
		Tension = tension;
	}
	
	public Dog(Dog temp) {
		NickName = new String(temp.NickName);
		Race = new String(temp.Race);
		
		
		//helthCheck = temp.helthCheck; --> ���� ���� 
		
		// ���� ���� 
		helthCheck =  new int[temp.helthCheck.length];
		for(int i = 0 ; i < temp.helthCheck.length; i++) {
			helthCheck[i] = temp.helthCheck[i];
		}
		
		
		Weight =temp.Weight;
		Age = temp.Age;
		Gender = temp.Gender;
		Tension = temp.Tension;
	}
	
	
	
	
	/******************Dog Class Method*************************/
	public void Move() {
		System.out.println(NickName + "��(��) ���ƴٴѴ�.");
	}
	public void Howl() {
		if(Tension >= 6) {
			System.out.println(NickName + "��(��) ��ģ���� ¢���ϴ�.");
		}
		else if(Tension >= 3)
			System.out.println(NickName + "��(��) �������鼭 ¢���ϴ�.");
		Tension += 1;
	}
	public void Eat() {
		System.out.println(NickName + "��(��) ��Ḧ �Դ´�.");
	}
	public void Sleep() {
		System.out.println(NickName + "��(��) �ܴ�.");
		
	}
	public void Sniffing() {
		System.out.println(NickName + "��(��) ������ �ô´�.");
		Tension += 1;	
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String format;
		format = NickName + "(" + Race + ")" + Integer.toString(Age) + "��";
		return format;
	}
	
	/******************        Dog Class Getter / Setter     *************************/
	
	public String 	getNickName() { return NickName; }
	public String 	getRace() { return Race; }
	public int 		getWeight() { return Weight; }
	public int 		getAge() { return Age; }
	public boolean 	isGender() { return Gender; }
	public int 		getTension() { return Tension; }

	public void 	setNickName(String nickName) { NickName = new String(nickName);}
	public void 	setRace(String race) { Race = race; }
	public void 	setWeight(int weight) { Weight = weight; }
	public void 	setAge(int age) { Age = age; }
	public void 	setGender(boolean gender) { Gender = gender; }
	public void 	setTension(int tension) { Tension = tension; }
	
	
}
