
package model2;

import java.util.Scanner;

/**
 *使用if-else结构
 *
 */
public class test5 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("请输入成绩：");
	int count = s.nextInt();
	if(count > 90){
		System.out.println("有赏");
	}
	else{
		System.out.println("老师说：扎马步一年");
	}
	
}
}
