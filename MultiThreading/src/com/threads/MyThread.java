package com.threads;

public class MyThread extends Thread  {

	public static void main(String[] args) { // Main-Thread

		

		
		
		
			MyThread t1 = new MyThread();
			
				t1.setName("ChildThread");
				t1.setPriority(NORM_PRIORITY+1); // 6
			
			
			System.out.println(t1);
			
			t1.start();   // internally calling run();
			
			
			

			for(int i=0;i<5;i++) {
				
				System.out.println("Main "+i);
				
			}
			
		

	}
	
	
	
		@Override
		public void run() {  // threads logics
			
			for(int i=0;i<5;i++) {
				
				System.out.println("Child "+i);
				
			}
			
		}
	
	
	
	
	
	
	public int add(int a,int b) {  // add - thread
		
		return a+b;
		
	}

}
