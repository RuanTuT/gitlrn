package com.example;

public class treeNode {
    int val;
     treeNode left;
     treeNode right;
    treeNode() {}
     treeNode(int val) { this.val = val; }
     treeNode(int val, treeNode left, treeNode right) {
     this.val = val;
     this.left = left;
     this.right = right;
     }
}