package aula13;

public class ThreadA extends Thread{

	public void run() {
		try {
			for(int i = 0; i<=10;i++) {
				System.out.println("Thread A");
			}
			Thread.sleep(2000);	
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
}
