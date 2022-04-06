/*Creating Thread By extending Java.lang.Thread.class*/
package com.harman.ui;

class ChildThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=50;i++) {
			System.out.println("Child=> "+ i);
		}
	}
}
	
public class App2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main()");
		ChildThread child=new ChildThread();
		child.start();
		System.out.println("In main( again)");
		for(int i=0;i<=50;i++) {
			System.out.println("Main=> " +i);
		}
		System.out.println("ENd of Main");

	}

}

