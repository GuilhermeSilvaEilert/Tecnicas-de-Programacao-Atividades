package ExercicioE2;

public class NotaFiscal2 implements NotaFiscal {
	
	double totalPreco = 0; 
	
	public void PrecoTotal(double totalPreco) {
		this.totalPreco+=totalPreco;
	}

	@Override
	public String NumeroNotaFiscal() {
		// TODO Auto-generated method stub
		return String.valueOf(totalPreco);
	}


}
