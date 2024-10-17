import java.io.*;
class TryCatch5{
	public static void main(String arhs[]){
		int a=5,b=0,c;
		try{
			throw new IOException();
		}
		catch(IOException ioe){
			System.out.println("IOException caught");
		}
	}
}
