package sarat.codility;

public class BinaryGap {

	public static void main(String[] args) {

		int n = 32;
		int binaryGap = solution(n);

	}

	public static int solution(int N) {

		char[] binaryString = Integer.toBinaryString(N).toCharArray();

		int oneIndex = 0;
		int gap = 0;

		for (int i = 0; i < binaryString.length; i++) {
			if (binaryString[i] == '1') {
				if (gap < i-oneIndex-1) {
					gap = i-oneIndex-1;
				}

				oneIndex = i;
			}
		}
		System.out.println(gap + " " + Integer.toBinaryString(N));
		return gap;
	}
}
