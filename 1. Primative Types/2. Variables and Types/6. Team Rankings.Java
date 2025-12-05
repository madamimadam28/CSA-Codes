/*The football season is here, and the standings are out! Unfortunately, the weekend’s games have shuffled all the teams around.

If you run the starter code now, you will get the variables in the original order. Your task is to switch the teams around and get them in the new order. You should do this by switching variable values, not just retyping the names. */

public class TeamRanks
{
    public static void main(String[] args) {
		String team1 = "Alabama";
		String team2 = "Ohio State";
		String team3 = "Florida State";
		String team4 = "USC";
		String team5 = "Clemson";
		String team6 = "Penn State";
		String team7 = "Oklahoma";
		String team8 = "Maryland";
		String team9 = "Wisconsin";
		String team10 = "Michigan";
		/*
		 * Don't edit above this line.
		 * Enter your code below this comment.
		 */
        String temp = team6;
        team6 = team2; 
        team2 = temp;

        temp = team8;
        team8 = team3;
        team3 = temp;

        temp = team10;
        team10 = team4;
        team4 = temp;

        temp = team10;
        team10 = team5;
        team5 = temp;

        temp = team10;
        team10 = team6;
        team6 = temp;
        
        temp = team9;
        team9 = team8;
        team8 = temp;
		
		/*
		 * Don't edit below this line.
		 * Enter your code above this comment.
		 */

		System.out.print("1. ");
		System.out.println(team1);
		System.out.print("2. ");
		System.out.println(team2);
		System.out.print("3. ");
		System.out.println(team3);
		System.out.print("4. ");
		System.out.println(team4);
		System.out.print("5. ");
		System.out.println(team5);
		System.out.print("6. ");
		System.out.println(team6);
		System.out.print("7. ");
		System.out.println(team7);
		System.out.print("8. ");
		System.out.println(team8);
		System.out.print("9. ");
		System.out.println(team9);
		System.out.print("10. ");
		System.out.println(team10);
	}
}