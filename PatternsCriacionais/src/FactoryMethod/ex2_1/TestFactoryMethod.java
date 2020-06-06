package FactoryMethod.ex2_1;

import java.util.ArrayList;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Didi Mocó");
		nomes.add("Mocó, Didi");
		nomes.add("Aragão, Renato");
		nomes.add("Renato Aragão");
		
		NomeParserCreator parser;
		
		for(String nome: nomes) {
			if(nome.contains(",")) {
				parser = new NomeInvertidoParser();
			}else {
				parser = new NomeDiretoParser();
			}
			
			parser.gravar(nome);
		}

	}

}