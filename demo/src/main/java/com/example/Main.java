package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.TreeNode;

import com.example.treeNode;
public class Main {
    public static  boolean nextPermutation(Integer[] nums,int n){
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
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(3);
        // for(int i=0;i<2;i++){
        //     //list.set(i,10*i);
        //    // list.add(i);
        //    //list.remove(i+2);
        // }
        // System.out.println(list.get(3));
        // map=new HashMap<>();
        // map.put(0,new ArrayList<ArrayList<String>>(new ArrayList<String>()));
        // List<Integer> list1=new ArrayList<>();
        // list1.add(2);
        // list1.add(3);
        // List<Integer> list2=new ArrayList<>(list1);
        // //list1.remove(Integer.valueOf(2));
        // list1.remove(0);
        // System.out.println(list2.get(0));
        // System.out.println(list1.get(0));
        // int i=11;
        // int x=(int)(Math.sqrt(i));
        // System.out.println(3-x);
        // List<Integer> last=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        // Iterator<Integer> it=last.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        //     it.remove();
        // }
        // System.out.println(last.size());
       
        // char[] row=new char[]{'1','2','p'};
        // System.out.println(Arrays.toString(row));
        // String s="abcde";
        // System.out.println(s.charAt(0));
        // StringBuilder sb=new StringBuilder("java");
        // String str=sb.toString();
        // sb.append("!");
        // System.out.println(str);
        // int n=sb.length()-1;
        // Map<Character,String> mp=Map.of('4',"ds",'3',"dkfj");
       
        // int[] nums=new int[]{1,5,1};
        // List<List<Integer>> ans=new ArrayList<>();
        // //Arrays.setAll(nums,i->Integer.valueOf(nums[i]));
        // Arrays.sort(nums);
        // int n=nums.length;
        // Integer[] permutations=new Integer[n];
        // Arrays.setAll(permutations,i->nums[i]);
        // ans.add(new ArrayList<Integer>(Arrays.asList(permutations)));
        // while(nextPermutation(permutations,n)==true){
        //     ans.add(new ArrayList<Integer>(Arrays.asList(permutations)));
        // }
    //     treeNode root=new treeNode(1);
    //     treeNode node1=new treeNode(2);
    //     treeNode node2=new treeNode(3);
    //     root.left=null;
    //     root.right=node1;
    //     node1.left=node2;
    //     node1.right=null;
    //     Deque<treeNode> stk = new LinkedList<treeNode>();
    //     List<Integer> res = new ArrayList<Integer>();
    //     if (root == null)
    //         System.out.println(res.toString()); 
    //     stk.push(root);
    //     treeNode node = root;
    //     while (!stk.isEmpty()) {
    //         node = stk.peek();
    //         while (node.left != null) {
    //             stk.push(node.left);
    //             node = node.left;
    //         }
    //         node = stk.pop();
    //         node.left=null;
    //         res.add(node.val);
    //         if (node.right != null) {
    //             stk.push(node.right);
    //             node = node.right;
    //         }

    //     }
    //    System.out.println(res.toString());


       
        // }
    //     int[] nums=new int[]{1,2,3,4,5,6,7};
    //     int k=3;
    //     int n=nums.length;
    //     k=k%n;
    //     int[] flag=new int[n];
    //   for(int i=0;i<n;i++){
    //     int start=i+k;
    //     while(flag[start%n]==0){
           
    //         int tmp=nums[start];
    //         nums[start]=nums[i];
    //         flag[start]=1;
    //         nums[i]=tmp;
        
    //         start=(start+k)%n;
    //     }
        
    // }
    //  System.out.println(Arrays.toString(nums));
    }

    
}