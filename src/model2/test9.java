package model2;

import java.util.Random;
import java.util.Scanner;

/**
 * ʵ�����˳齱
 *
 */
public class test9 {
  public static void main(String[] args) {
	  System.out.println("�������ع������ϵͳ>\t���˳齱");
	Scanner s = new Scanner(System.in);
	System.out.print("�������Ա����:");
	int num = s.nextInt();
	int random = (int)(Math.random()*10);
	if(random == (num-(num/1000)*1000)/100){
		System.out.println(num+"�Ź˿������˹��ڣ�����MP3һ��");
	}
	 else{
			System.out.println("���ź�����û���н�");  
		  }
}
}
