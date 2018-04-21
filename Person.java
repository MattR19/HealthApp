package simOptions;

public class Person {

	private double goalWeight;
	private int weightChangePercent;
	private int goalMaintainPerecent;
	private int numDays;
	
	Person(){
		goalWeight=0;
		weightChangePercent=0;
		goalMaintainPerecent=0;
		numDays=0;
	}
	
	Person(double weight, int weightChange, int goalMaintain, int days){
		goalWeight=weight;
		weightChangePercent=weightChange;
		goalMaintainPerecent=goalMaintain;
		numDays=days;
	}
	
	public void setGoalWeight(int weight) {
		goalWeight=weight;
	}
	public double getGoalWeight() {return goalWeight;	}
	
	public void setWeightChangePercent(int percent) {
		weightChangePercent=percent;
	}
	public int getWeightChange() {return weightChangePercent;}
	
	public void setGoalMaintainPercent(int percent) {
		goalMaintainPerecent=percent;
	}
	public int getGoalMaintain() {return goalMaintainPerecent;}
	
	
	public void setDays(int days) {
		numDays = days;
	}
	public int getDays() {return numDays;}
	
}
