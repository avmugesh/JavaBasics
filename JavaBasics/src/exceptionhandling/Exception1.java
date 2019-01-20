package exceptionhandling;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c;
	try{
		c = b/a;
		
	}catch(Exception e){
		System.out.println("Error");
	}finally{
		System.out.println("Final block is executed");
	}
	
	}

}
