package tuesday10th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01_Array {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		int n = Integer.parseInt(reader.readLine());

		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
				int digit = Integer.parseInt(reader.readLine());	
				if (digit % 2 == 0){
					array[i] = 0;
				} else{
					array[i] = digit;
				}
			
		}
		
		for (int digit: array){
		
				System.out.print(digit+" ");		
			
		
		}
		
		
	}

}
