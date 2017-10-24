package model4;

import java.util.Scanner;

public class test5 {
   public static void main(String[] args) {
	   
	Scanner s = new Scanner(System.in);
	System.out.print("请输入课数：");
	
	int num = s.nextInt();
	double arr[] = new double[num];
	for(int i = 1; i <= num; i++){
		System.out.print("请输入第"+i+"们课的分数:");
		double grade = s.nextDouble();
		arr[i-1] = grade;
	}
	
	double sum = 0;
	for(double i:arr){
		sum += i;
	}
	System.out.println(sum/num);
}
}
