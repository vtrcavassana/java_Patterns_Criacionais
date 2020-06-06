package FactoryMethod.ex2_2;

import javax.swing.JOptionPane;

public class TestFactoryMethod2 {

	public static void main(String[] args) {
		
		MostrarProvedor provedor;
		
		
		String senha = JOptionPane.showInputDialog("Insira a senha:");
		
		if(senha.equals("desi gnpatt er ns")) {
			
			JOptionPane.showMessageDialog(null, "Senha Correta!");
			provedor = new ProvedorConfidencial();
			provedor.mostrar();
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Senha Incorreta! Mostrando informações públicas...");
			provedor = new ProvedorPublico();
			
			provedor.mostrar();	
		}	
	}	
}