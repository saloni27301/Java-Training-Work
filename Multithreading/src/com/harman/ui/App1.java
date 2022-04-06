/*Thread Class Methods*/
package com.harman.ui;

public class App1 {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("Nmae of the Current Thread = " + thread.getName());
		System.out.println("priority = "+thread.getPriority());
		System.out.println("thread id = " +thread.getId());
		System.out.println("is Current thread alive? =" +thread.isAlive());
	}

}
