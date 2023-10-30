package com.threads;

public class ThreadDemo extends Object implements Runnable {

	public static void main(String[] args) {

		Runnable r1 = new ThreadDemo();

		Thread t1 = new Thread(r1);

		t1.setName("Javeed");

		Thread t2 = new Thread(r1);

		t2.setName("Vishal");

		t1.start();
		t2.start();

	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println(Thread.currentThread().getName() + i);

		}

	}

}
