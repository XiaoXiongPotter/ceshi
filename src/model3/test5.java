package model3;

import java.util.Scanner;

public class test5 {
   public static void main(String[] args) {
	   
	Scanner s = new Scanner(System.in);
	System.out.println("请输入五门课成绩：");
	int arr[] = new int[5];
	
	for(int i = 0; i < 5; i++){
		int grade = s.nextInt();
		arr[i] = grade;
	}
	
	for(int j = 1; j < 5; j++){
		for(int k = 0; k < 5-j; k++){
			if(arr[k] < arr[k+1]){
				int temp = arr[k+1];
				arr[k+1] = arr[k];
				arr[k] = temp;
			}
		}
	}
	
	System.out.print("学员成绩按降序排列：\t");
	for(int i:arr){
		System.out.print(i+"\t");
	}
	
}
}
