package model2;

import java.util.Scanner;

/**
 * ʹ��whileѭ����ӡ�Ծ�
 *
 */
public class test12 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("�������ӡ�Ծ������");
	int page = s.nextInt();
	int i= 1;
	while(page >= i){
		System.out.println("��ӡ��"+i+"���Ծ�");
		i++;
	}
}
}
