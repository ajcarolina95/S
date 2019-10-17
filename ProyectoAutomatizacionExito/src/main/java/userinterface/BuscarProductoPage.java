package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarProductoPage {
    public static final Target SELECCIONAR_OPCION_DEL_MENU = Target.the("Seleccionar la opcion electrodomesticos").located(By.xpath("//*/a[contains(@class,'link department-list-item')]"));

    public static final Target MENU_ELECTRODOMESTICOS = Target.the("Seleccionar la opcion electrodomesticos").located(By.xpath("//*/a[contains(text(),'Electrodomésticos')]"));
    public static final Target SELECCIONAR_TIPO_ELECTRODOMESTICO = Target.the("Seleccionar la opcion electrodomesticos").located(By.xpath("//*/a[contains(@class,'pa0 ma0 link list-item-link electrodomésticos-subcategoria')]"));
}
