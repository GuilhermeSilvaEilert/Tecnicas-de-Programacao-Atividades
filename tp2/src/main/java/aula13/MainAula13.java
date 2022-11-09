package aula13;

public class MainAula13 {

	public static void main(String[] args)throws InterruptedException {
		/*
		ImprimirNumero2 imprimirNumero2 = new ImprimirNumero2();
		imprimirNumero2.start();
		imprimirNumero2.join();
		
		for(int i = 0; i<=10; i++) {
			System.out.println("main " + i);
			Thread.sleep(1000);
		}
		*/
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		ThreadC threadC = new ThreadC();
		threadC.start();
		threadC.join();
		threadB.start();
		threadB.join();
		threadA.start();
		threadA.join();
	}

}
