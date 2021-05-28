package MockTest;

import java.util.Arrays;
import java.util.Scanner;

interface HockeyTeam{
	
	public int calculateHockeyScore();
	public int findHighestGoalByIndividualInHockey();
	
}

interface FootballTeam{
	
	public int calculateFootballScore();
	public int findHighestGoalByIndividualInFootball();
	
}

class Sport implements HockeyTeam, FootballTeam{
	/**
	 * @param hockeyPlayers
	 * @param footballPlayers
	 */
	public Sport(int[] hocketPlayers, int[] footballPlayers) {
		super();
		this.hockeyPlayers = hocketPlayers;
		this.footballPlayers = footballPlayers;
	}

	int[] hockeyPlayers, footballPlayers;
	
	
	
	
	@Override
	public int calculateFootballScore() {
		int total = 0;
		for(int score : footballPlayers) {
			total += score;
		}
		return total;
	}

	@Override
	public int findHighestGoalByIndividualInFootball() {
		return Arrays.stream(footballPlayers).max().getAsInt();
	}

	@Override
	public int calculateHockeyScore() {
		int total = 0;
		for(int score : hockeyPlayers) {
			total += score;
		}
		return total;
	}

	@Override
	public int findHighestGoalByIndividualInHockey() {
		return Arrays.stream(hockeyPlayers).max().getAsInt();
	}
	
	
}

public class multipleInheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] hockeyPlayers = new int[11];
        int[] footballPlayers = new int[11];
       
        for(int i = 0; i < 11; i++)
        {
            hockeyPlayers[i] = sc.nextInt();
        }

        for(int i = 0; i < 11; i++)
        {
            footballPlayers[i] = sc.nextInt();
        }
        sc.close();
        Sport s = new Sport(hockeyPlayers, footballPlayers);
        try{
            HockeyTeam.class.getMethod("calculateHockeyScore");
            HockeyTeam.class.getMethod("findHighestGoalByIndividualInHockey");
            FootballTeam.class.getMethod("calculateFootballScore");
            FootballTeam.class.getMethod("findHighestGoalByIndividualInFootball");

            if(s instanceof HockeyTeam && s instanceof FootballTeam)
            {
                System.out.println("Total Hokcey Score: "+s.calculateHockeyScore());
                System.out.println("Highest in Hockey: "+s.findHighestGoalByIndividualInHockey());
                
                System.out.println("Total Football Score: "+s.calculateFootballScore());
                System.out.println("Highest in Football: "+s.findHighestGoalByIndividualInFootball());
            }
        }
        catch (NoSuchMethodException ex)
        {
            System.out.println("No such function is exits");
        }

	}

}
