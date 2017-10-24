package model2;

import java.util.Scanner;

/**
 * 查询商品价格
 *
 */
public class test14 {
   public static void main(String[] args) {
	System.out.println("MyShoping管理系统>购物结算");
	for(int i=1;i<51;i++){
		System.out.print("*");
	}
	System.out.println("\n请选择商品编号："+"\n1.T 恤"+"\t2.网球鞋"+"\t3.网球拍");
	for(int i=1;i<51;i++){
		System.out.print("*");
	}
	
	Scanner s = new Scanner(System.in);
	
	
	System.out.print("\n请选择商品编号：");
	int num = s.nextInt();
    if(num == 1){
	System.out.println("T 恤"+"\t￥245.5");
   }
    else if(num == 2){
    	System.out.println("网球鞋"+"\t￥1245.5");
       }
    else if(num == 3){
    	System.out.println("网球拍"+"\t￥1245.5");
       }
    else{System.out.println("请输入正确编号！！");}
	
	 System.out.print("是否继续：(y/n)：");
	 String nex = s.next();
	 if (nex.equals("y")){
		 return;
	 }
	 if(nex.equals("n")){
		 System.out.println("程序结束！");
	 }
   }	
}
