package model2;

import java.util.Scanner;

/**
 *���������µ�ifѡ��ṹ
 *
 */
public class test4 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������java�ɼ���");
		
		
		int java = s.nextInt();
		System.out.print("\n���������ɼ���");
		int yinyue = s.nextInt();
		if(java> 90 && yinyue > 80||java> 100 && yinyue>70){
			System.out.println("��ʵ˵��������һ̨Iphone5");
		}
		else{
			System.out.println("����Ŭ��");
		}
		
	}
}
