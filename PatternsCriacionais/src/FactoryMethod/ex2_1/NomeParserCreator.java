package FactoryMethod.ex2_1;

public abstract class NomeParserCreator {
	
	public void gravar(String nome) {
		ParserNome parser = getParser();
		Nome parsedName = parser.parse(nome);
		System.out.println(parsedName);
	}
	
	protected abstract ParserNome getParser();

}