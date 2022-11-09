package aula12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ValidaListaThread extends Thread{
	
	List<Produto> Produtos = new ArrayList<Produto>();
	private final long QUINZE_SEGUNDOS = 15000;
	
	public ValidaListaThread() {}
	
	public ValidaListaThread(List<Produto> produtos) {
		this.Produtos = produtos;
	}
	
	public void run(){
		while(true) {
			try {
				Thread.sleep(QUINZE_SEGUNDOS);
				if(Produtos.isEmpty()) {
					System.out.println("A lista está Vazia");
				}else {
					System.out.println("A lista não está vazia");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
						
		}
	}
	
	

}
