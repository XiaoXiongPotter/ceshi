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
	System.out.print("������Ҫ����ĳɼ���");
	int grade = s.nextInt();
	
	int index = 0;
	for(int i = 0; i < arr1.length; i++){
		if(arr1[i] < grade){
			index = i;
			break; 
		}
	}
	System.out.println("Ҫ������±��ǣ�"+index);
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
//	System.out.println("�����������ĳɼ���");
//	int grade = s.nextInt();
//
//	System.out.println("����ɼ����±��ǣ�0");
//	arr1[0] = grade;
//	System.out.println("����ɼ���");
//	for(int i:arr1){
//		System.out.print(i+",");
//	}
}
}
