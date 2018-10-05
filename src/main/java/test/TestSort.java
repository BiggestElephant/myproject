package test;

import org.junit.Test;

public class TestSort {
	@Test
	public void testSelectionSort() {
		//选择排序；从下标1开始选择出最小的数与下标0替换，以此循环；
		int[] arr= {100,33,44,55,122,12,23,34};
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 1; j < arr.length-i; j++) {
				int t=arr[j];
				
				if(t>arr[j+1]) {
					t=arr[j+1];
				}else {
					t=arr[j];
				}
				
			}
		}
	}

	@Test
	public void testBubbleSort() {
		//冒泡排序；前一个和后一个比较；根据规则替换
		int[] arr= {100,33,44,55,122,12,23,34};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					
				}
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
		
	}

}
