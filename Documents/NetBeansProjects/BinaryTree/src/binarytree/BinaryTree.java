/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;

import java.io.ObjectStreamClass;

/**
 *
 * @author bavudaia
 */



public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    
    public static void printPreOrderBinaryTree(Node node)
    {
        if(node == null)
            return;
        System.out.println(node.data);
        printPreOrderBinaryTree(node.left);
        printPreOrderBinaryTree(node.right);
        
    }
        public static void printInOrderBinaryTree(Node node)
    {
        if(node == null)
            return;
        
        printPreOrderBinaryTree(node.left);
        System.out.println(node.data);
        printPreOrderBinaryTree(node.right);
        
    }
    public static void printPostOrderBinaryTree(Node node)
    {
        if(node == null)
            return;     
        printPreOrderBinaryTree(node.left);
        printPreOrderBinaryTree(node.right);
        System.out.println(node.data);
        
    }
                
    public static Node buildBinaryTree ()
    {
           Node node = new Node(10);
        node.left = new Node(20);
        node.right = new Node(30);
          
        node.left.left = new Node(40);
        node.left.left.right = new Node(105);
        node.right.left = new Node(50);
        node.left.right = new Node(60);
        return node;
    }
    public static boolean hasPathSum(Node node, int sum)
    {
        if(node == null && sum == 0)
            return true;
        else if(node == null)
            return false;
        else
        {
           return hasPathSum(node.left, sum-node.data)|| hasPathSum(node.right, sum-node.data);
        }
    }
    public static int maxDepth(Node node)
    {
        if(node == null)
            return 0;
        else
        {
            return 1+  Utils.max(maxDepth(node.left),maxDepth(node.right));
        }
    }
    
    public static void printPaths(Node node)
    {
        int A[] = new int[100];
        printPathsRecur(node, A, 0);
    }
    private static void printPathsRecur(Node node, int A[],int len)
    {
        if(node == null)
        {
           return;
        }
        A[len++] = node.data;
        
        if(node.left == null && node.right == null)
        {
            int i=0;
            for( i=0;i<len-1;i++)
            {
                System.out.print(A[i]+"-->");                
            }
            System.out.println(A[i]);
        }
        else
        {
            
            printPathsRecur(node.left, A, len);
            printPathsRecur(node.right, A, len);
        }
    }
    
    public static void mirror(Node node)
    {
        if(node == null)
            return;
        mirror(node.left);
        mirror(node.right);
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
    
    
}
