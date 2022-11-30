package com.bridgelabz;

import java.util.Scanner;

public class InsertElement {

    public static void main(String[] args) {

        int len, ele;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array: ");
        len = sc.nextInt();
        int arr[] = new int[len + 1];
        System.out.println("Enter " +len+ " elements:");

        for (int i=0; i<len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Insert the element which you want insert: ");
        ele = sc.nextInt();
        arr[len] = ele;
        System.out.println("After inserting:");

        for (int i=0; i<len; i++) {
            System.out.print(arr[i] +", ");
        }
        System.out.println(arr[len]);
    }
}
