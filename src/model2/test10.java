package model2;

import java.util.Scanner;

/**
 *switch�����ֵ�ж�����
 *
 */
public class test10 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("���������Σ�");
	int mingci = s.nextInt();
	switch (mingci) {
	case 1:
		System.out.println("�μ���ʡ��ѧԺ1������Ӫ");
		break;
	case 2:
		System.out.println("�������ձʼǱ�����һ��");
		break;
	case 3:
		System.out.println("�����ƶ�Ӳ��һ��");
		break;

	default:
		System.out.println("���ź�û�н���");
		break;
	}
}
}
