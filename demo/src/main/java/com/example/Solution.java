package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static boolean backTrack(int[] nums, int start, int[] bucket, int k, int target, boolean[] used) {
        // k 个桶均装满
        if (k == 0) return true;//k==0说明前k-1个桶都填满了，那剩下元素的和肯定为sum/k(target)了！！！
        // 当前桶装满了，开始装下一个桶
        if (bucket[k] == target) {
            // 注意：桶从下一个开始；球从第一个开始
            return backTrack(nums, 0, bucket, k - 1, target, used);
        }
        // 第 k 个桶开始对每一个球选择进行选择是否装入
        for (int i = start; i < nums.length; i++) {
           
            // 如果当前球已经被装入，则跳过
            if (used[i]) continue;
            //  while(i+1<nums.length&&nums[i+1]==nums[i])
            //    i++;
            if(i>start&&nums[i]==nums[i-1])
            continue;
            // 如果装入当前球，桶溢出，则跳过
            if (bucket[k] + nums[i] > target) break;
    
            // 装入 && 标记已使用
            bucket[k] += nums[i];
            used[i] = true;
    
            // 开始判断是否选择下一个球
            // 注意：桶依旧是当前桶；球是下一个球
            // 注意：是 i + 1
            if (backTrack(nums, i + 1, bucket, k, target, used)) return true;
    
            // 拿出 && 标记未使用
            bucket[k] -= nums[i];
            used[i] = false;
            //while (i + 1 < nums.length && nums[i + 1] == nums[i]) i++;
        }
        // 如果所有球均不能使所有桶刚好装满
        return false;
    }
    public  boolean nextPermutation(Integer[] nums,int n){
        boolean flag=false;
        int i=n-2;
        while(i>=0&&nums[i]>=nums[i+1]){
           i--;
        }
        if(i>=0){
            flag=true;
            int j=n-1;
            while(j>i&&nums[j]<=nums[i])
            j--;
            Integer temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        //Arrays.sort(array, Collections.reverseOrder());//降序
        Arrays.sort(nums,i+1,n);
        return flag;
    }
    
}
