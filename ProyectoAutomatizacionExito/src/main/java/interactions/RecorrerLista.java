package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class RecorrerLista implements Interaction {

    private Target lista;
    private String opcion;

    public RecorrerLista (Target lista, String opcion){
        this.lista = lista;
        this.opcion = opcion;
    }

    public static RecorrerLista deElementos (Target lista, String opcion){
        return new RecorrerLista(lista,opcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listObjeto = lista.resolveAllFor(actor);
        for(int i=0; i < listObjeto.size(); i++){
            System.out.println("posicion: "+ i + " lista: "+listObjeto.get(i).getText()+" opcion: "+opcion);
            if (listObjeto.get(i).getText().trim().equals(opcion)) {
                listObjeto.get(i).click();
                break;
            }
        }
    }
}
