package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import healthcalc.*;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

private HealthCalc calculator;


 @BeforeEach
    public void setUp() {
        calculator = new HealthCalcImpl();
    }

    @Test
    public void testIdealWeightMale() throws Exception {
        assertEquals(68.75, calculator.idealWeight(175, 'm'), 0.01);
    }

    @Test
    public void testIdealWeightFemale() throws Exception {
        assertEquals(59.0, calculator.idealWeight(165, 'w'), 0.01);
    }
	@Test
    public void testIdealWeightForHeight140() throws Exception {
        float result = calculator.idealWeight(140, 'm');
        assertEquals(42.5f, result, 0.01f); // Cambiar el valor esperado según el cálculo esperado para una altura de 140cm
    }

    @Test
    public void testIdealWeightForHeight300() throws Exception {
        float result = calculator.idealWeight(300, 'w');
        assertEquals(162.5f, result, 0.01f); // Cambiar el valor esperado según el cálculo esperado para una altura de 300cm
    }

    @Test
    public void testInvalidHeightBelowMinimum() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.idealWeight(139, 'm');
        });
    }

    @Test
    public void testInvalidHeightAboveMaximum() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.idealWeight(301, 'w');
        });
    }

    @Test
    public void testIdealWeight_InvalidGender() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.idealWeight(170, 'a');
        });
    }
	

}
