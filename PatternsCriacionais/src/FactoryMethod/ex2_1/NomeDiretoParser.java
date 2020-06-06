package FactoryMethod.ex2_1;

public class NomeDiretoParser extends NomeParserCreator{

	@Override
	protected ParserNome getParser() {
		
		return new NomeDireto();
	}

}