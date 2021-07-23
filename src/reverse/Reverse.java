/*  Programmer: Kulani Makhubele
    Date Created: 19-Jul-21
    Projectname: BasicProjects.java
    Filename: Reverse.java
    Description: pass name and reverse without string method
*/
package reverse;

import java.util.Scanner;

public class Reverse {

    public static void reverse(){

        //get user name
        System.out.println("Welcome, please enter your name to reverse it");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        //to be able to use charAt()
        String space = "";

    for(int i = name.length()-1; i>=0; i--){
        space = space + name.charAt(i);
    }
        System.out.println("Your name has been reversed: " + space);

    }
}
