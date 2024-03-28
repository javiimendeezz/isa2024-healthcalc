package uma;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertEquals(140.0f, result, 0.01f); // Cambiar el valor esperado según el cálculo esperado para una altura de 300cm
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

    //Test para basalMetabolicRate

    @Test
    public void testBMRForMale() throws Exception {
        float result = calculator.basalMetabolicRate(70, 170, 'm', 30);
        assertEquals(1617.5f, result, 0.1f);
    }

    @Test
    public void testBMRForFemale() throws Exception {
        float result = calculator.basalMetabolicRate(60, 160, 'w', 35);
        assertEquals(1264f, result, 0.1f);
    }

    @Test
    public void testNegativeWeight() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.basalMetabolicRate(-70, 180, 'm', 40);
        });
    }

    @Test
    public void testHeightAboveUpperLimit() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.basalMetabolicRate(65, 310, 'w', 45);
        });
    }

    @Test
    public void testHeightBelowLowerLimit() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.basalMetabolicRate(65, 0, 'w', 45);
        });
    }

    @Test
    public void testHeightAtLowerLimit() throws Exception {
        float result = calculator.basalMetabolicRate(65, 140, 'w', 45);
        assertEquals(1139f, result, 0.1f);
    }

    @Test
    public void testHeightAtUpperLimit() throws Exception {
        float result = calculator.basalMetabolicRate(65, 300, 'w', 45);
        assertEquals(2139f, result, 0.1f);
    }

    @Test
    public void testNegativeAge() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.basalMetabolicRate(75, 180, 'm', -50);
        });
    }

    @Test
    public void testInvalidGender() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.basalMetabolicRate(80, 170, 'x', 55);
        });
    }
    
}
