package project.day0724;
/*
 * 쓰레드 (Thread)
 * - 프로세스 -> 실행 중인 한 프로그램
 * - 쓰레드  --> 프로세스의 자원을 이용해서 실제로 작업을 수행하는 것 
 * 
 *- 일반적인 콘솔 프로그램 
 */
// 8개 쓰레드 종료 : 74
import java.util.Scanner;
//405 - 397  :  80


public class MainApp {
	static long lasttime;

	static long ftime;
	enum Days{MON, TUE, WEN, THR, FRI, SAT, SUN}
	enum KorDays{월요일, 화요일, 수요일, 목요일 ,금요일 ,토요일, 일요일}
	enum Selector{PowerBtn, TempBtn, WindBtn, ModeBtn}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		//System.out.println("실행시간 : " + System.currentTimeMillis());
		Thread [] thread = new Thread[5];
		
		for(int i = 0; i < thread.length; i++) {
			for(int j = 0; j < 1000; j++) {
				System.out.print("-");	
			}
		}
		System.out.println("\nSingle Thread 소요시간 : " + (System.currentTimeMillis() - time));
		
		
		for(int i = 0; i < thread.length; i++) {
			thread[i] = new Thread( ()->{ 
				for(int j = 0; j < 1000; j++)
					System.out.print(Thread.currentThread().getName().charAt(7));
				System.out.println("\n"+Thread.currentThread().getName() + "소요시간 : " 
						+ System.currentTimeMillis());
				lasttime = System.currentTimeMillis();
				System.out.println("\nMulti Thread 소요시간 : " + (lasttime - ftime));
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
// Runnable Interface 를  사용한 클래스로 스레드를 생성하는 경우
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
case 월요일: case 화요일 :case 수요일: case 목요일 :case 금요일 :
	System.out.println("일하는날");
	break;

case 토요일: case 일요일 : 
	System.out.println("쉬는날");
	break;
}


//Thread를 직접 상속 받은 클래스를 사용하는 경우 
ThreadEx2 thread2 = new ThreadEx2();



Thread thread3 = new Thread( ()->{ for(int i = 0; i < 5; i++)System.out.println("Thread03"); });
thread1.start();
thread2.start();
thread3.start();

thread1 = new Thread(r);
thread2 = new ThreadEx2();
thread3 = new Thread( ()->{ for(int i = 0; i < 5; i++)System.out.println("Thread03"); });


*/
