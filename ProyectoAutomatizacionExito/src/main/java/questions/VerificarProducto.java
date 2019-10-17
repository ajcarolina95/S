package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.VerCarritoPage.*;

public class VerificarProducto implements Question {

    public static VerificarProducto enCarrito(){
        return new VerificarProducto();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(VERIFICAR_PRODUCTO_EN_CARRITO).viewedBy(actor).asString();
    }
}
