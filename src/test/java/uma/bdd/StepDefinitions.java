package uma.bdd;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uma.HealthCalcImpl;


public class StepDefinitions {
    private int altura;
    private char genero;
    private int edad;
    private Float peso;
    private HealthCalcImpl calc;
    private Float result ;
	private boolean raiseException;
    private Float bmr;

    @Before
	public void initialization() {
        this.altura=0;
        this.genero=' ';
        this.edad=0;
        this.peso=null;
		calc = null;
	    result = null;
	    raiseException = false;
        bmr=null;
	}

    @Given("tengo una calculadora de salud")
public void tengo_una_calculadora_de_salud() {
   
    calc = new HealthCalcImpl();
}


    @When("calculo el peso ideal con entrada valida de un hombre que mide {int}")
    public void calculo_el_peso_ideal_con_entrada_valida_de_un_hombre_que_mide(Integer int1) {
        this.altura=int1;
        this.genero='m';
        try {
            result=calc.idealWeight(altura, genero);
        } catch (Exception e) {
            raiseException=true;
        }
    }

    @When("calculo el peso ideal con entrada valida de una mujer que mide {int}")
public void calculo_el_peso_ideal_con_entrada_valida_de_una_mujer_que_mide(Integer int1) {
    this.altura=int1;
    this.genero='w';
        try {
            result=calc.idealWeight(altura, genero);
        } catch (Exception e) {
            raiseException=true;
        }
}


@When("calculo el peso ideal con entrada no valida de una persona de genero {string}")
public void calculo_el_peso_ideal_con_entrada_no_valida_de_una_persona_de_genero(String string) {
    char gender = string.charAt(0);
    this.genero=gender;
    try {
        result=calc.idealWeight(180, this.genero);
    } catch (Exception e) {
        raiseException=true;
    }
}

@When("calculo el peso ideal con entrada no valida de una persona que mide {int}")
public void calculo_el_peso_ideal_con_entrada_no_valida_de_una_persona_que_mide(Integer int1) {
    this.altura=int1;
    try {
        result=calc.idealWeight(int1, 'm');
    } catch (Exception e) {
        raiseException=true;
    }
}

@Then("el peso ideal debería ser {float}")
public void el_peso_ideal_debería_ser(float expected) {
    float delta = 0.001f;
    Assertions.assertEquals(expected, result,delta);
}


@Then("el sistema lanza una excepcion")
public void el_sistema_lanza_una_excepcion() {
    Assertions.assertTrue(raiseException);
}

@When("calculo el BMR cuya entrada es {float}, {int}, {int}, {string}")
public void calculo_el_bmr_cuya_entrada_es(float int1, Integer int2, Integer int3, String string) {
    this.peso=int1;
    this.altura=int2;
    this.edad=int3;
    char gender = string.charAt(0);
    this.genero=gender;
        try {
            bmr=calc.basalMetabolicRate(this.peso, this.altura, this.genero, this.edad);
        } catch (Exception e) {
            raiseException=true;
        }
}
@Then("el BMR ser {float}")
public void el_bmr_ser(float expected) {
    float delta = 0.001f;
    Assertions.assertEquals(expected, bmr,delta);
}




}