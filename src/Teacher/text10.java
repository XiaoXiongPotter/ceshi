package Teacher;

import java.util.Scanner;
/**
 *Scanner的使用
 *
 */
public class text10 {
	  public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 String name = s.nextLine();
	 int age = s.nextInt();
	 while(name.equals("张三")&&age==100){
		 System.out.println("张三您好，您的等待号码是：100");
		 break;
	 }
	}
	}