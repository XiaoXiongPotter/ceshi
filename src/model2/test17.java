package model2;

import java.util.Scanner;

/**
 * ����ӷ���
 *
 */
public class test17 {
   public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("������һ��ֵ:");
	int num = s.nextInt();
	for(int i = 0; i <=num; i++){
		int sum = 0;
		int j = num;
		for(; j>num-i; j--){	
		}
		sum = i + j;
		System.out.println(i+"+"+j+"="+sum);
	}
}
}
