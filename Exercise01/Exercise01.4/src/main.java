package src;
import java.util.Scanner;

class main {
    public static void main(String[] args){
        //TODO
        //Find the maximum of 3 numbers. 

        //Output:
        // the maximum of number values

        //Input:
        // values of the numbers

        //Processing:
        // a loop which compares each value and puts into order

        Scanner scan = new Scanner(System.in);

        int numberOfValues;
        
        System.out.println("Hello! How many values will you be entering?: ");
        numberOfValues = scan.nextInt();

        int[] values = new int [numberOfValues];

        for (int i = 0; i < values.length; i++) {
            System.out.println("What is the value of number " + (i + 1));

            values[i] = scan.nextInt();
        }

        int maxValue = values[0]; // initializing the max value to values[0]

        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }

        System.out.println("The max value is: " + maxValue);


    }
}