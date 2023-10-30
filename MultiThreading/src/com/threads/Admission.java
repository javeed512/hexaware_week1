package com.threads;

public class Admission implements Runnable{

	
	int seats = 1;
	
	public static void main(String[] args) {

		Admission admission = new Admission();

			Thread t1 = new Thread(admission);
				t1.setName("Satish");
			
			Thread t2 = new Thread(admission,"Raju");
	
			
				t1.start();
				t2.start();
			
			

	}

	
	@Override
	public synchronized void run() {
		
			System.out.println("No. of Seats available before : "+seats);
			
			
			if(seats > 0) {
				
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				
				System.out.println(Thread.currentThread().getName() +" you allocated seat");
				
				seats = seats -1;
			}
			else {
				
				System.err.println(Thread.currentThread().getName() +" Sorry! Try next year");
			}
		
		
			System.out.println("No. of Seats available after : "+seats);
	}

}
