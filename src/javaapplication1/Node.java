package javaapplication1;

public class Node {

    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node() {
 

    }

    Node(int key, String name) {

        this.key = key;
        this.name = name;

    }

    public String toString() {

        return name + " has the key " + key;

        /*
		 * return name + " has the key " + key + "\nLeft Child: " + leftChild +
		 * "\nRight Child: " + rightChild + "\n";
         */
    }
//It really makes it easier to output debugging traces, or makes better logging messages,
//                since you can use the object's string representation provided by toString() directly;
//                you don't have to manually build a string that gives the information needed on the object.
}
