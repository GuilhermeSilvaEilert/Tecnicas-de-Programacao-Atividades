package aula12;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Executathread {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		ImprimeNumeroThread imprimeNumeroThread = new ImprimeNumeroThread();
		ImprimeNumeroThread imprimeNumeroThread2 = new ImprimeNumeroThread();
		imprimeNumeroThread.start();
		imprimeNumeroThread2.start();
		*/
		List<Produto> Produtos = new ArrayList<Produto>();
		ValidaListaThread validaLista = new ValidaListaThread(Produtos);
		validaLista.start();
		while(true) {
			String CadastrarOuRemoverProduto = JOptionPane.showInputDialog("Deseja cadastrar ou remover produto ?\n 1 para cadastrar e 2 para remover tudo");
			
			switch(CadastrarOuRemoverProduto) {
			case "1":
				String Produto = JOptionPane.showInputDialog("Digite o produto que deseja cadastrar");
				String PrecoProduto = JOptionPane.showInputDialog("Digite o  preço do produto que deseja cadastrar");
				Produto produto = new Produto();
				produto.nomeProduto = Produto;
				produto.precoProduto = Double.parseDouble(PrecoProduto);
				Produtos.add(produto);
			break;
				
			case "2":
				Produtos.removeAll(Produtos);
				
			default:
				System.out.println("Opção invalida digite um valor de um a dois");
				System.out.println(Produtos);
	
			}
		}
	}	
}
