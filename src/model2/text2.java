package model2;

import java.util.Scanner;

/**
 * 判断用户是否中奖
 *
 */
public class text2 {
   public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入4位会员卡号：");
		int num = s.nextInt();
		System.out.println("您的会员卡号："+num);
		System.out.println("千位数："+num/1000+"百位数:"+(num-(num/1000)*1000)/100+"十位数:"+(num/100)/10+"个位数是"+num%10);
		System.out.println("会员卡号之和是："+(num/1000+(num-(num/1000)*1000)/100+(num/100)/10+num%10));
		if((num/1000+(num-(num/1000)*1000)/100+(num/100)/10+num%10)==20){
			System.out.println("会员卡号为"+num+"的会员,您中奖了！奖品是MP3");
		}
	}
}
