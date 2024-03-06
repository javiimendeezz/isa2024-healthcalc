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
        if (weight <= 0 || age <= 0) {
            throw new IllegalArgumentException("Weight and age must be positive numbers");
        }

        if (height < 140 || height > 300) {
            throw new IllegalArgumentException("Height must be between 140 and 300");
        }

        float bmr;
        if (gender == 'm') {
            bmr = 10 * weight + 6.25f * height - 5 * age + 5;
        } else if (gender == 'w') {
            bmr = 10 * weight + 6.25f * height - 5 * age - 161;
        } else {
            throw new IllegalArgumentException("Invalid gender. Must be 'm' or 'w'.");
        }
        return bmr;
    }


    
}
