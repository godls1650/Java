package project.day0708;

import java.util.Arrays;

public class MainApp_Sort {
	public static void QuickSort(int [] target, int low, int high) {
		int pivot = 0;// �߰� ���� ��ġ 
		
		if(low < high) {
			pivot = GetPivot(target, low, high); // pivot : ��� ���ذ��� �ε��� ��ȣ
			QuickSort(target,low ,pivot-1);
			QuickSort(target,pivot+1, high);
		}
	}
	public static int GetPivot(int []target, int low, int high) {
		int p = target[low]; // p�� ���� ���� �ε����� ������
		int left = low; // ���� Ŀ���� low��° ���� ����
		int right = high+1; // ������ Ŀ���� ���� �� �ε��� ���� ����
		int temp = 0;
		
		do {
			do {left++;}while(target[left] < p && left < high);
			do {right--;}while(target[right] > p&& right > low);
			if(left < right) {
				System.out.println(Arrays.toString(target));
				temp = target[left];
				target[left] = target[right];
				target[right]  = temp;
			}
		}while(left < right);
		
		temp = target[right];
		target[right] = target[low];
		target[low] = temp;
		System.out.println(Arrays.toString(target));
		return right;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {6,7,3,8,4,2,9,1,10,5};
		QuickSort(arr, 0, 9);
		System.out.println(Arrays.toString(arr));
	}

}
