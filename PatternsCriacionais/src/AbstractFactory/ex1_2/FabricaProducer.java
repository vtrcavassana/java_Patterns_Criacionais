package AbstractFactory.ex1_2;

public class FabricaProducer {
	public static final int PIZZAS = 1;
	public static final int CALZONES = 2;

	public static Fabrica getFactory(int factoryType) {
		
		switch(factoryType) {
		case PIZZAS: return new Pizzas();
		case CALZONES: return new Calzones();
		}
		return null;
	}

}