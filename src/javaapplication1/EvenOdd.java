/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class EvenOdd {
      public  void main(String args[])
  {
    int c;
    System.out.println("Input an integer");
    Scanner in = new Scanner(System.in);
    c = in.nextInt();
//       if ( x % 2 == 0 ) or
    if ( (c/2)*2 == c )
      System.out.println("Even");
    else
      System.out.println("Odd");
  }
    
}
