package FactoryMethod.ex2_2;

public class ProvedorConfidencial extends MostrarProvedor {

	@Override
	public Informacao getInformacao() {
	
		return new InformacaoConfidencial();
	}

}