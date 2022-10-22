package com.bridgelabz;

public class LargestElementArray {
    public static void main(String[] args) {

        int [] a = new int[] {20, 30, 40, 80, 50};
        int largest = a[0];

        for (int i=0; i<a.length; i++) {

            if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println("Largest element present in given Array: " + largest);
    }
}
