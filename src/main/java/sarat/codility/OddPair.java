package sarat.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OddPair {

	public static void main(String[] args) {

		   int[] A = {9,3,9,3,9,10,9};
		    int	    K = 3;
			int binaryGap = solution(A);
			System.out.println(binaryGap);

		}

	private static int solution(int[] a) {
		
		int oddNumber =  0 ;
		Arrays.sort(a);
		for (int i=0;i<a.length-1;i++) {
			if(a[i]!= a[i+1]) {
				oddNumber = a[i];
			}
		}
		
		return oddNumber;
	}
}
