package model2;

import java.util.Scanner;

/**
 * ʹ��do-whileѭ���ṹ
 *
 */
public class test15 {
   public static void main(String[] args) {
	  System.out.println("�ϻ���д����");
	  Scanner s = new Scanner(System.in);
	  System.out.print("�ϸ����𣿣�y/n��");
	  String grade = s.next();
	  do{
		  System.out.println("��ϲ��ͨ���˲��ԣ���"); 
		  break;
	  }
	 while (grade.equals("n"));
}  
}
