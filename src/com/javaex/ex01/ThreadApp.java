package com.javaex.ex01;

public class ThreadApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		//준비
		Thread thread = new DigitThread(); // 섞어쓰기     == 디폴트 생성자
		
		
		//스레드 실행 --> 출장
		//thread.run(); 이랑 구분 <-- 그냥 run 메소드를 실행
		thread.start();   //<-- thread 메모리를 시작만하고 자기 할 일 함 : 각자 실행
		
		
		//스레드 방식
		
		//시작
		
		//스레드 시작
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
		
		
		
	}

}
