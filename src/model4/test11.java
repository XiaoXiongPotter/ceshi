package model4;

public class test11 {
   public static void main(String[] args) {
	for(int kong = 1; kong <=5; kong++){
		for(int i = 1; i <=5-kong; i++){
			System.out.print(" ");
		}
		for(int xing = 1; xing <=2*kong-1; xing++){
			System.out.print("*");
		}
		System.out.println();
	}
	for(int kong = 1; kong <=4; kong++){
		for(int i = 4; i >4-kong; i--){
			System.out.print(" ");
		}
		for(int xing = 7; xing >=2*kong-1; xing--){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
