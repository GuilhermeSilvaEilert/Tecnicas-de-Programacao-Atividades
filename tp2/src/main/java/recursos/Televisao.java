package recursos;
import recursos.Main2;
public class Televisao{
	
	public Televisao(String nomeTV, int polegadas) throws Exception {
		
		nomeTelevisao = nomeTV;
		tamanho = polegadas;
		try {
			if(validar(nomeTV, polegadas) < 0) {
				System.out.print(nomeTV + " " +polegadas);
			}
		}catch(Exception exception) {
			System.out.print(nomeTV + " " +polegadas);
		}
		
	}
	
	// valida os dados da televisao
	private int validar(String nomeTV, int polegadas){
		boolean validaTv = nomeTelevisao.equals("") || (tamanho < 0 || tamanho > 100);
		if(validaTv == true) {
			return 1; // error
		}
		return -1;
	}
	
	String nomeTelevisao; // nome da tv
	int tamanho; // tamanho
	
}
