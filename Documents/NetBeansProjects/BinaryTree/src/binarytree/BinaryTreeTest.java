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
public class BinaryTreeTest {
    public static void hasPathSumTest()
    {
            Node node = BinaryTree.buildBinaryTree();
        
        if(BinaryTree.hasPathSum(node, 70))
            System.out.println("sum is in one of the paths");
        else
             System.out.println("not there");
    }
}
