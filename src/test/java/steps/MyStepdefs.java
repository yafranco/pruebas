package steps;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import seleCucum.StepDefinition;

public class MyStepdefs extends StepDefinition {
    @Dado("Que el usuario ingrese a {string}")
    public void que_el_usuario_ingrese_a(String arg0) {
        assembleLink(arg0);
    }

    @Cuando("Ingresa en la opcion {string}")
    public void ingresa_en_la_opcion (String products) {
    	clickOnButton(products);
    }

	
	@Entonces("seleccionar los botones {string}")
    public void seleccionar_los_botones(String validation) {
		searchInput(validation);
    }
    
	
}
