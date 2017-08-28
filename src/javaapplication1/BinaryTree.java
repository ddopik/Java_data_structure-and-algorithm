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
public class BinaryTree {

    private int data;
    Node root;
    private Node lastParent;
    private BinaryTree left;
    private BinaryTree right;
    BinaryTree BinaryTree;

    public void addNode(int key, String name) {

        // Create a new Node and initialize it
        Node newNode = new Node(key, name);

        // If there is no root this becomes root
        if (root == null) {

            root = newNode;
            System.out.println("Root intialized with   --->(" + root.key + ")");

        } else {

            Node iterationNode = root;
            Node parent;
            while (true) {
                parent = iterationNode;
                System.out.println("New cycle with  parent Node  --->(" + parent.key + ")");

                if (key < iterationNode.key) {
                    iterationNode = parent.leftChild;// before you intialize left branch or not you have to save your current place
                    System.out.println("Traverse From parent to Left Node  --->(" + parent.key + ")");

                    if (iterationNode == null) {
                        System.out.println("with parent Node  --->(" + parent.key + ") left child is null");
                        parent.leftChild = newNode;
                        System.out.println("with parent Node  --->(" + parent.key + ") left Child   Node with value " + key + "");
                        return; // All Done
                    }
                } else {

                    iterationNode = parent.rightChild;
                    System.out.println("Traverse From parent to Right Node  --->(" + parent.key + ")");
                    if (iterationNode == null) {
                        System.out.println("with parent Node  --->(" + parent.key + ") Right child is null");
                        parent.rightChild = newNode;
                        System.out.println("with parent Node  --->(" + parent.key + ")  Right Child  Node with value " + key + "");
                        return; // All Done
                    }

                }

            }
        }
///////////
    }

    public void preorderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            System.out.println(focusNode);

            preorderTraverseTree(focusNode.leftChild);
            preorderTraverseTree(focusNode.rightChild);

        }

    }

    public void preorderTraverseTree2(Node focusNode) {

        if (focusNode != null) {

            preorderTraverseTree(focusNode.leftChild);
            preorderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }

    }

    public void inOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            // Traverse the left node
            inOrderTraverseTree(focusNode.leftChild);

            // Visit the currently focused on node
            System.out.println(focusNode);

            // Traverse the right node
            inOrderTraverseTree(focusNode.rightChild);

        }

    }

// public static TreeNode deleteNode(TreeNode root, int value) {
// if (root == null)
// return null;
// if (root.data > value) {
// root.left = deleteNode(root.left, value);
// } else if (root.data < value) {
// root.right = deleteNode(root.right, value);
//
// } else {
// // if nodeToBeDeleted have both children
// if (root.left != null && root.right != null) {
// TreeNode temp = root;
// // Finding minimum element from right
// TreeNode minNodeForRight = minimumElement(temp.right);
// // Replacing current node with minimum node from right subtree
// root.data = minNodeForRight.data;
// // Deleting minimum node from right now
// deleteNode(root.right, minNodeForRight.data);
//
// }
// // if nodeToBeDeleted has only left child
// else if (root.left != null) {
// root = root.left;
// }
// // if nodeToBeDeleted has only right child
// else if (root.right != null) {
// root = root.right;
// }
// // if nodeToBeDeleted do not have child (Leaf node)
// else
// root = null;
// }
// return root;
// }
    public void deleteNode(Node node, int key) {

        Node focusNode = node;

        if (focusNode != null) {

            // Traverse the left node
            deleteNode(focusNode.leftChild, key);

            if (focusNode.key == key) {
                System.out.println(focusNode);
                System.out.println("Found at ---->" + focusNode.key);
               /// in case this node has 2 chlild
                if (focusNode.leftChild != null && focusNode.rightChild != null) {
                    if (focusNode.rightChild.leftChild != null) {
                        System.out.println(" postioned Node  at ---->" + focusNode.key + " now " + focusNode.rightChild.leftChild.key);
                        focusNode.key = focusNode.rightChild.leftChild.key;
                        focusNode.rightChild.leftChild = focusNode.rightChild.leftChild.rightChild;
                         /// incase there is no minumin in sub tree 
                    } else if (focusNode.rightChild.leftChild == null) {
                        System.out.println(" postioned Node  at ---->" + focusNode.key + " now " + focusNode.leftChild.key);
                        focusNode.key = focusNode.leftChild.key;
                        focusNode.leftChild = null;

                    }

                }
                else if (focusNode.leftChild != null && focusNode.rightChild == null) 
                {
                     System.out.println(" postioned Node  at ---->" + focusNode.key + " now " + focusNode.leftChild.key);
                        focusNode.key = focusNode.leftChild.key;
                        focusNode.leftChild = null;
                }
                  else if (focusNode.leftChild == null && focusNode.rightChild != null) 
                {
                     System.out.println(" postioned Node  at ---->" + focusNode.key + " now " + focusNode.leftChild.key);
                        focusNode.key = focusNode.rightChild.key;
                        focusNode.rightChild = null;
                }
                    

            }
            deleteNode(focusNode.rightChild, key);
        }

    }

    public void postOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            preorderTraverseTree2(focusNode.leftChild);
            preorderTraverseTree2(focusNode.rightChild);

            System.out.println(focusNode);

        }

    }

    public void preorderTraverseTreeSearch(Node focusNode, int key) {

        if (focusNode != null) {

            if (focusNode.key == key) {
                System.out.println("Node found----> " + focusNode);
                return;
            }
            preorderTraverseTreeSearch(focusNode.leftChild, key);
            preorderTraverseTreeSearch(focusNode.rightChild, key);
            System.out.println("Not found");
        }

    }

}
