import java.util.Hashtable;
import java.util.Random;

public class file {
    public static void main(String[] args){
        //----------Variables-----------//
        // Integers
        byte b = -128; //Range: -128 to 127 | 8 bits
        short s = -32768; //Range: -32768 to 32767 | 16 bits
        int numI = 29932938; //Range: -2,147,483,648 to 2,147,483,647 | 32 bits
        long numL = 3238118123382318312L; //Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 with 'L' at the end. | 64 Bits

        // Floatings
        float numF = 3.2123234f; //Range: 32 bits with 'F' at the end.
        double numD = 8327.2381; //Range: 32 bits

        // Char
        char c = 'v';

        //Bool
        boolean ban = true;

        System.out.print(b);
        //-----------Arrays-----------//
        String[] food = {"Bread", "Wheat", "Vine", "Egg", "Carrot"};
        //Direct selection
        food[2] = "Onion"; //Vine is replaced by Onion
        System.out.print(food[1]); //Outputs Wheat
        System.out.print(food.length); //Outputs 5


        //--------Dictionary--------//
        // You must import the hashtable | import java.util.Hashtable;
        
        Hashtable<Integer, String> months = new Hashtable<Integer, String>();
        //Add elements to dictionary
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        
        //--------Conditionals--------//
        int num =10;

        //if
        if(num >= 0){
            System.out.println("Positive number");
        } 
        //else if ...
        else {
            System.out.println("Negative number");
        }

        //switch
        switch (num) {
            case 10:
                System.out.println("Number is 10");      
                break;
            // Other cases ...
            default:
            System.out.println("Default case");
                break;
        }

        //Ternary
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println("The number is a " +result);

        //--------Loops--------//
        int cont = 1;
        while (cont <= 4){
            System.out.println(cont);
            cont++;
        }

        for (int i = 0; i<=3; i++){
            System.out.println(i);
        }

        

    }

    //--------Functions--------//
    public static void jump() {
        System.out.println("Jumping");       
    }

    public static int getRandomIntBetween(int max, int min) {
        Random rand = new Random();
        return rand.nextInt(max-min) + min;
    }
}