//Project Name: Monty Hall (No Switching)
//Date: 12/18/2018
//Name: Adam Mason
/*   Project Description   

*/
import java.util.Random;
import java.util.Scanner;
public class montyHall
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        int correctDoor = rand.nextInt(3) + 1;
        int input;

        System.out.println("Which door would you like to pick: ");
        input = scan.nextInt();

        System.out.println("The car was behind Door #" + correctDoor + "!");
        System.out.println("You picked Door #" + input + ".");
        
    }
}
//end-of-file