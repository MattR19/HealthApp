package simOptions;
import java.util.Scanner;
public class SimulationOptions {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double goalWeight=0;
		int weightChangePercent;
		int goalMaintainPerecent;
		int numDays=0;
		String date="hello";
		
		System.out.print("Goal Weight (lbs) " );
		goalWeight=scan.nextDouble();
		
		System.out.print("I want to reach my goal in (# days) ") ;
		numDays=scan.nextInt();
		
		System.out.println("\tOR select a date");
		
		System.out.println("I want to reach my goal by (dd/mm/yyyy) ");
		date=scan.next();
		
		System.out.print("To reach my goal, I will change my physical activity by %") ;
		weightChangePercent=scan.nextInt();
		System.out.println("To maintain my goal, I will change my physcial activity by %");
		goalMaintainPerecent=scan.nextInt();
		System.out.println(goalWeight);
		System.out.println(numDays);
		System.out.println(date);
		
	}

}
