/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;

/**
 *
 * @author bavudaia
 */
public class BinarySearchTreeTest {
    public static void lookupTest(Node node, int data)
    {
        
        if(BinarySearchTree.lookup(node,110))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
    
}
