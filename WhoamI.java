import java.io.*;
class A{
	void callMe(){
		System.out.println("Iam from A");
	}
}
class B extends A{
	void callMe(){
		System.out.println("Iam from B");
	}
}
class WhoamI{
	public static void main(String args[]){
		A a1=new A();
		A a2=new B();
		B b=new B();
		a1.callMe();
		a2.callMe();
		b.callMe();
	}
}