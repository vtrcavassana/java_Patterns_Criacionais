package FactoryMethod.ex2_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo extends Ferramenta {
	private File arquivoLog;

	public Arquivo() {
		String pacote = "C:\\Users\\Administrador\\Documents\\git\\java-test\\PatternsCriacionais\\src\\FactoryMethod\\ex2_3\\";
		arquivoLog = new File(pacote, "Log.txt");

		try {
			if (!arquivoLog.exists())
				arquivoLog.createNewFile();
		} catch (IOException e) {
			System.exit(1);
		}
	}

	public void registrarLog(String mensagem) throws IOException {
			FileWriter writer = null;
			try {
				writer = new FileWriter(arquivoLog, true);
			} catch (IOException e) {
				e.printStackTrace();
			}
			writer.write(mensagem + "\n");
			writer.close();
	}
}