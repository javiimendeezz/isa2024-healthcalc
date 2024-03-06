package healthcalc;

public class HealthCalcImpl implements HealthCalc {

    @Override
    public float idealWeight(int height, char gender) throws Exception {
         // Validar que la altura esté dentro del rango permitido
    if (height < 140 || height > 300) {
        throw new IllegalArgumentException("Height must be between 140 and 300");
    }

    float idealWeight;
    if (gender == 'm') {
        idealWeight = height - 100 - (height - 150) / 4f;
    } else if (gender == 'w') {
        idealWeight = height - 100 - (height - 150) / 2.5f;
    } else {
        throw new IllegalArgumentException("Invalid gender. Must be 'm' or 'w'.");
    }
    return idealWeight;
    }

    @Override
    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    
}
