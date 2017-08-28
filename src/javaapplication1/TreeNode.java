/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ddopik
 */
public class TreeNode {

    char data;
    int key;
    String name;
    TreeNode node;
    TreeNode leftChild, rightChild;

    TreeNode(String name, int key) {
        this.name = name;
        this.key = key;
    }

    public void addNode(String name, int key) {
        
         node=new TreeNode(name,key);

    }
}
