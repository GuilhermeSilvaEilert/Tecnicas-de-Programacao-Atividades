package ExercicioE2;

import java.util.ArrayList;
import java.util.List;

public class NotasComposite {
	List<NotaFiscal> listaItens = new ArrayList<NotaFiscal>();
	
	public void adicionarItens(NotaFiscal notafiscal) {
		this.listaItens.add(notafiscal);
	}
	
	public String retornaNota1() {
		String itens = " ";
		for(NotaFiscal notafiscal : listaItens) {
			itens += notafiscal.NumeroNotaFiscal();
		}
		return itens;
	}

}
