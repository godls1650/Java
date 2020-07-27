package project.day0629;
/*	10�� �ε����� �迭�� ���� ����(100)�� �����ϰ� �� �迭�� ��� ���Ҹ� ����Ѵ�.  
 *  �� �� �迭�� ���� �� ���� ū ���� ����ϴ� ���α׷� �ۼ�
 *  
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 *  
 *  
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 *  
 */
public class SequenceEx {
	final static int Size = 52;
	final static int Set = 13;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//                 0~12  13~25  26~38 39~51
		int []arr = new int [10];
		int temp = 0;
		for(int i = 0 ; i < 10; i++)
			arr[i] = (int)(Math.random()*100);
		
		for(int i = 0; i < 10; i++)
			System.out.print(arr[i] + " ");
		
		int number = arr[0];
		
		for(int i = 0 ; i < 10; i++) {
			if(number > arr[i]) {
				number = arr[i];
				System.out.println("\n���� ���� �����ʹ� " + number);
			}
		}
		
		
		
		
		String [] shape = {  "��" ,"��" , "��" , "��" };
		int [] Deck = new int [Size];
		
		int index = 0;
		int p = 0;
		int n = 0;
		// Ʈ���� ī�� ����
		for(int i = 0;i < Deck.length; i++)
			Deck[i] = i;
		
		for(int i = 0;i < Deck.length; i++) {
			index = (int)(Math.random()*Size);
			temp = Deck[index];
			Deck[index] = Deck[i];
			Deck[i] = Deck[index];
		}
		
		for(int i =0 ; i < Deck.length; i++) {
			p = Deck[i] / Set;
			n = Deck[i] %Set + 1;
			System.out.printf("%s%d\n", shape[p],n);
		}
		int count = 0;
		int [][] Player = new int [4][3];
		
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < 4; i++) {
				Player[i][j] = Deck[count++];
			}
		}
		
		for(int i = 0; i < 4; i++) {
			if(i ==0 )
				System.out.print("[Dealer]");
			else
				System.out.printf("[Player%d]",i);
			
			for(int j = 0; j < 2; j++) {
				p = Player[i][j]/Set;
				n = Player[i][j] %Set + 1;
				System.out.printf("\t%s%d", shape[p],n);
			}
			System.out.println();
		}
	}

}
