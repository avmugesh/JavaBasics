package dataTypes;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 454;
		int temp;
		int reminder;
		int sum=0;
		temp = a;
		
		while (temp >0){
			
			reminder=temp%10;
			
			sum = (sum*10)+reminder;
			
			temp = temp/10;
			
		}
		
		if(sum==a){
			System.out.println("Given value is palindrome");
		}
		

	}

}
