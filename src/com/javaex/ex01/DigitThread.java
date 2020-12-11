package com.javaex.ex01;

public class DigitThread extends Thread{


	//필드
	
	//생성자 필드가 없으니 디폴트 생성자
	
	//메소드 g/s 필드가 없으니 필요없다
	
	
	@Override
	public void run() { 
		
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println(cnt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
