package aula1;
import aula1.Conta;

public class ContaPix implements Conta {

	@Override
	public void depositar() {
		System.out.println("depositando na conta pix");
		
	}

	@Override
	public void sacar() {
		System.out.println("sacando na conta pix");
		
	}

}
