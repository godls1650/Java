package project.day0706;





public class Dog {
	private String NickName; // 이름
	private String Race; 	// 품종
	private int Weight;		// 무게
	private int Age;		// 나이
	private boolean Gender; // 성별
	private int Tension;
	public int[] helthCheck;
	/*	클래스의 생성에 사용되는 메서드 (?) 
	 * 
	 */
	// super.Constructor의 Overriding  상속성 / 다형성
	
	
	public Dog() { // 매개변수가 없는 생성자 
		NickName = new String();
		Race = new String();
		helthCheck = new int [12];
		Weight = 0;
		Age = 0;
		Gender = false;
		Tension = 0;
	}
	
	// 오버로딩 (Overloading)
	public Dog(String nickname, String race, int weight, int age,boolean gen, int tension) { // 매개변수가 없는 생성자 
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
		
		
		//helthCheck = temp.helthCheck; --> 얕은 복사 
		
		// 깊은 복사 
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
		System.out.println(NickName + "이(가) 돌아다닌다.");
	}
	public void Howl() {
		if(Tension >= 6) {
			System.out.println(NickName + "이(가) 미친듯이 짖습니다.");
		}
		else if(Tension >= 3)
			System.out.println(NickName + "이(가) 쨰려보면서 짖습니다.");
		Tension += 1;
	}
	public void Eat() {
		System.out.println(NickName + "이(가) 사료를 먹는다.");
	}
	public void Sleep() {
		System.out.println(NickName + "이(가) 잔다.");
		
	}
	public void Sniffing() {
		System.out.println(NickName + "이(가) 냄새를 맡는다.");
		Tension += 1;	
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String format;
		format = NickName + "(" + Race + ")" + Integer.toString(Age) + "살";
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
