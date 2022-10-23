package com.bridgelabz;

public class SecondLargestNumber {
    public static void main(String[] args) {

        int[] a = {2, 6, 3, 4, 5, 1};
        int temp;
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second largest Number is: " + a[1]);
    }
}
