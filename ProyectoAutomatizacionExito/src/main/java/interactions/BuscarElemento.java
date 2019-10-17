package interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class BuscarElemento implements Interaction {

    private String mapeo;
    private Target opcion;
/*
    public static Boolean deLaPagina(String mapeo, Target opcion) {
        WebElement driver = Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath(mapeo));
        return driver != null && driver.isDisplayed();
    }
*/
    public static BuscarElemento deLaPagina (String mapeo, Target opcion){
        return Tasks.instrumented(BuscarElemento.class,mapeo,opcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement driver = Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath(mapeo));
        List<WebElementFacade> click = opcion.resolveAllFor(actor);
        if (driver != null && driver.isDisplayed()){
            if(driver.equals(true)){
                System.out.println("=============================== Elemento encontrado =========================================");
               // click.get(0).click();
            }
        }
    }
}
