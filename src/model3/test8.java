package model3;

import java.util.Scanner;

public class test8 {
   public static void main(String[] args) {
	   
	Scanner s = new Scanner(System.in);
	int arr[][] = new int[3][5];
	
	for(int i = 0; i < 3; i++){
		System.out.println("**********************"+"��"+(i+1)+"����"+"**********************");
		for(int j = 0; j < 5; j++){
			System.out.print("\t\t�������"+(j+1)+"��ѧ�ĳɼ���");
			int grade = s.nextInt();
			arr[i][j] = grade;
		}
	}
	//System.out.println(arr[0][0]);
	
	for(int a = 0; a < 3; a++){
		int sum = 0;
		System.out.print("\t\t"+(a+1)+"���ܳɼ��ǣ�");
		for(int b = 0; b < 5; b++){
		sum	 +=  arr[a][b];
//			sum = sum + arr[a][b];
		}
		System.out.print(sum+"\n");
		
	}
}
}
