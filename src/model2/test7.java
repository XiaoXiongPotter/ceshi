package model2;

import java.util.Scanner;

/**
 * ʹ�ö���ifʵ�ֹ���
 *
 */
public class test7 {
   public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("��������(��)��");
	int count = s.nextInt();
	if(count >=500){
		System.out.println("�ҿ����򿭵�����");
	}
	else if(count >= 100){
		System.out.println("�ҿ�����������");
	}
	else if(count >= 50){
		System.out.println("�ҿ�����������");
	}
	else if(count >= 10){
		System.out.println("�ҿ��������");
	}
	else{
		System.out.println("ֻ����ݰ���");
	}
}
}
