package model2;

import java.util.Scanner;

/**
 * 使用do-while循环结构
 *
 */
public class test15 {
   public static void main(String[] args) {
	  System.out.println("上机编写程序");
	  Scanner s = new Scanner(System.in);
	  System.out.print("合格了吗？（y/n）");
	  String grade = s.next();
	  do{
		  System.out.println("恭喜你通过了测试！！"); 
		  break;
	  }
	 while (grade.equals("n"));
}  
}
