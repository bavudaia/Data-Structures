/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;

/**
 *
 * @author bavudaia
 * A BST is tree where for any node
 * the elements in the left sub tree <= parent
 * the elements in the right sub tree > parent
 * 
 */


public class BinarySearchTree {
        public static boolean lookup(Node node, int data)
    {
        if(node == null)
            return false;
        else if(node.data == data)
            return true;
        else if(data < node.data)
          return lookup(node.left, data);
        else 
          return lookup(node.right, data);
    }
                public static Node buildBinarySearchTree ()
    {
           Node node = new Node(100);
        node.left = new Node(80);
        node.right = new Node(120);
          
        node.left.left = new Node(60);
        node.right.left = new Node(110);
        node.left.right = new Node(90);
        return node;
    }
    public static void insert(Node node, int data)
    {
        if(node == null)
        {   node = new Node(data); return;}
        else if(data <= node.data)
        {  if(node.left == null)
             {  node.left = new Node(data); return;}
           else
             insert(node.left, data);
        }
        else
        {
             if(node.right == null)
             {  node.right = new Node(data); return;}
             else
               
            insert(node.right, data);
        }
       
    }
    
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
        
        printInOrderBinaryTree(node.left);
        System.out.println(node.data);
        printInOrderBinaryTree(node.right);
        
    }
    public static void printPostOrderBinaryTree(Node node)
    {
        if(node == null)
            return;     
        printPostOrderBinaryTree(node.left);
        printPostOrderBinaryTree(node.right);
        System.out.println(node.data);
        
    }
    
    public static int minValue(Node node)
    {
        Node temp = node;
        if(node == null)
            return 0;
        while(temp.left !=null)
        {
            temp = temp.left;
        }
        return temp.data;
    }
}
