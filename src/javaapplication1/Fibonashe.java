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
public class Fibonashe {

    public Fibonashe() {
        this.run(0, 1);
    }

    public void run(int point, int point2) {

        int start_node = point;
        int next_node = point2;
        int sum_node;
        
   
        
        sum_node = start_node + next_node;
         System.out.println("= " + sum_node);
        if (sum_node <= 50) {
            this.run(point2, sum_node);
        }

    }

}
