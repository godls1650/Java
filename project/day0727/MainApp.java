package project.day0727;

//import javax.swing.*;

public class MainApp implements Runnable{
	public static boolean save = false;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t = new Thread(new MainApp());
		t.setDaemon(true);
		t.start();
		
		for(int i = 0; i <= 10; i++) {
			if (i == 3) {
				save = true;
			}
			Thread.sleep(1000);
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				if(save) autoSave();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void autoSave() {
		System.out.println("자동 저장");
	}
	
	/*
	 * Thread th1 = new Thread() {
			public void run() {
				for(int i = 0 ;  i < 10; i++) {
					System.out.println(10 - i);
					try {
						this.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} // 1000밀리초 (1초)간 스레드를 정지한다.
				}
			};
		};
		Thread th2 = new Thread() {
			public void run() {
				String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
				System.out.println("입력한 값 > " + input);
			};
		};
	 * 
	 */

	
	/*Thread Group
	 * th1.setPriority(10);
		th2.setPriority(1);
		ThreadGroup tg = new ThreadGroup("group1");
		ThreadGroup subtg = new ThreadGroup(tg,"subGroup");
		
		new Thread(tg, th1, "th1").start();
		new Thread(subtg, th2, "th2").start();
		
	 * 
	 */
}
