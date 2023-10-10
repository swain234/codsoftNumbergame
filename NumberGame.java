import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int max_attempts = 5;
        int rounds = 0;
        int totalAttempts = 0;

        while(true){
            int numbertoguess = random.nextInt(max-min+1)+min;
            int guessedbyuser;
            int attempts = 0;

            System.out.println("Rounds "+(rounds + 1) + ": Guess the number between " + min + " and " + max);
            do{
                System.out.println("Enter your guess :");
                guessedbyuser = scanner.nextInt();
                attempts++;
                if (guessedbyuser==numbertoguess){
                    System.out.println("!!!!Congratulations!!!! You guessed the correct number in "+ attempts+ "attempts. ");
                } else if(guessedbyuser < numbertoguess ){
                    System.out.println("Need to guess a greater number.!!TRY AGAIN!!");
                }else{
                    System.out.println("Need to guess a lesser number.!!TRY AGAIN!!");
                }
            }while ( guessedbyuser != numbertoguess && attempts < max_attempts);
            totalAttempts += attempts;
            rounds++;

            System.out.println("Do you want to play again? (Yes/No)");
            String Replay = scanner.next().toLowerCase();

            if(!Replay.equals("yes")) {
                System.out.println("!!Game Over!!");
                System.out.println("You played "+ rounds + " rounds and took "+ attempts +" attempts in total. ");
                break;
        }
    }
    scanner.close();
}}