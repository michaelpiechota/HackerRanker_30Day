/*
Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you.

You must:
Declare  variables: one of type int, one of type double, and one of type String.
Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your
variables.
Use the  operator to perform the following operations:
Print the sum of  plus your int variable on a new line.
Print the sum of  plus your double variable to a scale of one decimal place on a new line.
Concatenate  with the string you read as input and print the result on a new line.
*/

import java.util.*;

public class Day2{

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int secondInt = 0;
        Double secondDouble = 0.0;
        String secondString = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        secondInt = scan.nextInt();
        secondDouble = scan.nextDouble();
        scan.nextLine(); //needed to consume the last newline character that scan.nextDouble() doesn't pickup.
        secondString = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + secondInt);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + secondDouble);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        String concatString = s.concat(secondString);
        System.out.println(concatString);

        scan.close();
    }
}

