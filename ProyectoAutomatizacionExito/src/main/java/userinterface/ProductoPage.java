package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductoPage {

    public static final Target AGREGAR_CARRITO = Target.the("Agregar Al carrito").located(By.xpath("//div[contains(text(),'Agregar')]")),
                               IR_Al_CARRITO = Target.the("Ir al carrito").located(By.xpath("//body[@class='bg-base']/div[@class='render-container render-route-store-search-subcategory']/div[@class='render-provider']/div[@class='vtex-store__template bg-base']/div[@class='flex flex-column min-vh-100 w-100']/div[@class='vtex-product-context-provider']/div[@class='flex flex-column min-vh-100 w-100']/div[@id='headerComponent']/div[@id='header-container']/div[@class='z-5 relative bg-white exito-header-2-x-searchBar']/div[@class='ph6 exito-header-2-x-searchBarItem']/div[@class='header-options-user']/div[@class='header-links-content']/div[@class='minicart-content item-header-link flex justify-center']/div[@class='minicart-content minicart-content-mobile']/aside[@class='exito-minicart-3-x-container relative fr flex items-center']/div[@class='flex flex-column']/div[@class='exito-header-2-x-minicartButtonMobile exito-header-2-x-minicartButton']/div[@class='exito-header-2-x-minicartInner']/*[1]"));
}