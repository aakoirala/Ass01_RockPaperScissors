import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);

        String playerA;
        String playerB;
        String contYN;
        String rock = "R";
        String paper = "P";
        String scissors = "S";

        boolean validCont = false;

        do {
            boolean validPlayerA = false;
            boolean validPlayerB = false;
            boolean validContInput = false;
            do {
                System.out.println("Player A -- Choose Rock (R), Paper (P), or Scissors (S): ");

                playerA = scan.nextLine();

                if (playerA.equalsIgnoreCase(rock) || playerA.equalsIgnoreCase(paper) || playerA.equalsIgnoreCase(scissors)) {
                    validPlayerA = true;
                } else {
                    System.out.println("Error: Must enter Rock (R), Paper (P), or Scissors (S)");
                }
            } while (!validPlayerA);

            do {
                System.out.println("Player B -- Choose Rock (R), Paper (P), or Scissors (S): ");

                playerB = scan.nextLine();

                if (playerB.equalsIgnoreCase(rock) || playerB.equalsIgnoreCase(paper) || playerB.equalsIgnoreCase(scissors)) {
                    validPlayerB = true;
                } else {
                    System.out.println("Error: Must enter Rock (R), Paper (P), or Scissors (S)");
                }
            } while (!validPlayerB);

            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println("Both players tied!");
            } else if (playerA.equalsIgnoreCase(rock) && playerB.equalsIgnoreCase(scissors)) {
                System.out.println("Player A's Rock crushed Player B's Scissors.");
            } else if (playerA.equalsIgnoreCase(paper) && playerB.equalsIgnoreCase(rock)) {
                System.out.println("Player A's Paper smothered Player B's rock.");
            } else if (playerA.equalsIgnoreCase(scissors) && playerB.equalsIgnoreCase(paper)) {
                System.out.println("Player A's Scissors tore up Player B's Paper.");
            } else if (playerB.equalsIgnoreCase(rock) && playerA.equalsIgnoreCase(scissors)) {
                System.out.println("Player B's Rock crushed Player A's Scissors.");
            } else if (playerB.equalsIgnoreCase(paper) && playerA.equalsIgnoreCase(rock)) {
                System.out.println("Player B's Paper smothered Player A's rock.");
            } else if (playerB.equalsIgnoreCase(scissors) && playerA.equalsIgnoreCase(paper)) {
                System.out.println("Player B's Scissors tore up Player A's Paper.");
            }

            do {
                System.out.println("Would you like to continue? Press Y or N");
                contYN = scan.nextLine();

                if (contYN.equalsIgnoreCase("Y") || contYN.equalsIgnoreCase("N")) {
                    validContInput = true;
                } else {
                    System.out.println("Error: Must enter Y or N");
                }
            } while (!validContInput);

            if (contYN.equalsIgnoreCase("N")) {
                validCont = true;
            }

        } while (!validCont);
    }
}