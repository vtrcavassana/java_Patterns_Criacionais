package FactoryMethod.ex2_3;

public class LogNoArquivo extends Log {
	
	protected Ferramenta criarFerramentaLog() {
		return new Arquivo();
	}
}