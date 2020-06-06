package AbstractFactory.ex1_2;

public class PizzaDePresunto implements Produto{

	@Override
	public String fazer() {
		return "Pizza de Presunto: Presunto com Tomate e Queijo";
	}

}