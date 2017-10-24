package model2;

import java.util.Random;
import java.util.Scanner;

/**
 * 实现幸运抽奖
 *
 */
public class test9 {
  public static void main(String[] args) {
	  System.out.println("我行我素购物管理系统>\t幸运抽奖");
	Scanner s = new Scanner(System.in);
	System.out.print("请输入会员卡号:");
	int num = s.nextInt();
	int random = (int)(Math.random()*10);
	if(random == (num-(num/1000)*1000)/100){
		System.out.println(num+"号顾客是幸运观众，获赠MP3一个");
	}
	 else{
			System.out.println("很遗憾，您没有中奖");  
		  }
}
}
