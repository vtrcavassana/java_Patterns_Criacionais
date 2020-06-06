package AbstractFactory.ex1_2;

import java.util.Calendar;
import java.util.Date;

public class Calzones implements Fabrica{

	@Override
	public Produto getProduto(Date data) {
		
		Calendar c = Calendar.getInstance();
		c.setTime(data);
		
		int diaSemana = c.get(Calendar.DAY_OF_WEEK);
		
		switch(diaSemana) {
		case 2: case 4: case 6:
			return new CalzoneDeCalabresa();
		case 3: case 5: case 7:
			return new CalzoneDePresunto();
		}
		
		return null;
	}
	

}