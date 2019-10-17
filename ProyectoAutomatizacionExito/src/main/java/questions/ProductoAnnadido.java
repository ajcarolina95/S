package questions;

//import co.com.choucair.proyectobase.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SeleccionarProducto;

public class ProductoAnnadido implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(SeleccionarProducto.VALOR_TOTAL).viewedBy(actor).asString();
	}

	public static ProductoAnnadido alCarrito() {
		return new ProductoAnnadido();
	}
}
