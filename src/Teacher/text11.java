package Teacher;

import java.util.Scanner;

/**
 *Scanner获取会员卡号
 *
 */
public class text11 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("请输入会员卡号：");
	int num = s.nextInt();
	System.out.println("您的会员卡号："+num);
}
}
