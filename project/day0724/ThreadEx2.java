package project.day0724;

public class ThreadEx2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 5; i++) {
			System.out.println(getName());
			//currentThread(); //Thread 객체 참조를 리턴
			
		}
	}
}
