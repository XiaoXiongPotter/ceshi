package model2;

import java.util.Scanner;

public class text3 {
   public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("请输入成绩：");
	int grade = s.nextInt();
	if(grade > 90){
		System.out.println("老实说不错，奖励一台Iphone5");
	}
	else{
		System.out.println("继续努力");
	}
	
}
}
