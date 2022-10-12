import java.util.Arrays;

public class JavaCode1 {

	public static void main(String[] args) {
		
		int arr [] = {2,4,6,1,4,2,4};
		
		
//		Arrays.sort(arr);
//		
//		System.out.println(Arrays.toString(arr));
		
		
		
		for(int i = 0 ; i<arr.length ; i++) {
			
			for(int j = i+1 ; j <arr.length ; j++) {
			if(arr[i] > arr[j] ) {
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
 				
			}
			
			}
			
		}
		
		System.out.println("This is Without using method : " +Arrays.toString(arr));
		
		System.out.println("This is first java code for github");

	}

}
