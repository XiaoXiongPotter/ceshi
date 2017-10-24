package model2;

import java.util.Scanner;

/**
 * 计算5门课程的平均分
 *
 */
public class test16 {
   public static void main(String[] args) {
	   
	Scanner s = new Scanner(System.in);
	System.out.print("请输入学生姓名：");
	String name = s.next();
	int sum=0;
	for(int i = 1;i <= 5; i++){
		System.out.print("亲输入五门功课中的第"+i+"门功课成绩：");
		int ke = s.nextInt();
		
		sum += ke;
	}
	int avg=sum/5;
	System.out.println(name+"的平均分为"+avg);
}
}
