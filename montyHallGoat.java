//Project Name: Monty Hall (No Switching)
//Date: 12/18/2018
//Name: Adam Mason
/*   Project Description   

*/
import java.util.Random;
import java.util.Scanner;
public class montyHallGoat
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        int correctDoor = rand.nextInt(3) + 1;
		System.out.println(correctDoor);
        int input, goatDoor;

        System.out.println("Which door would you like to pick: ");
        input = scan.nextInt();
		if ( input == correctDoor )
		{
			if( correctDoor == 3 )
			{
				System.out.println("There is a goat behind Door #" + ((( correctDoor + 1 ) % 4) + 1) + ".");
			}
			else if( correctDoor != 3 )
			{
				System.out.println("There is a goat behind Door #" + (( correctDoor + 1 ) % 4) + ".");
			}
		}
		else if ( input != correctDoor ) 
		{
			
		}
		System.out.print("Would you like to change your choice (Y/N): ");
		charInput = scan.nextLine().toLowercase().atChar(0);
		
		if( charInput == 'y')
		{
			input = 
		}
		
        System.out.println("The car was behind Door #" + correctDoor + "!");
        
    }
}
//end-of-file