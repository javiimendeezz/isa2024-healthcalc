# Health Calculator -  "Ingeniería de Software Avanzada"
## Práctica 1
Este proyecto es fruto  de la primera práctica en el marco de la asignatura "Ingeniería del Software Avanzada", asignatura de 3º de Ingeniería Bioinformática en la Universidad de Málaga. Su propósito primordial radica en la implementación de los métodos `idealWeight` y `basalMetabolicRate` dentro de la clase `HealthCalcImp`, siguiendo rigurosamente la metodología de Desarrollo Guiado por Pruebas (TDD). Para ello, se ha seguido un enfoque meticuloso que comprende los siguientes pasos de manera ordenada:

1.  Definición de los casos de prueba.
2.  Elaboración y ejecución de pruebas  con JUnit5/Maven que validan el funcionamiento esperado.
3.  Implementación concreta de los métodos `idealWeight` y `basalMetabolicRate`.

Adicionalmente, se ha optado por la utilización de Git y Github como herramientas fundamentales para gestionar el control de versiones del proyecto. Este enfoque ha sido complementado con prácticas de desarrollo colaborativo, realizando _commits_ detallados y significativos, acompañados de comentarios explicativos. Se han creado y gestionado ramas conforme ha sido necesario.

### Tests

#### Tests método `HealthCalcImpl.idealWeight`
##### Caso de prueba 1: Calcular peso ideal para un hombre

**Descripción:** Se prueba que el método `idealWeight` calcule correctamente el peso ideal para un hombre con una altura válida.

**Entrada:**
- Altura: 175 cm
- Género: 'm'
**Resultado esperado:** Se espera que el peso ideal sea aproximadamente 68.75 kg.

##### Caso de prueba 2: Calcular peso ideal para una mujer

**Descripción:** Se prueba que el método `idealWeight` calcule correctamente el peso ideal para una mujer con una altura válida.

**Entrada:**
- Altura: 165 cm
- Género: 'w'

**Resultado esperado:** Se espera que el peso ideal sea aproximadamente 59.0 kg.

##### Caso de prueba 3: Altura mínima

**Descripción:** Se prueba que el método `idealWeight` maneje correctamente la altura mínima permitida.

**Entrada:**
- Altura: 140 cm
- Género: 'm'

**Resultado esperado:** Se espera que el peso ideal sea aproximadamente 42.5 kg.


##### Caso de prueba 4: Altura máxima

**Descripción:** Se prueba que el método `idealWeight` maneje correctamente la altura máxima permitida.

**Entrada:**
- Altura: 300 cm
- Género: 'm'

**Resultado esperado:** Se espera que el peso ideal sea aproximadamente 162.5 kg.

##### Caso de prueba 5: Altura no válida (supera la altura máxima)

**Descripción:** Se prueba que el método `idealWeight` maneje correctamente una altura no válida.

**Entrada:**
- Altura: 301 cm
- Género: 'm'

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.

##### Caso de prueba 6: Altura no válida (inferior a la altura mínima)

**Descripción:** Se prueba que el método `idealWeight` maneje correctamente una altura no válida.

**Entrada:**
- Altura: 139 cm
- Género: 'm'

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.

##### Caso de prueba 7: Género no válido

**Descripción:** Se prueba que el método `idealWeight` maneje correctamente un género no válido.

**Entrada:**
- Altura: 160 cm
- Género: 'x'

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.

#### Tests método `HealthCalcImpl.basalMetabolicRate`
A continuación se describen una serie de casos de prueba para el método `basalMetabolicRate` de la clase que implementa la interfaz `HealthCalc`.

##### Caso de prueba 1: Calcular BMR para un hombre

**Descripción:** Se prueba que el método `basalMetabolicRate` calcule correctamente la tasa metabólica basal (BMR) para un hombre con valores válidos de peso, altura y edad.

**Entrada:**
- Peso: 70 kg
- Altura: 170 cm
- Género: 'm'
- Edad: 30 años

**Resultado esperado:** Se espera que la BMR sea aproximadamente 1617.5.

##### Caso de prueba 2: Calcular BMR para una mujer

**Descripción:** Se prueba que el método `basalMetabolicRate` calcule correctamente la tasa metabólica basal (BMR) para una mujer con valores válidos de peso, altura y edad.

**Entrada:**
- Peso: 60 kg
- Altura: 160 cm
- Género: 'w'
- Edad: 35 años

**Resultado esperado:** Se espera que la BMR sea aproximadamente 1264.

##### Caso de prueba 3: Peso negativo

**Descripción:** Se prueba que el método `basalMetabolicRate` maneje correctamente el peso negativo.

**Entrada:**
- Peso: -70 kg
- Altura: 180 cm
- Género: 'm'
- Edad: 40 años

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.

##### Caso de prueba 4: Altura fuera de rango superior

**Descripción:** Se prueba que el método `basalMetabolicRate` maneje correctamente la altura fuera del límite superior.

**Entrada:**
- Peso: 65 kg
- Altura: 310 cm
- Género: 'w'
- Edad: 45 años

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.

