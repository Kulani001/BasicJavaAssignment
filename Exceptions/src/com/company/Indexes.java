/*
Developer: Kulani Makhubele
Date: 24-07-2021
Projectname: Exceptions
Classname: Indexes.java
*/
package com.company;

public class Indexes {

    public static void checkIndex() {

        int[] arr = {1, 2, 3, 4, 5};

        //arr.length equals to 5, arrays counts from 0 so there's 4 elements instead of 5
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBound: You have reached the end of the list.");
        }
    }
}
