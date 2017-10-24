package model4;

import java.util.Scanner;

public class test6 {
	
	
	public static String Guess(int num){
		Scanner s = new Scanner(System.in);
		
		int i = 100, j = 0, k = 30;
		System.out.print("请输入你要猜的数字：");
		int numb = s.nextInt();
		
		if (num < k){
			j = num;
			System.out.println("数字位于"+j+"到"+i+"之间");
			return Guess(num);
			
		}
		else if(num > k){
			i = num;
			System.out.println("数字位于"+j+"到"+i+"之间");
			return Guess(num);
		}
		else if(num == k){
			System.out.println("恭喜猜对了");
		}
		return "游戏结束";
	 }
	
	
     public static void main(String[] args) {
    	 
    	 Scanner s = new Scanner(System.in);
    	 System.out.print("请输入任意数字开始：");
    	 int num = s.nextInt();
    	 Guess(num);
	}
}
