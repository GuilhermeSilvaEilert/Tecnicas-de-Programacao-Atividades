package ExercicioE2;

public class NotaFiscal1 implements NotaFiscal {
	
	String Produto;
	
	public void getPreco(String Produto) {
		this.Produto = Produto;
	}
	
	@Override
	public String NumeroNotaFiscal() {
		// TODO Auto-generated method stub
		return (Produto);
	}

	

	
}
