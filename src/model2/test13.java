package model2;

import java.util.Scanner;

/**
 * ʹ��whileѭ�����ѧϰ����
 *
 */
public class test13 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("�ϸ����𣿣�y/n��");
	String hege = s.nextLine();
	while(hege.equals("y") ){
		System.out.println("���ѧϰ����");
		break;
	}
	while(hege.equals("n")){
		System.out.println("�����Ķ��̲ģ�"+"\n�����ϻ���̣�");
		break;
	}
	
}
}
