package model2;

import java.util.Scanner;

/**
 * ����5�ſγ̵�ƽ����
 *
 */
public class test16 {
   public static void main(String[] args) {
	   
	Scanner s = new Scanner(System.in);
	System.out.print("������ѧ��������");
	String name = s.next();
	int sum=0;
	for(int i = 1;i <= 5; i++){
		System.out.print("���������Ź����еĵ�"+i+"�Ź��γɼ���");
		int ke = s.nextInt();
		
		sum += ke;
	}
	int avg=sum/5;
	System.out.println(name+"��ƽ����Ϊ"+avg);
}
}
