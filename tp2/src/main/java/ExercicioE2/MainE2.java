package ExercicioE2;

public class MainE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotaFiscal1 notafiscal1 = new NotaFiscal1();
		notafiscal1.getPreco("bicicleta");
		NotaFiscal2 notafiscal2 = new NotaFiscal2();
		notafiscal2.PrecoTotal(100);
		
		NotasComposite notascomposite = new NotasComposite();
		notascomposite.adicionarItens(notafiscal1);
		notascomposite.adicionarItens(notafiscal2);
		
		String itens = notascomposite.retornaNota1();
		System.out.println(itens);
	}

}
