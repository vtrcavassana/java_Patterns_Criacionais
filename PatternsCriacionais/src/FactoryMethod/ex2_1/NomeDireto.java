package FactoryMethod.ex2_1;

public class NomeDireto implements ParserNome {

	@Override
	public Nome parse(String s) {
		
		int space = s.indexOf(" ");
		String nome = s.substring(0, space);
		String sobrenome = s.substring(space+1, s.length());
		
		return new Nome(nome, sobrenome);
	}

}