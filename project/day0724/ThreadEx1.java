package project.day0724;

public class ThreadEx1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 5; i++)
			System.out.println(Thread.currentThread().getName());
	}
	
}
