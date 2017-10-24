package model2;

public class test18 {
   public static void main(String[] args) {
	  int sum=0;
	  int j=0;
      for(int i = 0; i<101;i+=2){
    	sum = sum + i;
      }
      System.out.println(sum);
      while(j<101){
    	  sum = sum + j;
    	  j+=2;
      }
      System.out.println(sum); 
      
      do{
    	  sum = sum + j;
    	  j+=2; 
      }
      while(j<101);
      System.out.println(sum); 
}
}
