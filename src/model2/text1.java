package model2;

import java.util.Scanner;

/**
 * 1、判断是否为偶数
 *
 */
public class text1 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int count = s.nextInt();
	System.out.println("请输入数字");
	if(count%2==0){
		System.out.println(count+"是偶数");
	}
	else{
		System.out.println(count+"不是偶数");
	}
}}
