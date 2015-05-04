import java.util.Scanner;
public class DiceGame {

	public static void main(String[]args){
		
		int computerVal = 0;
		int guessValue = 0;
		int DiceCount = 1;
		String answer;
		String sAgain = "N";
		int count =0;
		int History;
		String answer3;
		
		
		
		Scanner read = new Scanner(System.in);
		
		do{// repeat until the player is done playing
			
			System.out.println("input number of dice to roll: ");
			DiceCount = read.nextInt();// read number of dices
			
			Dice gameDice = new Dice(DiceCount);
			computerVal = gameDice.RollDice();//roll the dice
			
			System.out.println("What number are you guessing: ");// get player guess
			guessValue =read.nextInt();
			
			if (guessValue == computerVal)//compare player guess to result
			{
				System.out.println("well done!");
			}
			else
			{
				System.out.println("oops...try again! ");
				
				System.out.println("play again?: ");
				sAgain= read.next();
				count++;
			}
			
			System.out.print("Would you like to know how many throws you have had?");
			answer3= read.next();
				if (answer3.equalsIgnoreCase("y"))
				{	
		
							int Throw = 0;
							
							
							System.out.print(gameDice.Throw(Throw));
							System.out.print("\n");
						}
						else
							System.out.print("ok, maybe next time");
			
			System.out.print("Would you like to know your history?");
			answer= read.next();
				if (answer.equalsIgnoreCase("y"))
				{	String answer2 = null;
				
					System.out.print("How many games would you like the history for?");
					History = read.nextInt();
						if (answer2.equalsIgnoreCase("y"))
						{
							System.out.print(gameDice.History(History));
							System.out.print("\n");
						}
						else
							System.out.print("you're missing out!");
					
				}
		
			
		} while(sAgain.equalsIgnoreCase("Y"));
		
	}
}
