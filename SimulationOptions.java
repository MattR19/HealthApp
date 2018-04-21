package simOptions;
import java.util.Scanner;
public class SimulationOptions {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double goalWeight;
		int weightChangePercent;
		int goalMaintainPerecent;
		int numDays;
		String date="hello";
		Person bob = new Person();
		System.out.print("Goal Weight (lbs) " );
		goalWeight=scan.nextDouble();
		while (goalWeight>=300) {
			System.out.println("goal weight is too large, enter "
					+ "valid weight"); goalWeight=scan.nextDouble();
		}
		bob.setGoalWeight(goalWeight);
		
		System.out.print("I want to reach my goal in (# days) ") ;
		numDays=scan.nextInt();
		bob.setDays(numDays);
		
		System.out.println("\tOR select a date");
		
		System.out.println("I want to reach my goal by (dd/mm/yyyy) ");
		date=scan.next();
		bob.setDate(date);
		
		System.out.print("To reach my goal, I will change my physical activity by %") ;
		weightChangePercent=scan.nextInt();
		bob.setGoalWeight(weightChangePercent);
		System.out.println("To maintain my goal, I will change my physcial activity by %");
		goalMaintainPerecent=scan.nextInt();
		bob.setGoalMaintainPercent(goalMaintainPerecent);
		
		System.out.println("Goal Weight:\t"+bob.getGoalWeight());
		System.out.println("Reach goal in "+ bob.getDays() );
		System.out.println("Date to reach goal: "+bob.getDate());
		
		System.out.println("Weight Change Phase: " + bob.getGoalWeight());
		System.out.println("Goal Maintenance Phase"+bob.getGoalMaintain());
		
	}

}
