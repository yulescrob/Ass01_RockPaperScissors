import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String playerA="";
        String playerB="";
        boolean done=false;
        String YNResponse="";
        boolean imputCase=false;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Move options: R-rock P-paper S-scissors");//menu

            //checks for correct input form player A
            do {
                System.out.print("Player A, enter your move: ");
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R"))
                {imputCase=true;}
                else if (playerA.equalsIgnoreCase("S"))
                {
                    imputCase = true;
                }
                else if (playerA.equalsIgnoreCase("P"))
                {
                    imputCase = true;
                }
                else {
                    imputCase= false; //if the input is not R,P,S then it ask the player the question again
                }
            }

            while (!imputCase);

            //check for correct input form player B
            do {
                System.out.print("Player B, enter your move: ");
                playerB = in.nextLine();
                if (playerB.equalsIgnoreCase("R"))
                {imputCase=true;}
                else if (playerB.equalsIgnoreCase("S"))
                {
                    imputCase = true;
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    imputCase = true;
                }
                else {
                    imputCase= false;
                }
            }
            while (!imputCase);


                if (playerA.equalsIgnoreCase("R")) {
                    if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock, it's a tie!");}
                    else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock, Player B wins!");}
                    else { //default to scissors for player B
                    System.out.println("Rock breaks Scissors, Player A wins!");}

                    }

                else if (playerA.equalsIgnoreCase("P")) {
                    if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("Paper covers Rock, Player A wins!");}
                    else if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("Paper vs Paper, its a tie!");}
                    else { //default to scissors for player B
                        System.out.println("Scissors cuts Paper, Player B wins!");}
                        }

                else { //default to scissors for player A
                    if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("Rock breaks Scissors, Player B wins!");}
                    else if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("Scissors cuts Paper, player A wins!");}
                    else { //default to scissors for player B
                        System.out.println("Scissors vs Scissors, it's a tie!");}
                }
                System.out.print("Do you want to play again? [Y/N]: ");
                YNResponse = in.nextLine();
                if (YNResponse.equalsIgnoreCase("N")) {
                    done = true; //if answer is no then it's true that the player is done
                }

        }
        while (!done);
    }
}