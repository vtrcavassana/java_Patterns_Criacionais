package FactoryMethod.ex2_1;

public class NomeInvertido implements ParserNome {

	@Override
	public Nome parse(String s) {

		int space = s.indexOf(" ");
		String nome = s.substring(space+1, s.length());
		String sobrenome = s.substring(0, space-1);
		
		return new Nome(nome, sobrenome);
	}

}