package model3;

public class test4 {
   public static void main(String[] args) {
	int arr[] = {100, 99, 90,89, 87,75, 69, 67};
	for(int i = 1; i < arr.length; i++){
		
		for(int j = 0; j < arr.length-i; j++){
			if(arr[j+1] < arr[j]){
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.print("第"+i+"次的排序结果是：");
		for(int a = 0; a < arr.length; a++){
			System.out.print(arr[a]+",");
		}
		
		
		System.out.println();
}
	for(int i:arr){
		System.out.println(i+",");
	}
}
}

// 9 16 23 25 90 
