package model3;

import java.util.Scanner;

public class test22 {
   public static void main(String[] args) {
	   
	int arr[] = {99,85,82,83,63,60};
	Scanner s = new Scanner(System.in);
	System.out.print("输入要插入的分数：");
	int grade = s.nextInt();
	
	int arr1[] = new int[arr.length+1];
	for(int i = 0; i < arr.length; i++){
		arr1[i] = arr[i];
		
	}
	int index = 0;
	for(int i = 0; i < arr1.length; i++){
		if(grade > arr1[i]){
			index = i;
			break;
		}
	}
	System.out.println("插入的下标是："+index);
	for(int i = arr1.length-1; i > index; i--){
		arr1[i] = arr1[i-1];
	}
	
	arr1[index] = grade;
	for(int i:arr1){
		System.out.println(i);
	}
}
}
