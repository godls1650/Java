package project.day0708;

import java.util.Arrays;

public class MainApp_Sort {
	public static void QuickSort(int [] target, int low, int high) {
		int pivot = 0;// 중간 값의 위치 
		
		if(low < high) {
			pivot = GetPivot(target, low, high); // pivot : 가운데 기준값의 인덱스 번호
			QuickSort(target,low ,pivot-1);
			QuickSort(target,pivot+1, high);
		}
	}
	public static int GetPivot(int []target, int low, int high) {
		int p = target[low]; // p는 가장 작은 인덱스의 데이터
		int left = low; // 왼쪽 커서는 low번째 부터 시작
		int right = high+1; // 오른쪽 커서는 가장 끝 인덱스 부터 시작
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
