package com.bridgelabz;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] inputNumArray = {2, 1, 4, 5, 1, 2, 3, 3, 6};

        for (int i=0; i<inputNumArray.length; i++) {

            for (int j=i+1; j<inputNumArray.length; j++) {

                if (inputNumArray[i] == inputNumArray[j]) {

                    System.out.println("Duplicate Element Found: " +inputNumArray[i]);
                }
            }
        }
    }
}