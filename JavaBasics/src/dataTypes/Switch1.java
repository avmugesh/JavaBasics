package dataTypes;

public class Switch1 {
	public static void main(String args[]){
		
		int level=0;
		String Grade="Beginner";
		switch(Grade){
			case"Beginner": level=1;
			break;
			case"Intermediate": level=2;
			break;
			default: System.out.println("Invalid Grade");
		}
		System.out.println("the level for grade "+Grade+ " is level:"+level);
	
}
	

}
