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

