import java.util.Scanner;
class Exercise02{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //ToDo:
        // calculate the amout of paint needed to cover the walls of room
        // 1 gallon of paint per 150 sqft
        // ask the width and height of room
        // area = ((width1 * height) + (width2 * height)) * 2
        // output the number of gallons required to paint the room by gallon.
        
        //Output:
            // number of paint gallons required for room
            
        
        //Input:
            // height of room
            // width of room
        
        // Processing:
        // area = ((length * height ) + (width * height)) ^2;
        
        Scanner scan = new Scanner (System.in);
        int width1;
        int width2;
        int height;
        int area;
        int gallon;
        System.out.println("Please enter the first width: ");
        width1 = scan.nextInt();
        
        System.out.println("Please enter the height: ");
        height = scan.nextInt();
        
        System.out.println("Please enter the second width: ");
        width2 = scan.nextInt();
        area = ((width1 * height) + (width2 * height)) *2;
        gallon = area/150;
        
        System.out.println("You will need " + gallon + " gallons of paint.");
    }
}
