package model2;

import java.util.Scanner;

/**
 *ʹ�ö���ifʵ�ֿ��Գɼ�����
 *
 */
public class test6 {
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("������ɼ�:");
	int grade = s.nextInt();
	if(grade > 80){
		System.out.println("����");
	}
	else if(grade>=60){
		System.out.println("һ��");
	}
	else{
		System.out.println("��");
	}
}}
