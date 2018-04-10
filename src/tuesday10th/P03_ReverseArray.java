package tuesday10th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P03_ReverseArray {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		int n = Integer.parseInt(reader.readLine());

	
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			int digit = Integer.parseInt(reader.readLine());	
				array[i] = digit;		
		}
		
		swapArray(array);
		
		for (int digit: array){			
			System.out.print(digit+" ");		
		}
		
		
	}
	
	private static void swapArray(int[] array){
		for(int i = 0; i < array.length/2; i++){
			int digit = array[array.length-1-i];
			array[array.length-1-i] = array[i];
			array[i] = digit;
		}
		
	}
}
