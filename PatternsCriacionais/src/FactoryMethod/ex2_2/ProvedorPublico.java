package FactoryMethod.ex2_2;

public class ProvedorPublico extends MostrarProvedor {
	
	@Override
	public Informacao getInformacao() {
		
		return new InformacaoPublica();
	}

}