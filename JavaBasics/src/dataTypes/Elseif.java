package dataTypes;

public class Elseif {
	
	public static void main(String args[]){
		int Mark=55;
		
		if(Mark>90){
			System.out.println("A Grade");	
		}
		else if(Mark>80 && Mark<=90){
			System.out.println("B Grade");
		}
		else if(Mark>70 && Mark<=80){
			System.out.println("C Grade");
		}
		else if(Mark>60 && Mark<=70){
			System.out.println("D Grade");
		}
		else if(Mark>50 && Mark<=60){
			System.out.println("E Grade");
		}
		else{
			System.out.println("Fail");
		}
	}
}
