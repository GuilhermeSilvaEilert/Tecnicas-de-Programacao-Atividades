package recursos;
import java.util.ArrayList;
import java.util.List;

public class Cadastrar {

	public void adiciona(Televisao televisao) {
		try {
			valida(televisao);
			list.add(televisao);
		} catch (Exception exception) {
			//exception.printStackTrace();			
		}
	}
	
	public Televisao buscaTelevisao(String nomeTelevisao) {
		Televisao retorno = null;
		for(Televisao televisao : list) {
			if(televisao.equals(nomeTelevisao)) {
				 televisao = retorno;
				}
			}
		return retorno;
	}
	
	List<Televisao> list = new ArrayList<>();
	private void valida(Televisao televisao) throws Exception {
		if(televisao == null) {
			throw new Exception("Objecto Tv esta null");
		}
		if(televisao.equals("") || (televisao.tamanho < 0 || televisao.tamanho > 100)) {
			throw new Exception("dados da tv estao incorretos");
		}
	}
	
}
