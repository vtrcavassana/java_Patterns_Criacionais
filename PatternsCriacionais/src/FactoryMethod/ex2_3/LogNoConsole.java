package FactoryMethod.ex2_3;

public class LogNoConsole extends Log {

	protected Ferramenta criarFerramentaLog() {
		return new Console();
	}
}