/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author dell
 *
 */
//Java program for binary search: This code implements binary search algorithm.
//Please note input numbers must be in ascending
public class BinarySearch {

    int arr[] = {2, 4, 6, 8, 10, 11, 14, 18, 20};
    int mid;
    int arrSize = arr.length;

    public BinarySearch() {
        this.search(2, arr);
        System.out.println("Array of--->" + arrSize);
    }

    public void search(int num, int arr[]) {

        int first = 0;
        int last = arrSize;
        int in_between_mid = Math.round(((last - first) + 1) / 2);
        int i = 0;
        while (i < arrSize) {
            if (i == arrSize) {
                System.out.println("No math found ");
                break;
            }

            if (arr[in_between_mid] == num) {
                System.out.println("Mathed at index number  =" + in_between_mid);
                i++;
                break;
            } else if (arr[in_between_mid] > num) {
                first = 0;
                last = in_between_mid - 1;
                in_between_mid = Math.round(((last - first) + 1) / 2);
                System.out.println("Pointer moving left from --->" + in_between_mid);
                i++;
                continue;
            } else if (arr[in_between_mid] < num) {
                first = in_between_mid;
                last = arrSize;
                in_between_mid = first+Math.round(((last - first) + 1) / 2);
                System.out.println("Pointer moving right from --->" + in_between_mid);
                i++;
                continue;
            }
            else
            {
                System.out.println("Loop round at--->" + in_between_mid);
            }

        }

    }

}
