package model2;

import java.util.Scanner;

/**
 * 1���ж��Ƿ�Ϊż��
 *
 */
public class text1 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int count = s.nextInt();
	System.out.println("����������");
	if(count%2==0){
		System.out.println(count+"��ż��");
	}
	else{
		System.out.println(count+"����ż��");
	}
}}
