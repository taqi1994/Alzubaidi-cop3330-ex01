import java.util.Scanner;

public class CountingNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        System.out.print("What is the input string? "); //this will ask to enter a string
        String str = input.nextLine();
        int count;
        int i; //will be used for a for-loop

        count = 0;

        //for-loop to count the total characters without counting spaces
        for( i = 0; i<str.length(); i++) {
            if (str.charAt(i) != ' ')
                count++ ;
        }

        //this will print out the number of characters of the string
        System.out.println( str+ " has " +count+ " chatacters.");
    }
}