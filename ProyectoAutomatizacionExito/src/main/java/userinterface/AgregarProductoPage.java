package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarProductoPage {
    public static final Target SELECCIONAR_FILTROS_DEL_ELECTRODOMESTICO = Target.the("Seleeccionar filtros del electrodomestico").located(By.xpath("//*/div[contains(@class,'lh-copy w-100 pv2')]/div/div/label[contains(@class,'c-on-base pointer')]"));
    public static final Target FILTRO_TIPO_MARCA = Target.the("Seleeccionar filtros de la marca").located(By.xpath("//*/input[contains(@id,'HACEB')]"));
    public static final Target SELECCION_DEL_PRODUCTO = Target.the("Seleeccionar el producto").located(By.xpath("//*/span[contains(@class,'exito-vtex-components-2-x-productBrand t-body galleryItem-productBrand exito-vtex-component-nombre-producto')]"));
    public static final Target BOTON_AGREGAR_A_CARRITO = Target.the("Boton para agregar al carrito").located(By.xpath("//*/div[contains(@class,'exito-product-details-2-x-marketplaceBuy')]//button"));
}
