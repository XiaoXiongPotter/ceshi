package model4;

import java.util.Scanner;

public class test3 {
   public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("请输入学生名：");
	String name = s.next();
	for(int i = 1; i<=5; i++){
		System.out.print("第"+i+"们课的分数是：");
		int  grade = s.nextInt();
	    while(grade < 0){
	    	System.out.println("抱歉，分数输入错误，请重新录入");
	    	break;
	    }
	}
}
} 
