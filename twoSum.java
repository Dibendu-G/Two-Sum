package com.company;

import java.util.Arrays;

class Solution4 {
    int[] nums = {4,5,9,8,7,6};
    int target=10;
    public int[] twoSum() {
        int [] result = new int[2];
        for(int i =0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++ )
            {
                if(nums[i]+nums[j]==target)
                {
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
}
public class twoSum {
    public static void main(String[] args) {
        Solution4 sc = new Solution4();
        System.out.println(Arrays.toString(sc.twoSum()));
    }
}
