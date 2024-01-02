import java.util.*;
class NumberGame
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("* WELCOME TO NUMBER GAME * ");
        Random r = new Random();
        int maxAttempts=5;
        int Score=0;
        while(true)
        {
            int g = r.nextInt(100);
            int attempts = 0;
            boolean GuessedCorrectly = false;
            System.out.println("A Number is generated between the of range of 1 to 100");
            System.out.println("You can guess a Number between them" +"\n"+"You have maximum of" +"\t"+ maxAttempts +"\t" + "attempts.");
            while(attempts<maxAttempts && !GuessedCorrectly)
            {
                System.out.println("Enter your guessed number: ");
                int UserGuess = sc.nextInt();
                attempts = attempts+1;
                if(UserGuess == g)
                {
                    GuessedCorrectly = true;
                    System.out.println("Congratulations!!" + "\n" + "Your guessed number is equal to the generated number" +"\n" + "Your number of attempts are: " + "\t"+attempts);
                    Score+=maxAttempts-attempts+1;
                }
                else if(UserGuess<g)
                {
                    System.out.println("Your guess is too Low from the generated number:");
                }
                else if(UserGuess>g)
                {
                   System.out.println("Your guess is too High from the generated number:"); 
                }
            }
            System.out.println("Would you like to play again? ");
            String PlayAgain = sc.next();
            if(PlayAgain.equalsIgnoreCase("NO"))
            {
                System.out.println("THANKS FOR PLAYING" + "\n"+ "Your total score is:" + "\t" +Score);
                break;
            }
        }
    }
}