##### Caso de prueba 5: Altura fuera de rango inferior

**Descripción:** Se prueba que el método `basalMetabolicRate` maneje correctamente la altura bajo el límite inferior.

**Entrada:**
- Peso: 65 kg
- Altura: 0 cm
- Género: 'w'
- Edad: 45 años

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.

##### Caso de prueba 6: Altura limite de rango inferior

**Descripción:** Se prueba que el método `basalMetabolicRate` maneje correctamente la altura en el límite inferior.

**Entrada:**
- Peso: 65 kg
- Altura: 140 cm
- Género: 'w'
- Edad: 45 años

**Resultado esperado:** Se espera que la BMR sea aproximadamente 1239.

##### Caso de prueba 7: Altura limite de rango superior

**Descripción:** Se prueba que el método `basalMetabolicRate` maneje correctamente la altura en el límite inferior.

**Entrada:**
- Peso: 65 kg
- Altura: 300 cm
- Género: 'w'
- Edad: 45 años

**Resultado esperado:** Se espera que la BMR sea aproximadamente 2239.

##### Caso de prueba 8: Edad negativa

**Descripción:** Se prueba que el método `basalMetabolicRate` maneje correctamente la edad negativa.

**Entrada:**
- Peso: 75 kg
- Altura: 180 cm
- Género: 'm'
- Edad: -50 años

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.

##### Caso de prueba 9: Género no válido

**Descripción:** Se prueba que el método `basalMetabolicRate` maneje correctamente un género no válido.

**Entrada:**
- Peso: 80 kg
- Altura: 170 cm
- Género: 'x'
- Edad: 55 años

**Resultado esperado:** Se espera que se lance una excepción `IllegalArgumentException`.



### Resultado de los test en Maven


![](https://github.com/javiimendeezz/isa2024-healthcalc/blob/main/mvn_test.PNG)

### Resultado de los test en JUnit5


![](https://github.com/javiimendeezz/isa2024-healthcalc/blob/main/test_run.PNG)


Todos los test han sido superados con éxito, por lo que lo que esperamos del programa parece estar acorde a la implementación realizada, que pese a ello está en continua revisión para ser sometida a futuras actualizaciones.

### Uso de Git & Github durante el proyecto
![](https://github.com/javiimendeezz/isa2024-healthcalc/blob/main/resumen_commits.PNG)


**Desarrollo**
Durante esta práctica he aprendido el funcionamiento de la nueva metodología de desarrollo por test vista en clase, y me ha resultado muy útil ya que en otras ocasiones hemos desarrollado los test en base a un código previamente hecho para darnos cuenta finalmente de que la implementación no era la más adecuada y tener que rehacerla, con la correspondiente inversión de tiempo y esfuerzo. 

En este caso los test han servido de guía para una implementación completa y mínima en posibles vacíos (como los posibles parámetros de entrada no contemplados para las funciones).

También he afianzado los conceptos de Git/GitHub aprendidos en las primeras prácticas de la asignatura gracias a seguir empleando esta útil herramienta, que me ha ayudado a controlar los pequeños cambios en las versiones del código y acceder a ellas de manera remota desde distintos dispositivos y lugares.

## Práctica 2
### Diagrama de Casos de Uso
![](https://github.com/javiimendeezz/isa2024-healthcalc/blob/practica2/doc/casos_uso.PNG)

### Diagrama de Casos de Uso Extendido
![](https://github.com/javiimendeezz/isa2024-healthcalc/blob/practica2/doc/casos_uso_ext.PNG)

### Especificación del Caso de Uso: Calcular Tasa Metabólica Basal.
**Nombre:** Cálculo Tasa Metabólica Basal
**Stakeholders:** 
    - *Usuario:* Realizar el cálculo de su tasa metabólica basal.
    - *Administrador:* Garantizar el acceso a la calculadora y que esta trabaje de la manera esperada.

**Actor principal:** Usuario
**Alcance (scope):** Aplicación isa2024-healthCalc
**Precondiciones:**
    - El usuario es capaz de acceder exitosamente al programa isa2024-healthCalc.
**Garantías:**
    - En caso de exito: El programa devuelve una estimación  correcta de la Tasa Metabólica Basal en base a los parámetros definidos por el usuario.
    - En caso de error: Se muestra un mensaje de error por pantalla.
**Trigger:** El usuario ejecuta la funcionalidad Calcular Tasa Metabólica Basal desde el programa principal.
**Escenario principal:**
    1. El usuario ejecuta la funcionalidad "Calcular Tasa Metabólica Basal" en el programa isa2024-healthCalc.
    2. El sistema solicita al usuario los parámetros necesarios para el funcionamiento de la demanda. 
    3. El usuario introduce los valores de los parámetros de forma correcta. 
    4. El sistema aplica el método con los parámetros introducidos. 
    5. El sistema muestra el resultado correcto.
**Extensiones:**
    3a. El usuario NO introduce los valores de los parámetros de forma correcta.
        3a.1. El sistema muestra un mensaje de error, indicando que ha proporcionado parámetros no válidos.
        3a.2. Se vuelve a 2.