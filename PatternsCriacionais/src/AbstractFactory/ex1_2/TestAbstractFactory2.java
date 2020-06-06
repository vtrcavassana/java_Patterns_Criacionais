package AbstractFactory.ex1_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestAbstractFactory2 {

	public static void main(String[] args) {

		Fabrica pizzaria = FabricaProducer.getFactory(FabricaProducer.PIZZAS);
		Fabrica calzoneria = FabricaProducer.getFactory(FabricaProducer.CALZONES);

		String DataPedido = "06/06/2020";

		Date data;

		try {
			data = new SimpleDateFormat("dd/MM/yyyy").parse(DataPedido);
		} catch (ParseException e) {
			data = new Date();
			e.printStackTrace();
		}

		Produto pizza = pizzaria.getProduto(data);
		Produto calzone = calzoneria.getProduto(data);

		if (pizza != null || calzone != null) {
			String saborCalzone = calzone.fazer();
			String saborPizza = pizza.fazer();
			System.out.println(saborCalzone);
			System.out.println(saborPizza);
		}

	}
}