/*
Developer: Kulani Makhubele
Date: 24-07-2021
Projectname: Exceptions
Classname: NullTest.java
*/
package com.company;

import java.util.Locale;

public class NullTest {


    public static void checkNull() {
        String s = null;

        try {
            String ss = s.toLowerCase();
            System.out.println(ss);

        } catch (NullPointerException e) {
            System.out.println("NullPointer: The object is null, assign value.");
        }
    }
}
