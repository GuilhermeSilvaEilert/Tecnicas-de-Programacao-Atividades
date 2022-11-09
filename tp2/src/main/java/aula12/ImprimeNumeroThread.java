package aula12;

import java.util.Date;

public class ImprimeNumeroThread extends Thread{

	private final long TRES_SEGUNDOS = 3000;
	
	public ImprimeNumeroThread() {}
	
	public void run() {
	
		for(int i=0; i <= 1000000; i++) {
			try {
				Thread.sleep(TRES_SEGUNDOS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);			
		}
		}
	}

