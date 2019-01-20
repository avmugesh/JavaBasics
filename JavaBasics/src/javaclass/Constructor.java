package javaclass;

class Constructor{
	int A;
	int B;
public Constructor(){
	
		System.out.println("Costructor is executed Successfully");
	}

public void Constructor1(int a, int b){
	this.A = a;
	this.B = b;
	System.out.println("a, b is " +A+" " +B);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor a = new Constructor();
		a.Constructor1(5,6);
	}

}
