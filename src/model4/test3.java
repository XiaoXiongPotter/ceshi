package model4;

import java.util.Scanner;

public class test3 {
   public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("������ѧ������");
	String name = s.next();
	for(int i = 1; i<=5; i++){
		System.out.print("��"+i+"�ǿεķ����ǣ�");
		int  grade = s.nextInt();
	    while(grade < 0){
	    	System.out.println("��Ǹ�������������������¼��");
	    	break;
	    }
	}
}
} 
