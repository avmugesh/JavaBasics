package exceptionhandling;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c;
		try{
			c = b/a;
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Error");
}		catch(Exception e1){
			System.out.println("General Error");
	}
	}
}
