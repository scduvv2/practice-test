package sarat.codility;

import java.util.ArrayList;
import java.util.List;

public class SpiralMAtrix {

	public static void main(String[] args) {

	   int[] A = {3, 8, 9, 7, 6};
	    int	    K = 3;
		int[] binaryGap = solution(A, K);
		System.out.println(binaryGap);

	}

    public static int[] solution(int[] A, int K) {
    	
    	int[] transposed =A;

    	for(int round=0; round<K ;round++) {
    		transposed = rotateMatrix(transposed);
    	}
    	
		return transposed;
    }

	private static int[]  rotateMatrix(int[] a) {
		
		int[] transposed = new int[a.length];
		
		transposed[0] = a[a.length-1];
		
		for(int i=0;i<a.length-1;i++) {
			transposed[i+1] = a[i];
		}
		
		return transposed;
	}
}
