package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElectrodomesticosPage {

    public static final Target NEVERAS = Target.the("Neveras").located(By.xpath("//h3[contains(text(),'Neveras')]"));
}
