package model2;

import java.util.Scanner;

/**
 *复杂条件下的if选择结构
 *
 */
public class test4 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入java成绩：");
		
		
		int java = s.nextInt();
		System.out.print("\n请输入音成绩：");
		int yinyue = s.nextInt();
		if(java> 90 && yinyue > 80||java> 100 && yinyue>70){
			System.out.println("老实说不错，奖励一台Iphone5");
		}
		else{
			System.out.println("继续努力");
		}
		
	}
}
