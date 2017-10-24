package model2;

import java.util.Scanner;

/**
 *switch解决等值判断问题
 *
 */
public class test10 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("请输入名次：");
	int mingci = s.nextInt();
	switch (mingci) {
	case 1:
		System.out.println("参加麻省理工学院1月夏令营");
		break;
	case 2:
		System.out.println("奖励惠普笔记本电脑一部");
		break;
	case 3:
		System.out.println("奖励移动硬盘一部");
		break;

	default:
		System.out.println("很遗憾没有奖励");
		break;
	}
}
}
