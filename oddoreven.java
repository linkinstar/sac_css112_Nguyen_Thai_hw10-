package dicegame;

import java.util.Scanner;

public class oddoreven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("******Welcome to guess odd or even dice******");
		int dicenum;
		System.out.println(" Enter number of dices to roll : ");
		dicenum = input.nextInt();
		int computerdice;
		int computerst;
		dice numdice = new dice();
		int countturn = 0;
		int countwin = 0;
		int winpercent;
		int counteven = 0;
		int countodd = 0;
		int oddpercent;
		int evenpercent;
		String turn = "yes";
		String playerguess;
		int player = 0;
	
		while (turn.toLowerCase().equals("yes")) {
			System.out.println("Player throw a dice !!!");
			computerdice = numdice.dice(dicenum);
			System.out.print("please guess the number is odd or even: ");
			playerguess = input.next();
			// 1= odd,0= even;
			if (playerguess.toLowerCase().equals("odd"))
				player = 1;
			else if (playerguess.toLowerCase().equals("even"))
				player = 0;
			System.out.println("Number of the dice is :" + computerdice);
			computerst = computerdice % 2;
			if (computerst == 0)
				counteven++;
			else
				countodd++;
			if (player == computerst) {
				System.out.println("******Correct!! you won!!******");
				countwin++;
			} else
				System.out.println("******Wrong!! You lose!!******");

			countturn++;
			oddpercent = (countodd * 100) / countturn;
			evenpercent = (counteven * 100) / countturn;
			System.out.println("Percent of odd:" + oddpercent);
			System.out.println("Percent of even:" + evenpercent);
			System.out.println("Number of gameplayed:" + countturn);
			winpercent = (countwin * 100) / countturn;
			System.out.println("Your Winning percent:" + winpercent);
			System.out.println("Do you want to play again(Yes/No):");
			turn = input.next();

		}

	}
}
