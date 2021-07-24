/*
Developer: Kulani Makhubele
Date: 24-07-2021
Projectname: Exceptions
Classname: Format.java
*/
package com.company;

public class Format {

    public static void formatCheck() {

        String s = "1.2";

        //the input spring cannot be parsed to a numeric
        try {
            int i = Integer.parseInt(s);
            System.out.println(i);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormat: Invalid format.");
        }
    }
}
