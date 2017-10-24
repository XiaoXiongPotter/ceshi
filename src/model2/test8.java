package model2;

import java.util.Scanner;

/**
 * 使用嵌套if选择结构
 *
 */
public class test8 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("请输入比赛成绩（秒）；");
	int time = s.nextInt();
	String sex = s.nextLine();
	if(time <= 10){
		System.out.print("请输入性别：");
		if(sex =="男"){
			System.out.println("进入男子组决赛");
		}
		else if(sex =="女"){
			System.out.println("进入女子组决赛");
		}
	}
	else{
		return;
	}
}
}
