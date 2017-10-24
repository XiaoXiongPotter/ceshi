package Teacher;

/**
 * 实现两个数据交换
 *
 */
public class text13 {
  public static void main(String[] args) {
	int num1 = 5,num2 = 6;
	System.out.println("交换之前\n"+"num1 = "+num1+"\nnum2 = "+num2);
   int temp = num1;
   num1=num2;
   num2=temp;
   System.out.println("交换之后\n"+"num1 = "+num1+"\nnum2 = "+num2);
}
}
