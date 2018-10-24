package main;

public class Kth_Largest_Element_05 {

    public int kthLargestElement(int n, int[] nums) {
        // write your code here
        //思路，首先创建一个辅助数组，长度为 nums的最大值
        // nums 中的元素没出现一次a[i] ++，通过辅助数组排序
        int l  = nums.length;
        int number = 0;
        int temp = 0;
        for (int x = 0 ; x < l ; x++){
            temp = nums[x] > temp ? nums[x]: temp;
        }
        int a[];
        a = new int[temp+1];
        for (int x = 0 ; x < l ; x++){
            a[nums[x]]++;
        }
        int sum = 0;
        for (int k = 0;k < temp+1; k++){
            sum += a[k];
            if(sum == l-n+1){
                number = k;
                break;
            }
        }
        return number;


    }
}
