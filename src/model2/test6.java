package model2;

import java.util.Scanner;

/**
 *使用多重if实现考试成绩评测
 *
 */
public class test6 {
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("请输入成绩:");
	int grade = s.nextInt();
	if(grade > 80){
		System.out.println("良好");
	}
	else if(grade>=60){
		System.out.println("一般");
	}
	else{
		System.out.println("差");
	}
}}
