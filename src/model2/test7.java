package model2;

import java.util.Scanner;

/**
 * 使用多重if实现购车
 *
 */
public class test7 {
   public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("请输入存款(万)：");
	int count = s.nextInt();
	if(count >=500){
		System.out.println("我可以买凯迪拉克");
	}
	else if(count >= 100){
		System.out.println("我可以买帕萨特");
	}
	else if(count >= 50){
		System.out.println("我可以买伊兰特");
	}
	else if(count >= 10){
		System.out.println("我可以买奥拓");
	}
	else{
		System.out.println("只能买捷安特");
	}
}
}
