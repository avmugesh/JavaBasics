package dataTypes;

public class NestedIf {
	
	public static void main(String args[]){
		
		int age=18;
		int Weight=50;
		
		if(age>18){
			System.out.println("Age is Eligible for blood donate");
			if(Weight>50){
				System.out.println("Your age and weight is eligible for blood donate");
			}
			else {
				System.out.println("Your Weight is Not Eligible for blood donate");
			}
	    }
		else{
			System.out.println("Your age and weight is Not eligible for blood donate");
		}
	}
}
