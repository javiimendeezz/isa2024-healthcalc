# isa2024-healtcalc
Health calculator

A continuación describiré los casos de prueba para la clase `HealthCalcImpl`, que implementa la interfaz `HealthCalc`.

## Casos de prueba para el método idealWeight

### Caso de prueba 1: Calcular peso ideal para un hombre

**Descripción:** Se prueba que el método `idealWeight` calcule correctamente el peso ideal para un hombre con una altura válida.

**Entrada:**
- Altura: 175 cm
- Género: 'm'
**Resultado esperado:** Se espera que el peso ideal sea aproximadamente 68.75 kg.

### Caso de prueba 2: Calcular peso ideal para una mujer

**Descripción:** Se prueba que el método `idealWeight` calcule correctamente el peso ideal para una mujer con una altura válida.

**Entrada:**
- Altura: 165 cm
- Género: 'w'

**Resultado esperado:** Se espera que el peso ideal sea aproximadamente 59.0 kg.

### Caso de prueba 3: Altura mínima

**Descripción:** Se prueba que el método `idealWeight` maneje correctamente la altura mínima permitida.

**Entrada:**
- Altura: 140 cm
- Género: 'm'

**Resultado esperado:** Se espera que el peso ideal sea aproximadamente 42.5 kg.


### Caso de prueba 4: Altura máxima

**Descripción:** Se prueba que el método `idealWeight` maneje correctamente la altura máxima permitida.

**Entrada:**
- Altura: 300 cm
- Género: 'm'

**Resultado esperado:** Se espera que el peso ideal sea aproximadamente 162.5 kg.

### Caso de prueba 5: Altura no válida (supera la altura máxima)

**Descripción:** Se prueba que el método `idealWeight` maneje correctamente una altura no válida.

**Entrada:**
- Altura: 301 cm
- Género: 'm'

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.

### Caso de prueba 6: Altura no válida (inferior a la altura mínima)

**Descripción:** Se prueba que el método `idealWeight` maneje correctamente una altura no válida.

**Entrada:**
- Altura: 139 cm
- Género: 'm'

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.

### Caso de prueba 7: Género no válido

**Descripción:** Se prueba que el método `idealWeight` maneje correctamente un género no válido.

**Entrada:**
- Altura: 160 cm
- Género: 'x'

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.

## Casos de prueba para el método basalMetabolicRate

A continuación se describen una serie de casos de prueba para el método `basalMetabolicRate` de la clase que implementa la interfaz `HealthCalc`.

### Caso de prueba 1: Calcular BMR para un hombre

**Descripción:** Se prueba que el método `basalMetabolicRate` calcule correctamente la tasa metabólica basal (BMR) para un hombre con valores válidos de peso, altura y edad.

**Entrada:**
- Peso: 70 kg
- Altura: 170 cm
- Género: 'm'
- Edad: 30 años

**Resultado esperado:** Se espera que la BMR sea aproximadamente 1617.5.

### Caso de prueba 2: Calcular BMR para una mujer

**Descripción:** Se prueba que el método `basalMetabolicRate` calcule correctamente la tasa metabólica basal (BMR) para una mujer con valores válidos de peso, altura y edad.

**Entrada:**
- Peso: 60 kg
- Altura: 160 cm
- Género: 'w'
- Edad: 35 años

**Resultado esperado:** Se espera que la BMR sea aproximadamente 1289.

### Caso de prueba 3: Peso negativo

**Descripción:** Se prueba que el método `basalMetabolicRate` maneje correctamente el peso negativo.

**Entrada:**
- Peso: -70 kg
- Altura: 180 cm
- Género: 'm'
- Edad: 40 años

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.

### Caso de prueba 4: Altura negativa

**Descripción:** Se prueba que el método `basalMetabolicRate` maneje correctamente la altura negativa.

**Entrada:**
- Peso: 65 kg
- Altura: -175 cm
- Género: 'w'
- Edad: 45 años

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.

### Caso de prueba 5: Edad negativa

**Descripción:** Se prueba que el método `basalMetabolicRate` maneje correctamente la edad negativa.

**Entrada:**
- Peso: 75 kg
- Altura: 180 cm
- Género: 'm'
- Edad: -50 años

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.

### Caso de prueba 6: Género no válido

**Descripción:** Se prueba que el método `basalMetabolicRate` maneje correctamente un género no válido.

**Entrada:**
- Peso: 80 kg
- Altura: 170 cm
- Género: 'x'
- Edad: 55 años

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.