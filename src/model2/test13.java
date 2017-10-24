package model2;

import java.util.Scanner;

/**
 * 使用while循环完成学习任务
 *
 */
public class test13 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("合格了吗？（y/n）");
	String hege = s.nextLine();
	while(hege.equals("y") ){
		System.out.println("完成学习任务！");
		break;
	}
	while(hege.equals("n")){
		System.out.println("上午阅读教材！"+"\n下午上机编程！");
		break;
	}
	
}
}
