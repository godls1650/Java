package dongAri.src;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemList storage = new MemList(5);
		Member b = new NewBi("�����", 2016, "���� ���� ��", "010-1234-1234", 1, 0,true);
		
		
		storage.append(b);
		storage.append(new NewBi("����", 2018, "�����", "010-1234-1234", 1, 0,false));
		storage.append("ȫ����", 2008, "���� ���� �л굿", "010-3563-3456");
		
		storage.showList();
		System.out.println();
		System.out.println();
		storage.ViewNewBiCluster();
		
	}

}
