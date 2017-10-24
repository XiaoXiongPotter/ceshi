package model3;

import java.util.Scanner;

public class test3 {
   public static void main(String[] args) {
	
	   Scanner s = new Scanner(System.in);
	   int arr[] = new int[4];
	   System.out.println("请输入四家店的价格");
	   for(int i = 0; i < 4; i++){
		   int count = s.nextInt();
		   arr[i] = count;
	   }
	   
	   int min = arr[0] ;
	   for(int i = 0; i < arr.length; i++){
		   if(arr[i] < min){
			  min = arr[i];
		   }
	   }
	   System.out.println("最小值min="+min);
//	   for(int i = 0; i < arr.length; i++){
//		   for(int j = 0; j < arr.length-i-1; j++){
//			  if(arr[j+1] < arr[j]){
//				  int temp = arr[j+1];
//			       arr[j+1] = arr[j];
//			       arr[j] = temp;
//			  }
//		   }
//	   }
	   
		     
}
	  
}
