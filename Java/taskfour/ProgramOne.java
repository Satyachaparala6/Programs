package taskfour;

import java.util.Arrays;

public class ProgramOne {

	public static void main(String[] args) {
		int arr[] = {1,5,6,8,9,1,4,3,6};
		int n = arr.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i+1; j < n; j++)
            {
                if(arr[i] == arr[j])
                {
                    arr[j] = arr[n-1];
                     
                    n--;
                     
                    j--;
                }
            }
        }
        int[] arr1 = Arrays.copyOf(arr, n);
        for(int i =0; i<arr1.length; i++) {
        	System.out.println(arr1[i]);
        }
	}
}
