package model2;

import java.util.Scanner;

/**
 * 使用while循环打印试卷
 *
 */
public class test12 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("请输入打印试卷份数：");
	int page = s.nextInt();
	int i= 1;
	while(page >= i){
		System.out.println("打印第"+i+"份试卷");
		i++;
	}
}
}
