package model2;

import java.util.Scanner;

/**
 * ��ѯ��Ʒ�۸�
 *
 */
public class test14 {
   public static void main(String[] args) {
	System.out.println("MyShoping����ϵͳ>�������");
	for(int i=1;i<51;i++){
		System.out.print("*");
	}
	System.out.println("\n��ѡ����Ʒ��ţ�"+"\n1.T ��"+"\t2.����Ь"+"\t3.������");
	for(int i=1;i<51;i++){
		System.out.print("*");
	}
	
	Scanner s = new Scanner(System.in);
	
	
	System.out.print("\n��ѡ����Ʒ��ţ�");
	int num = s.nextInt();
    if(num == 1){
	System.out.println("T ��"+"\t��245.5");
   }
    else if(num == 2){
    	System.out.println("����Ь"+"\t��1245.5");
       }
    else if(num == 3){
    	System.out.println("������"+"\t��1245.5");
       }
    else{System.out.println("��������ȷ��ţ���");}
	
	 System.out.print("�Ƿ������(y/n)��");
	 String nex = s.next();
	 if (nex.equals("y")){
		 return;
	 }
	 if(nex.equals("n")){
		 System.out.println("���������");
	 }
   }	
}
