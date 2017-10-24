package model3;

import java.util.Arrays;
import java.util.Scanner;

public class test6 {
  public static void main(String[] args) {
	  
     Scanner s = new Scanner(System.in);
     System.out.println("请输入无名学生的成绩：");
     
     int arr[] = new int[5];
     for(int i =0 ; i < 5; i++){
    	 int grade = s.nextInt();
    	 arr[i] = grade;
     }
     
     Arrays.sort(arr);
     System.out.print("学员成绩按升序排列：\t");
     for(int i:arr){
    	 System.out.print(i+"\t");
     }
     
     System.out.print("\n学员成绩按降序排列：\t");
     for(int i = 4; i >= 0; i--){
    	 System.out.print(arr[i]+"\t"); 
     }
}
}
