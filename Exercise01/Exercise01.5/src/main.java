package src;

class main {
    public static void main(String[] args) {

        //ToDO:
        //Output: 
        // print a 4 row pyramid of asterisks 

        //Input:
        // no input needed

        //Processing:
        // a nested for loop to print the asterisks
        
        for(int i =0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}