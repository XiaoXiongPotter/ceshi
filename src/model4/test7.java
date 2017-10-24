package model4;

import java.util.Scanner;

public class test7 {
   public static void main(String[] args) {
	   
	   
	Scanner s = new Scanner(System.in);
	System.out.println("请输入本月消费记录");
	double arr[] = new double[5];
	for(int i = 0; i < 5; i++){
		System.out.print("请输入第"+(i+1)+"比金额：");
		double count = s.nextDouble();
		arr[i] = count;
	}
	
	System.out.println("\n\n"+"序号"+"\t\t\t"+"金额（元）");
	double sum = 0;
	for(int i = 0; i < 5; i++){
		System.out.println((i+1)+"\t\t\t"+arr[i]+"元");
		sum += arr[i];
	}
	System.out.println("总金额"+"\t\t\t"+sum+"元");
}
}
