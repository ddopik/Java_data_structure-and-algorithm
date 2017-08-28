/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author dell
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BinarySearch fb = new BinarySearch();
        BinaryTree theTree = new BinaryTree();

        theTree.addNode(50, "Boss");

        theTree.addNode(25, "Vice President");

        theTree.addNode(15, "Office Manager");

        theTree.addNode(30, "Secretary");

        theTree.addNode(75, "Sales Manager");
        theTree.addNode(65, "Office boy");

        theTree.addNode(85, "Salesman ");

        System.out.println("---------------------------------------------");
// 
//        theTree.inOrderTraverseTree(theTree.root);  
//        theTree.preorderTraverseTree(theTree.root); ######
//        theTree.postOrderTraverseTree(theTree.root);
//        theTree.preorderTraverseTreeSearch(theTree.root,75);
        theTree.deleteNode(theTree.root, 25);
           theTree.inOrderTraverseTree(theTree.root); 

    }

}
