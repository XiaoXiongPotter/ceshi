package model2;

import java.util.Scanner;

/**
 * ʹ��Ƕ��ifѡ��ṹ
 *
 */
public class test8 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("����������ɼ����룩��");
	int time = s.nextInt();
	String sex = s.nextLine();
	if(time <= 10){
		System.out.print("�������Ա�");
		if(sex =="��"){
			System.out.println("�������������");
		}
		else if(sex =="Ů"){
			System.out.println("����Ů�������");
		}
	}
	else{
		return;
	}
}
}
