/*  Programmer: Kulani Makhubele
    Date Created: 19-Jul-21
    Projectname: BasicProjects.java
    Filename: NumberOfDays.java
    Description: calculate the number of days lived
*/
package age;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NumberOfDays {

        //please note I will use try and catch in assignments testing exception topic
    public static void getDays() throws ParseException {

        //get the user name
        System.out.println("Welcome to NumberOfDays lived, please enter your name");
        Scanner scans = new Scanner(System.in);
        String name = scans.nextLine();

        //get the user date of birth as a string and parse to a date object
        System.out.println("Enter your birthday in this format: yyyy-MM-dd");
        Scanner scan = new Scanner(System.in);
        String birthday = scan.nextLine();
        Date birthdate = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);

        //calculate thr birthdate with the current date
        long birthTime = birthdate.getTime();
        long currentTime = new Date().getTime();
        long days = (currentTime - birthTime) /1000 /3600 /24;
        System.out.println(name + " has lived "+ days + " days in total as to date.");

    }
}
