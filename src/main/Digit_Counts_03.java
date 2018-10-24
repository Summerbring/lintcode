package main;

public class Digit_Counts_03 {


        /**
         * @param k: An integer
         * @param n: An integer
         * @return: An integer denote the count of digit k in 1..n
         */
        public int digitCounts(int k, int n) {
            //首先将当前的N转化为字符串，再将字符串转化为字符数组，字符数组的元素转化为int，再于K比较
            int sum = 0;
            for (int x = 0;x <= n ; x++ ) {
                String s = "";
                s += x;
                char[] a = s.toCharArray();
                for (int m = 0; m < a.length; m++){
                    int i = Integer.parseInt(String.valueOf(a[m]));
                    if (i == k)
                        sum++;
                }
            }
            return sum;
        }
}
