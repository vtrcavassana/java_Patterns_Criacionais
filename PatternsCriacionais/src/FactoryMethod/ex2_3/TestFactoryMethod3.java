package FactoryMethod.ex2_3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class TestFactoryMethod3 {
	
	public static void main(String[] args) throws IOException {
		
		String r = JOptionPane.showInputDialog("Escolha entre arquivo ou console");
		Log log = null;
		
		if(r.equals("arquivo")) {
			JOptionPane.showMessageDialog(null, "Voc� escolheu a op��o 'arquivo'");		
			log = new LogNoArquivo();
			
		}else if(r.equals("console")) {
			
			JOptionPane.showMessageDialog(null, "Voc� escolheu a op��o 'console'");		
			log = new LogNoConsole();
		}else {
			JOptionPane.showMessageDialog(null, "voce digitou a op��o errada!");	
			System.exit(1);
		}

		for (int i = 1; i <= 10; i++)
			log.escreverLog("Contando: " + i);
	}
}