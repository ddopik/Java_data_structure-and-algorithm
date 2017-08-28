/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class Draft {

    int x;
    int result = 0;

    public int Puzzle(int n) {

        for (int i = 1; i <= n; i++) {
            x = i;
            result = ((x - 1) * (x - 1) + result);
        }

        return result;
    }
}
