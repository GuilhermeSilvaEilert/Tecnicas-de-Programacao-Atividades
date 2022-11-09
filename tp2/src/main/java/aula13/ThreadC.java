package aula13;

public class ThreadC extends Thread{
	
	public void run() {
		try {
			for(int i = 0; i<=10;i++) {
				System.out.println("Thread C");
			}
			Thread.sleep(2000);	
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}
