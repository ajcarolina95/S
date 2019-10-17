package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class VerCarritoPage {
    public static final Target MENU_BOTON_AGREGAR_CARRITO = Target.the("Boton agregar carrito").located(By.xpath("//*/div[contains(@class,'exito-header-2-x-minicartButtonMobile exito-header-2-x-minicartButton')]"));
    public static final Target VERIFICAR_PRODUCTO_EN_CARRITO = Target.the("Verificar el producto en carrito").located(By.xpath("//*/a[contains(@id,'product-name')]"));
}
