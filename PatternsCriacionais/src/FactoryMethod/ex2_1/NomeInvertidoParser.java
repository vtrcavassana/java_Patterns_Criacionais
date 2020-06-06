package FactoryMethod.ex2_1;

public class NomeInvertidoParser extends NomeParserCreator{

	@Override
	protected ParserNome getParser() {
		
		return new NomeInvertido();
	}

}