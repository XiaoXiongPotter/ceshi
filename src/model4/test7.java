package model4;

import java.util.Scanner;

public class test7 {
   public static void main(String[] args) {
	   
	   
	Scanner s = new Scanner(System.in);
	System.out.println("�����뱾�����Ѽ�¼");
	double arr[] = new double[5];
	for(int i = 0; i < 5; i++){
		System.out.print("�������"+(i+1)+"�Ƚ�");
		double count = s.nextDouble();
		arr[i] = count;
	}
	
	System.out.println("\n\n"+"���"+"\t\t\t"+"��Ԫ��");
	double sum = 0;
	for(int i = 0; i < 5; i++){
		System.out.println((i+1)+"\t\t\t"+arr[i]+"Ԫ");
		sum += arr[i];
	}
	System.out.println("�ܽ��"+"\t\t\t"+sum+"Ԫ");
}
}
