package Teacher;

import java.util.Scanner;

public class text15 {
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������4λ��Ա���ţ�");
		int num = s.nextInt();
		System.out.println("���Ļ�Ա���ţ�"+num);
		System.out.println("ǧλ����"+num/1000+"��λ��:"+(num-(num/1000)*1000)/100+"ʮλ��:"+(num/10)%10+"��λ����"+num%10);
		System.out.println("��Ա����֮���ǣ�"+(num/1000+(num-(num/1000)*1000)/100+(num/100)/10+num%10));
	}
}
