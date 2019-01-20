package inheritance;

class Inheritance3 extends Inheritance2{
	
public Inheritance3(){
	System.out.println("C class Constructor");
}

public void f3(){
	System.out.println("C class function3");	
}


public static void main(String args[]) {
	Inheritance3 c = new Inheritance3();
	c.f1();
	c.f2();
	c.f3();

}

}