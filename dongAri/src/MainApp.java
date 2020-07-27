package dongAri.src;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemList storage = new MemList(5);
		Member b = new NewBi("°í½ÂÇö", 2016, "´ëÀü µ¿±¸ ¿ë¿îµ¿", "010-1234-1234", 1, 0,true);
		
		
		storage.append(b);
		storage.append(new NewBi("°­¹Î", 2018, "±â¼÷»ç", "010-1234-1234", 1, 0,false));
		storage.append("È«¼º¹Î", 2008, "´ëÀü ¼­±¸ µÐ»êµ¿", "010-3563-3456");
		
		storage.showList();
		System.out.println();
		System.out.println();
		storage.ViewNewBiCluster();
		
	}

}
