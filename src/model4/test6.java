package model4;

import java.util.Scanner;

public class test6 {
	
	
	public static String Guess(int num){
		Scanner s = new Scanner(System.in);
		
		int i = 100, j = 0, k = 30;
		System.out.print("��������Ҫ�µ����֣�");
		int numb = s.nextInt();
		
		if (num < k){
			j = num;
			System.out.println("����λ��"+j+"��"+i+"֮��");
			return Guess(num);
			
		}
		else if(num > k){
			i = num;
			System.out.println("����λ��"+j+"��"+i+"֮��");
			return Guess(num);
		}
		else if(num == k){
			System.out.println("��ϲ�¶���");
		}
		return "��Ϸ����";
	 }
	
	
     public static void main(String[] args) {
    	 
    	 Scanner s = new Scanner(System.in);
    	 System.out.print("�������������ֿ�ʼ��");
    	 int num = s.nextInt();
    	 Guess(num);
	}
}
