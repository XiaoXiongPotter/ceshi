package model3;

import java.util.Scanner;

public class test2 {
   public static void main(String[] args) {
	   
	int arr[] = {99,85,82,83,63,60};
	int arr1[] = new int[arr.length+1];
	for(int i = 0; i < arr.length; i++){
		arr1[i] = arr[i];
	}
	
	Scanner s = new Scanner(System.in);
	System.out.print("请输入要插入的成绩：");
	int grade = s.nextInt();
	
	int index = 0;
	for(int i = 0; i < arr1.length; i++){
		if(arr1[i] < grade){
			index = i;
			break; 
		}
	}
	System.out.println("要插入的下标是："+index);
	for(int i = arr1.length-1; i > index; i--){
		arr1[i] = arr[i-1];
	}
	arr1[index] = grade;
	for(int i:arr1){
		System.out.println(i);
	}
//	int arr1[] = new int[arr.length+1];
//	for(int i = 0; i<arr.length; i++){
//		arr1[i+1] = arr[i];
//	}
//	Scanner s = new Scanner(System.in);
//	System.out.println("请输入新增的成绩：");
//	int grade = s.nextInt();
//
//	System.out.println("插入成绩的下标是：0");
//	arr1[0] = grade;
//	System.out.println("插入成绩后：");
//	for(int i:arr1){
//		System.out.print(i+",");
//	}
}
}
