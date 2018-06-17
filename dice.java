

import java.util.Random;
import java.util.Scanner;

public class dice
{
    private static Scanner input;

	public static void main(String []args)
    {
        Random dice = new Random();
        input = new Scanner(System.in);
        int face;
        int result;

        
        System.out.println("How many faces does the dice have?");
        face = input.nextInt();
        result = dice.nextInt(face) + 1;
        System.out.println("\nThe dice rolled a " + result + ".");
    }
}
