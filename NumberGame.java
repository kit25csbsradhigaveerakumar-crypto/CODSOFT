import java.util.Random;
import java.util.Scanner;

class NumberGame{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random randomnumber = new Random();

        int totalscore = 0;
        char userchoice;

        System.out.println("=============================");
        System.out.println("     NUMBER GUESSING GAME");
        System.out.println("=============================");

        do{

            int targetnum = randomnumber.nextInt(100)+1;

            int attemptLimit = 5;
            int attemptCount = 0;
            int playerGuess = 0;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + attemptLimit + " attempts to guess the number.");
            while(attemptCount < attemptLimit){

                System.out.print("Enter your guess: ");
                playerGuess = sc.nextInt();

                attemptCount++;

                if(playerGuess == targetnum){

                    System.out.println("\nCongratulations!");
                    System.out.println("You guessed the correct number.");

                    int roundScore = (attemptLimit - attemptCount + 1)*10;
                    totalscore += roundScore;

                    System.out.println("Attempts Used: " + attemptCount);
                    System.out.println("Round Score: " + roundScore);
                    System.out.println("Total Score: " + totalscore);
                     
                    break;
                }
                else if(playerGuess < targetnum){
                    System.out.println("Too Low!");
                }
                else{
                    System.out.println("Too High!");
                }
                System.out.println("Attempts Left : " + (attemptLimit - attemptCount));
            }
            if(playerGuess != targetnum){
                System.out.println("\nGame Over!");
                System.out.println("The correct number was: " + targetnum);
            }
            System.out.print("\nDo you want to play again? (Y/N): ");
            userchoice = sc.next().charAt(0);
        }while(userchoice == 'Y'||userchoice == 'y');

        System.out.println("\nThank you for playing the Number Guessing Game!...");
        sc.close();
    }
}