package javaclass;

class Classa{
	
	public Classa(){
		System.out.println("This is method1");
	}
	
	public void f1(){
		System.out.println("Function1");
	}
	
	public void f1(int a){
		System.out.println("Functionnew");
	}
	
	public void f2(){
		System.out.println("Function2");
	}
	public void f3(int a, int b){
		System.out.println("Function is"+a+" "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Classa a = new Classa();
a.f1();
a.f2();
a.f1(1);
a.f3(1,2);
}
	}
