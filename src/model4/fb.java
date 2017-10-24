package model4;

public class fb {
   public static void main(String[] args) {
	   int a=1;
	    int b=1;
	    for(int i=0;i<10;i++){ 
	    	int sum = a+b;
	        if(i<1){
	        	sum  = 1;
	        	System.out.print(sum+",");
	        }
	        System.out.print(sum+",");
	        a = b;
	        b = sum; 
	    }
}
}
