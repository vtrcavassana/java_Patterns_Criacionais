package FactoryMethod.ex2_3;

import java.io.IOException;

public abstract class Log {
	private Ferramenta log;

	protected abstract Ferramenta criarFerramentaLog();

	public void escreverLog(String mensagem) throws IOException {
		if (log == null)
			log = criarFerramentaLog();
		log.registrarLog(mensagem);
	}
}
