package model4;

import java.util.Scanner;

public class test4 {
   public static void main(String[] args) {
	   
	Scanner s = new Scanner(System.in);
	System.out.print("������༶������");
	
	int num = s.nextInt();
	double arr[] = new double[num];
	for(int i = 1; i <= num; i++){
		System.out.print("�������"+i+"�Ƴɼ���");
		double grade = s.nextDouble();
		arr[i-1] = grade;
	}
	int count = num;
	for(double i:arr){
		if(i < 80){
			count = count - 1;
		}
	}
	System.out.println("80�����������ǣ�"+count+"��");
	double bili = (double)count/(double)num;
	System.out.println("����80�ֵ���ռ��������:"+bili);
}
}
