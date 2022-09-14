package src;
import java.util.Scanner;


public class main {
    public static void main(String[] args){
        //To Do:
        //Calculate the average from numbers given
        // ask user to input the values
        // calculate average by summing them and dividing by number of values

        //output:
        // the average of numbers

        //input:
        // value 1, value2, value3

        //processing
        // average = (value1 + value2 + value3) 3
        
        Scanner scan = new Scanner(System.in);
        int numberOfValues;
        int sumOfValues = 0;
        int average;

        System.out.println("Hello! How many values will you be entering?: ");
        numberOfValues = scan.nextInt();
        int[] values = new int [numberOfValues];

        for (int i = 0; i < values.length; i++){
            System.out.println("What is the value of number " + (i + 1));
            values[i] = scan.nextInt();
        }
        // iterating through the values array and adding them to a int variable
        for (int i= 0; i < values.length; i++){
            sumOfValues += values[i];
        }

        average = sumOfValues / numberOfValues;

        System.out.println("The average is " + average);
        
    }
}
