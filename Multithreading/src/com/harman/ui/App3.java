/*Creating Thread By extending Java.lang.Runnable interface*/
package com.harman.ui;

class ThreadCode implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=50;i++) {
			System.out.println("Child=> "+ i);
		}
	}
}
	
public class App3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main()");
		ThreadCode code=new ThreadCode();
		Thread thread=new Thread(code);
		thread.start();
		System.out.println("In main( again)");
		for(int i=0;i<=50;i++) {
			System.out.println("Main=> " +i);
		}
		System.out.println("ENd of Main");

	}

}

