package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SeleccionarProducto;

public class ProductoAnnadido implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		//Visibility.of(IrAlCarrito.VALOR_TOTAL).viewedBy(actor).asBoolean();		
		return Text.of(SeleccionarProducto.VALOR_TOTAL).viewedBy(actor).asString();
		
	}

	public static ProductoAnnadido alCarrito() {
		return new ProductoAnnadido();
	}
}
