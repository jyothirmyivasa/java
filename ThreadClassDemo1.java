import java.io.*;
public class ThreadClassDemo1 extends Thread{
	public static void main(String args[]){
		Thread t1=new Thread("My Thread");
		ThreadClassDemo1 t2=new ThreadClassDemo1();
		t1.start();
		t2.start();
		String str=t1.getName();
		System.out.println("The name of Thread1 is "+str);
	}
	public void run(){
		System.out.println("The thread is created and is executed ");
	}
}
