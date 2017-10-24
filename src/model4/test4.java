package model4;

import java.util.Scanner;

public class test4 {
   public static void main(String[] args) {
	   
	Scanner s = new Scanner(System.in);
	System.out.print("请输入班级人数：");
	
	int num = s.nextInt();
	double arr[] = new double[num];
	for(int i = 1; i <= num; i++){
		System.out.print("请输入第"+i+"科成绩：");
		double grade = s.nextDouble();
		arr[i-1] = grade;
	}
	int count = num;
	for(double i:arr){
		if(i < 80){
			count = count - 1;
		}
	}
	System.out.println("80分以上人数是："+count+"人");
	double bili = (double)count/(double)num;
	System.out.println("大于80分的人占总人数的:"+bili);
}
}
