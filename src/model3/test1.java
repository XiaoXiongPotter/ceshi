package model3;

import java.util.Scanner;

public class test1 {
   public static void main(String[] args) {
	 
	   Scanner s = new Scanner(System.in);
	   
	   double arr[] = new double[5];
	   for(int i = 1; i < 6; i++ ){
	   System.out.print("请输入5位学员的成绩：");
	   double grade = s.nextDouble();
	   arr[i-1] = grade;   
}
	for(int i = 0; i < arr.length; i++){
		for(int j= 0; j < arr.length-i-1; j++){
			
			if(arr[j] < arr[j+1]){
				double temp;
				temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
				
			}
		}
	}
	double max = arr[0];
	System.out.println("考试成绩最高分："+max);
   } 
}
