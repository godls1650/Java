package project.day0722;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*	예외처리 (Exception Handling)
 *  프로그램의 오작동--> 오류 (ERROR) 
 *  프로그램의 실행 시간에 따라서 	
 *  	컴파일 에러
 *  	런타임 에러
 *  
 *  논리적 에러 : 의도와 다른 동작에의한 에러 
 * 
 *  --> 발생한 문제에 대해 해결 할 수 있다. : Exception 예외
 *      발생한 문제의 해결방법이 없다.    : Error     오류
 *    예외 처리 제어문  --> try / catch
 *     
 *    문제가 발생할 여지가 있는 코드를 try 블록을 이용하여 묶는다.
 */

public class MainApp {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\godls\\Desktop\\text.txt");
		File cfile = new File("C:\\Users\\godls\\Desktop\\temp_text.txt");
		//FileWriter fw = new FileWriter(file);
		FileReader fr = new FileReader(file);
		FileWriter fw;
		String temp = "";
		char [] t = new char[256];
		
		fr.read(t);
		fr.close();
		
		fw = new FileWriter(cfile);
		fw.write(t);
		fw.close();
	
		
		
		temp = new String(t);
		// temp String으로 연산
		
		fw = new FileWriter(file);
		fw.write(temp);
		fw.close();
		// 임시파일을 삭제 
		
		
	}

}







