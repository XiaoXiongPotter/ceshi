package model3;

import java.util.Scanner;

public class test8 {
   public static void main(String[] args) {
	   
	Scanner s = new Scanner(System.in);
	int arr[][] = new int[3][5];
	
	for(int i = 0; i < 3; i++){
		System.out.println("**********************"+"第"+(i+1)+"个班"+"**********************");
		for(int j = 0; j < 5; j++){
			System.out.print("\t\t请输入第"+(j+1)+"个学的成绩：");
			int grade = s.nextInt();
			arr[i][j] = grade;
		}
	}
	//System.out.println(arr[0][0]);
	
	for(int a = 0; a < 3; a++){
		int sum = 0;
		System.out.print("\t\t"+(a+1)+"班总成绩是：");
		for(int b = 0; b < 5; b++){
		sum	 +=  arr[a][b];
//			sum = sum + arr[a][b];
		}
		System.out.print(sum+"\n");
		
	}
}
}
