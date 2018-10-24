package main;

import java.util.*;

public class Main {


	public static void main(String[] args) {
//		int l;
//		int
		int m[] = {1,5};
		int n[] = {2,3};
		int s[];
		s = mergeSortedArray(n,m);
		for (int i: s) {
			System.out.println(i);
		}
	}
	public static int[] mergeSortedArray(int[] A, int[] B) {
		// write your code here
		int la = A.length;
		int lb = B.length;
		int s[] = new int[la+lb];

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i< lb ; i++)
			list.add(B[i]);
		int k = 0;
		for (int x = 0; x < la+lb-1 ; x++){
			if (list.get(x) <= A[k] && ( list.size()-1 == x || list.get(x+1) >= A[k])){
				list.add(x+1,A[k]);
				k++;
			}
			if(k == la)
				break;
		}
		int p = 0;
		for (Integer j: list) {
			s[p] = j;
			p++;
		}
		return  s;
	}
}
