package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.print.DocFlavor.STRING;

public class test {
    public static void swap(int[] nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    
    public static void main(String[] args) {
        int[] nums=new int[]{5,4,7,5,3,2};
            int n=nums.length;
            for(int i=0;i<n-1;i++){
                if(nums[i+1]<nums[i]){
                    int target=nums[i+1];
                    int left=i,right=n-1,pos=-1;
                    //int mid=(left+right)>>1;
                    int mid=(left+right)>>1;
                    while(left<right){
                        if(nums[mid]<=target){
                            left=mid+1;
                            pos=mid;
                        }
                        else{
                           right=mid;
                           //pos=mid;
                        }
                    }
                    swap(nums,pos+1,i+1);
                    //swap(nums,pos-1,i-1);
                    //交换完元素后还要排序！！！
                    //Arrays.sort(nums,i,n-1);
                    Arrays.sort(nums,i,n);
                    break;
                }
                if(i==1)
                 Arrays.sort(nums);
            }
            for(int num:nums)
            System.out.println(num);
            // if(i==0)
            // Arrays.sort(nums);
        

    //   int[] nums=new int[]{1,3,4,2,2};
    //  int slow=nums[0],fast=nums[nums[0]],ptr=nums[0];
    // while(slow!=fast){
    //     slow=nums[slow];
    //     fast=nums[fast];
    //     fast=nums[fast];
    // }
    // while(slow!=ptr){
    //     slow=nums[slow];
    //     ptr=nums[ptr];
    // }
    // System.out.println(ptr);
    
    //     int[] nums=new int[]{4,3,2,3,5,2,1};
    //     int k=4;
    //     int sum = 0;
    //     for (int i = 0; i < nums.length; i++) sum += nums[i];
    //     if (sum % k != 0) System.out.println("false");
    //     int target = sum / k;
    //     // 排序优化
    //     //Arrays.sort(nums,Collections.reverseOrder());//这种方法只能对包装类型数据排序
    //     Arrays.sort(nums);
    //     int[] bucket = new int[k + 1];
    //  boolean[] used=new boolean[nums.length];
    //   if(Solution.backTrack(nums,0,bucket,k,target,used)){
    //     System.out.println("true");
    //   }
    //   else 
    //   System.out.println("false");







    //     int[] nums=new int[]{4,3,2,3,5,2,1};
    //     int k=4;
    //     int s=0;
    //     for(int num:nums)
    //     s+=num;
    //   //   if(s%2!=0)
    //   //   return false;
    //     int target=s/k;
    //   //   if(target!=s/k)
    //   //   return false;
    //     int[] f=new int[target+1];
    //     f[0]=1;
    //     for(int num:nums){
    //       for(int i=target;i>=num;i--){
    //           // if(f[i]!=true)
    //           // f[i]=f[i-num];
    //           //f[i]=f[i]|f[i-num];
    //           f[i]=f[i]+f[i-num];
    //       }    
    //     }
    //     System.out.println(f[target]);
    //     //return f[target]==k?true:false;




        // int[] nums=new int[]{2,2,1,1};
        // int s=0;
        // for(int num:nums)
        // s+=num;
        // if(s%2!=0)
        // System.out.println("false");
        // int target=s/2;
        // boolean[] f=new boolean[target+1];
        // f[0]=true;
        // for(int num:nums){
        //   for(int i=target;i>=num;i--){
        //       f[i]=f[i-num];
        //   }    
        // }
        // if(f[target])
        // System.out.println("true");
        // else
        // System.out.println("false");



    //    int[] nums=new int[]{10,9,10,4,3,8,3,3,6,2,10,10,9,3};
    //    int k=19;
    //     int n=nums.length;
    //   double[] logPrefix = new double[n + 1];
    //    double logk = Math.log(k);
    //     int ret = 0;
    //     //logPrefix[0]=nums[0];
    //     //这里弄错了！！！
    //     logPrefix[0]=Math.log(nums[0]);
    //     if(nums[0]<k)
    //     ret++;
    //     for (int i = 1; i <n; i++) {
    //         logPrefix[i] = logPrefix[i-1] + Math.log(nums[i]);
    //         //还需要考虑0--i中的前缀找不到大于val的情况，得单独讨论不需要减去前缀即logPrefix[i]-0是否大于k！！！！
    //         if(logPrefix[i]<logk)
    //         ret++;
    //        // for (int j = 0; j < i; j++) {
    //         int l = 0;
    //         int r = i ;
    //         int pos =i+1;
    //         //logPrefix[j]>logPrefix[i] - logk;ret+=i-j;
    //         double val = logPrefix[i] - logk + 1e-10;
    //         while (l <= r) {
    //             int mid = (l + r)/2;
    //             if (logPrefix[mid]>val) {
    //                 pos = mid;
    //                 //l=mid+1;
    //                 r=mid-1;
    //             } 
    //             //这里等于的情况放在这里面处理，若相等值有多个，需要不断达到最右边的那个相等值停止，因为要找到第一个大于val的位置
    //             //else if(logPrefix[mid]<=val){
    //             else{
    //               // r=mid-1;
    //               l=mid+1;
    //             }
    //             //这里不能用else，遇到相等的情况需要特殊处理，不能直接中断循环！！！
    //             // else{
    //             //    pos=mid-1;
    //             //     break;
    //             // } 
    //         }
    //         if(pos==0)
    //         ret+=i-pos;//i-(pos-1);
    //         else
    //         ret+=i-pos+1;
    //     }
        
    //    System.out.println(ret);
        // Integer x=20;
        // Integer y=30;
        // Integer[] nums=new Integer[]{3,2,3};
        // if(x==y)
        // System.out.println("x==y");
        // if(nums[0]==nums[1])
        // System.out.println("3==2");
        // if(nums[0]==nums[2])
        // System.out.println("3==3");
        // if(x>y)
        // System.out.println("x>y");
        // else if(x<y)
        // System.out.println("dfjlj");
        // else
        // System.out.println("ddddd");
        // String s="heljodf";
        // System.out.println(s.charAt(0));
        // List<List<Integer>> son=new ArrayList<>();
        // int[] nums=new int[]{6,3,4};
        // int n=nums.length;
        // int[] firstPermutation=new int[n];
        // Arrays.setAll(firstPermutation,i->nums[i]);
        // Arrays.sort(firstPermutation);
        // for(int num:firstPermutation)
        // System.out.println(num);
        // List<Integer> list1=new ArrayList<>();
        // List<Integer> list2=new ArrayList<>();
        //  list1.add(1);
        //  list1.add(2);
        //  list2.add(2);
        //  list2.add(3);
         
    //     int[] num=new int[]{1,3,4};
    //     Integer[] num2=new Integer[]{2,3,4};
    //     System.out.println(Arrays.toString(num2));
    //     //System.out.println(Arrays.toString(num));
        

    //     List<Integer> list1=new ArrayList<>(Arrays.asList(num2));
    //     List<Integer> list2= Arrays.asList(num2);
    //    num2[2]=110;
    //    System.out.println(list1);
    //    System.out.println(list2);
        //System.out.println(Arrays.toString(list2.toArray()));
        //System.out.println(list1.toString());
        // Object[] x=list.toArray();
        // for(Object it:x)
        // System.out.println(it);
        // int[] nums=new int[]{1,2,3};
        // Solution s=new Solution();
        // System.out.println(s.permute(nums));
        
        // List<Integer> list=new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.remove(Integer.valueOf(2));
        // System.out.println(list);
        //  Map<Integer, Integer> map = new ConcurrentHashMap<>();
        // map.put(-1, 1);
        // map.put(-2, 2);
        // map.put(-3, 3);
        // for(Integer key:map.keySet()){
        //     Integer value=map.remove(key);
        //     map.put(key-1,value);
        // }
        // for (Map.Entry<String, Integer> entry : map.entrySet()) {
        //     // 可以在遍历时安全地插入新元素
        //     if (!map.containsKey("four")) {
        //         map.put("four", 4);
        //     }
        //     System.out.println(entry.getKey() + " -> " + entry.getValue());
        // }
        // for(Integer key:map.keySet()){
        //     System.out.println(key+" "+map.get(key));
        // }
       
    }
}
