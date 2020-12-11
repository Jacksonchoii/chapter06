package com.javaex.ex02;

public class ThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread1 = new Thread(new DigitThread());
		Thread thread2 = new Thread(new LowerThread());
		Thread thread3 = new Thread(new UpperThread());
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		//thread1.run()하고 비교해 볼 것
		
		
	}

}
