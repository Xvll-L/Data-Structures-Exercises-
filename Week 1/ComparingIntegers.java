/*
Exercise 3

Write an application that asks the user to enter
two integers, obtains them from the user and displays the larger number followed by the
words "is larger". If the numbers are equal, print the message "These numbers are equal" */
import java.util.Scanner;

public class ComparingIntegers{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Integers 1");
        int input1 = Integer.valueOf(scan.nextLine());

        System.out.println("Integers 2");
        int input2 = Integer.valueOf(scan.nextLine());

        if(input1> input2){
            System.out.println(input1 + " is larger " + input2);
        } else if (input2 > input1){
            System.out.println(input2 + " is larger " + input1);
        } else{
            System.out.println("These numbers are equal");
        }
        
    }

}