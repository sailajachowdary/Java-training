package com.java.dailyAssignments11;

public class DaemonThread {
public void run() throws InterruptedException {
	Thread t1=new Thread();
	t1.start();
	System.out.println("running child Thread in loop");
	try {
	Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		System.out.println("Thread interrupted...");
	}
}
}