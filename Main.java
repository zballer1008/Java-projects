



// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        String[] choices  = {"*", "|", "/"};
        String compChoice, userChoice;
        
        
        while(true)
        {
          System.out.println("Pick a choice: \n 1. Rock (*)\n 2. Paper (|)\n 3. Scissors (/)");
          userChoice = input.nextLine();
          compChoice = choices[r.nextInt(3)];
          System.out.println("C : "+compChoice + " U: " + userChoice+"\n" +checkWinner(userChoice, compChoice) + "\n");
          System.out.println("Continue playing? (y/n) :");
          if(input.nextLine().equals("n")) break;
          
        }
        System.out.println("Thanks for Playing!");
        
        input.close();
    }
    
    public static String checkWinner(String u, String c)
    {
        if(u.equals("*"))
        {
            if(c.equals("*")) return "Tie";
            else if(c.equals("|")) return "Computer Wins!";
            return "You Win!";
        }
        else if(u.equals("|"))
        {
            if(c.equals("|")) return "Tie";
            else if(c.equals("/")) return "Computer Wins!";
            return "You Win!";
        }
        else if(u.equals("/"))
        {
            if(c.equals("/")) return "Tie";
            else if(c.equals("*")) return "Computer Wins!";
            return "You Win!";
        }
        else return "Pick a valid choice please";
        
    }
}







