/*
Developer: Kulani Makhubele
Date: 24-07-2021
Projectname: Exceptions
Classname: NumberTest.java
*/
package com.company;

public class NumberTest {

        public static void division() {

            int x = 10, y = 0;

            //cannot divide by zero
            try {
                int divide = x / y;
                System.out.println(divide);
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic: You should not divide by zero.");
            }

    }
}
