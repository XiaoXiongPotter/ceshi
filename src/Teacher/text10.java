package Teacher;

import java.util.Scanner;
/**
 *Scanner��ʹ��
 *
 */
public class text10 {
	  public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 String name = s.nextLine();
	 int age = s.nextInt();
	 while(name.equals("����")&&age==100){
		 System.out.println("�������ã����ĵȴ������ǣ�100");
		 break;
	 }
	}
	}