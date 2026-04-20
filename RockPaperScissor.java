import java.util.Scanner;

public class rps {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice: 1 for rock, 2 for paper, 3 for scissors");
            int userChoice = s.nextInt();
            int computerChoice = (int) (Math.random() * 3) + 1;
            switch (userChoice) {
                case 1:
                    if (computerChoice == 3) {
                        System.out.println("You win! Rock beats scissors.");
                    } else if (computerChoice == 2) {
                        System.out.println("You lose! Paper beats rock.");
                    } else {
                        System.out.println("It's a tie! You both chose rock.");
                    }
                    break;
                case 2:
                    if (computerChoice == 1) {
                        System.out.println("You win! Paper beats rock.");
                    } else if (computerChoice == 3) {
                        System.out.println("You lose! Scissors beats paper.");
                    } else {
                        System.out.println("It's a tie! You both chose paper.");
                    }
                    break;
                case 3:
                    if (computerChoice == 2) {
                        System.out.println("You win! Scissors beats paper.");
                    } else if (computerChoice == 1) {
                        System.out.println("You lose! Rock beats scissors.");
                    } else {
                        System.out.println("It's a tie! You both chose scissors.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
            System.out.println("Do you want to play again? (y/n)");
            String Again = s.next();
            if (Again.equalsIgnoreCase("n")) {
                break;
            }
        }
        s.close();
    }
}