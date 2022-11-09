package recursos;

public class Main2 {

	public static void main(String[] args) throws Exception {
		Televisao televisao = new Televisao("samsung",42);
		Cadastrar cadastrar = new Cadastrar();
		cadastrar.adiciona(televisao);
		
		System.out.println(cadastrar.buscaTelevisao("samsung"));

	}

}
