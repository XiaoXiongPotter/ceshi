package model3;

import java.util.Arrays;

public class test7 {
   public static void main(String[] args) {
	   
	String arr[] = {"a","c","u","b","e","p","f","z"};
	System.out.print("ԭ��ĸ��������:\t");
	for(String i:arr){
		System.out.print(i+"\t");
	}
	
	Arrays.sort(arr);
	System.out.print("\n�������������:\t");
	for(String i:arr){
		System.out.print(i+"\t");
	}
	
	int a = Arrays.binarySearch(arr,"b");
	System.out.print("\nb�������е�λ����:"+a);
}
}
