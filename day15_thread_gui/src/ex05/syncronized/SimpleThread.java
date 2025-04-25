package ex05.syncronized;

public class SimpleThread {	// outer class
	
	static void threadMessage(String message) {
		String threadName = Thread.currentThread().getName();	// 해당하는 스레드 이름 출력
		System.out.printf("%s: %s \n\n", threadName, message);
		
	}
	
	static class MessageLoop implements Runnable{	// inner class

		@Override
		public void run() {
			String[] importantInfo = {"aacv", "adf df", "cc cv", "dd dfd"};
			
			try {
				for (int i = 0; i < importantInfo.length; i++) {
					Thread.sleep(4000);	// 4초
					threadMessage("I want sleep....");
				}	// for end
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}	// end MessageLoop class - inner class
	
	public static void main(String[] args) throws InterruptedException {
		long parience = 1000 * 60 * 60;
		
		if(args.length > 0) {
			try {
				parience = Long.parseLong(args[0]) * 1000;
				System.out.println(parience);
			} catch (Exception e) {
				System.out.println("argument integer input");
				System.exit(0);	// 강제종료
			}
		}	// if end
		
		threadMessage("Start MessageLoop thread test");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();// run 메서드로 유도
		
		while(t.isAlive()) {
			threadMessage("still waiting.....");
			t.join(1000);
			
			System.out.println(System.currentTimeMillis() - startTime);
			
			if(((System.currentTimeMillis() - startTime) > parience && t.isAlive())) {
				threadMessage("Tired of waiting..................");
				t.interrupt();
				t.join();
			}	// if end
		}	// while end
		
		threadMessage("Finally.................");
	}
}
