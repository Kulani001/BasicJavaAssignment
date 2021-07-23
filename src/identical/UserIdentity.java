/*  Programmer: Kulani Makhubele
    Date Created: 19-Jul-21
    Projectname: BasicProjects.java
    Filename: UserIdentity.java
    Description: get user input in decimal value and split the value, check if identical before and after the .
*/
package identical;

import java.util.Scanner;

public class UserIdentity {
    public static void check() {

        //get user input as double
        System.out.println("Welcome, please enter a decimal value");
        Scanner s = new Scanner(System.in);
        double value = s.nextDouble();

        //create an array and convert double into a string to be able to parse into an int
        String[] stringValue = String.valueOf(value).split("\\.");

        int[] intValue = new int[2];
        intValue[0] = Integer.parseInt(stringValue[0]);
        intValue[1] = Integer.parseInt(stringValue[1]);

        //print value before and after decimal .
        for (int i : intValue) {
            System.out.println(i);
        }

        //compare the values
        if(intValue[0] == intValue[1]){
            System.out.println("identical");
        }
        else
            System.out.println("not identical");
    }
}
