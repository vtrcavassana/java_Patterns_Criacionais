package FactoryMethod.ex2_2;

import java.io.IOException;

public abstract class MostrarProvedor {
	
	public void mostrar (){
		Informacao info = getInformacao();
		String msg = null;
		try {
			msg = info.informacao();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(msg);				
	}
	
	protected abstract Informacao getInformacao();
}