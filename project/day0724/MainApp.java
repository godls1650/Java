package project.day0724;
/*
 * ������ (Thread)
 * - ���μ��� -> ���� ���� �� ���α׷�
 * - ������  --> ���μ����� �ڿ��� �̿��ؼ� ������ �۾��� �����ϴ� �� 
 * 
 *- �Ϲ����� �ܼ� ���α׷� 
 */
// 8�� ������ ���� : 74
import java.util.Scanner;
//405 - 397  :  80


public class MainApp {
	static long lasttime;

	static long ftime;
	enum Days{MON, TUE, WEN, THR, FRI, SAT, SUN}
	enum KorDays{������, ȭ����, ������, ����� ,�ݿ��� ,�����, �Ͽ���}
	enum Selector{PowerBtn, TempBtn, WindBtn, ModeBtn}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		//System.out.println("����ð� : " + System.currentTimeMillis());
		Thread [] thread = new Thread[5];
		
		for(int i = 0; i < thread.length; i++) {
			for(int j = 0; j < 1000; j++) {
				System.out.print("-");	
			}
		}
		System.out.println("\nSingle Thread �ҿ�ð� : " + (System.currentTimeMillis() - time));
		
		
		for(int i = 0; i < thread.length; i++) {
			thread[i] = new Thread( ()->{ 
				for(int j = 0; j < 1000; j++)
					System.out.print(Thread.currentThread().getName().charAt(7));
				System.out.println("\n"+Thread.currentThread().getName() + "�ҿ�ð� : " 
						+ System.currentTimeMillis());
				lasttime = System.currentTimeMillis();
				System.out.println("\nMulti Thread �ҿ�ð� : " + (lasttime - ftime));
				});
		}
		
		ftime = System.currentTimeMillis();
		
		for(int i = 0; i < thread.length; i++) {
			thread[i].start();
		}
		
		
//1595594392273
//1595594392163
//          110		
	}
}


/*
// Runnable Interface ��  ����� Ŭ������ �����带 �����ϴ� ���
Runnable r = new ThreadEx1();
Thread thread1 = new Thread(r);

String in = new String();
Scanner sc = new Scanner(System.in);

in = sc.nextLine();
KorDays kD = KorDays.valueOf(in);

ErrorCode er1 = ErrorCode.NULLPTR;
//ErrorCode er2 = ErrorCode.of(1023);

System.out.println(er1.toString());
//System.out.println(er2.toString());

switch (kD) {
case ������: case ȭ���� :case ������: case ����� :case �ݿ��� :
	System.out.println("���ϴ³�");
	break;

case �����: case �Ͽ��� : 
	System.out.println("���³�");
	break;
}


//Thread�� ���� ��� ���� Ŭ������ ����ϴ� ��� 
ThreadEx2 thread2 = new ThreadEx2();



Thread thread3 = new Thread( ()->{ for(int i = 0; i < 5; i++)System.out.println("Thread03"); });
thread1.start();
thread2.start();
thread3.start();

thread1 = new Thread(r);
thread2 = new ThreadEx2();
thread3 = new Thread( ()->{ for(int i = 0; i < 5; i++)System.out.println("Thread03"); });


*/
