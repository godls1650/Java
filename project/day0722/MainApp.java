package project.day0722;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*	����ó�� (Exception Handling)
 *  ���α׷��� ���۵�--> ���� (ERROR) 
 *  ���α׷��� ���� �ð��� ���� 	
 *  	������ ����
 *  	��Ÿ�� ����
 *  
 *  ���� ���� : �ǵ��� �ٸ� ���ۿ����� ���� 
 * 
 *  --> �߻��� ������ ���� �ذ� �� �� �ִ�. : Exception ����
 *      �߻��� ������ �ذ����� ����.    : Error     ����
 *    ���� ó�� ���  --> try / catch
 *     
 *    ������ �߻��� ������ �ִ� �ڵ带 try ����� �̿��Ͽ� ���´�.
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
		// temp String���� ����
		
		fw = new FileWriter(file);
		fw.write(temp);
		fw.close();
		// �ӽ������� ���� 
		
		
	}

}







