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

## Práctica 3
### Historia de usuario 1
Feature: Calcular Peso Ideal
**As a** usuario  
**I want to** calcular mi peso ideal  
**So that** mantenerme saludable  

#### Criterios de aceptación:

##### Scenario: Calcular peso ideal hombre con entrada valida
   Given tengo una calculadora de salud  
   When calculo el peso ideal con entrada valida de un hombre que mide <altura>  
   Then el peso ideal debería ser <resultado>  

   Examples:  
   | altura |resultado |  
   | ------ | -------- |  
   | 180    |72.5      |  
   | 170    |65.0      |  
   | 200    |87.5      |  
   | 140    |42.5      |  
   | 300    |162.5     |

##### Scenario: Calcular peso ideal mujer con entrada valida
   Given tengo una calculadora de salud  
   When calculo el peso ideal con entrada valida de una mujer que mide <altura>  
   Then el peso ideal debería ser <resultado>  

   Examples:  
   | altura | resultado |  
   | ------ | --------- |  
   | 160    |56.0       |  
   | 170    |62.0       |  
   | 190    |74.0       |  
   | 140    |44.0       |  
   | 300    |140.0      |

##### Scenario Outline: Manejar errores de altura inválida
   Given tengo una calculadora de salud  
   When calculo el peso ideal con entrada no valida de una persona que mide <altura>  
   Then el sistema lanza una excepcion  

   Examples:  
   | altura |  
   | ------ |  
   | 120    |  
   | 320    |  
   | 90     |  
   | 330    |  

##### Scenario Outline: Manejar errores de genero inválido
   Given tengo una calculadora de salud  
   When calculo el peso ideal con entrada no valida de una persona de genero <genero>  
   Then el sistema lanza una excepcion  

   Examples:  
   | genero |  
   | ------ |  
   | "x"    |  
   | "a"    |  
   | "t"    | 

   ### Historia de usuario 2

   **Feature:** Calcular BMR  

**As a** usuario  
**I want to** calcular mi BMR  
**So that** mantenerme saludable  

#### Criterios de aceptación:

##### Scenario: Calcular BMR con entrada valida
   Given tengo una calculadora de salud  
   When calculo el BMR cuya entrada es <peso>, <altura>, <edad>, <genero>  
   Then el BMR ser <resultado>  

   Examples:  
   | peso | altura | edad | genero | resultado |  
   | -----| ------ | ---- | ------ | --------- |  
   | 70.0 | 180    | 25   | "m"    | 1705.0    |  
   | 80.0 | 170    | 30   | "m"    | 1717.5    |  
   | 90.0 | 200    | 35   | "m"    | 1980.0    |  
   | 65.0 | 140    | 40   | "m"    | 1330.0    |  
   | 75.0 | 300    | 45   | "m"    | 2405.0    |  
   | 55.0 | 180    | 25   | "w"    | 1389.0    |  
   | 65.0 | 170    | 30   | "w"    | 1401.5    |  
   | 70.0 | 200    | 35   | "w"    | 1614.0    |  
   | 50.0 | 140    | 40   | "w"    | 1014.0    |  
   | 60.0 | 300    | 45   | "w"    | 2089.0    |  

##### Scenario: Calcular BMR con argumentos no validos
   Given tengo una calculadora de salud  
   When calculo el BMR cuya entrada es <peso>, <altura>, <edad>, <genero>  
   Then el sistema lanza una excepcion  

   Examples:  
   | peso  | altura | edad | genero |  
   | ----- | ------ | ---- | ------ |  
   | -70.0 | 180    | 25   | "m"    |  
   | -80.0 | 170    | 30   | "m"    |  
   | -90.0 | 200    | 35   | "m"    |  
   | -65.0 | 140    | 40   | "m"    |  
   | -75.0 | 300    | 45   | "m"    |  
   | -55.0 | 180    | 25   | "w"    |  
   | -65.0 | 170    | 30   | "w"    |  
   | -70.0 | 200    | 35   | "w"    |  
   | -50.0 | 140    | 40   | "w"    |  
   | -60.0 | 300    | 45   | "w"    |  
   | 70.0  | 80     | 25   | "m"    |  
   | 80.0  | 70     | 30   | "m"    |  
   | 90.0  | 2000   | 35   | "m"    |  
   | 65.0  | 1400   | 40   | "m"    |  
   | 75.0  | 3000   | 45   | "m"    |  
   | 55.0  | 139    | 25   | "w"    |  
   | 65.0  | 17     | 30   | "w"    |  
   | 70.0  | 2      | 35   | "w"    |  
   | 50.0  | 1      | 40   | "w"    |  
   | 60.0  | 301    | 45   | "w"    |  
   | 70.0  | 180    | -25  | "m"    |  
   | 80.0  | 170    | -30  | "m"    |  
   | 90.0  | 200    | -35  | "m"    |  
   | 65.0  | 140    | -40  | "m"    |  
   | 75.0  | 300    | -45  | "m"    |  
   | 55.0  | 180    | -25  | "w"    |  
   | 65.0  | 170    | -30  | "w"    |  
   | 70.0  | 200    | -35  | "w"    |  
   | 50.0  | 140    | -40  | "w"    |  
   | 60.0  | 300    | -45  | "w"    |  
   | 70.0  | 180    | 25   | "v"    |  
   | 80.0  | 170    | 30   | "ñ"    |  
   | 90.0  | 200    | 35   | "h"    |  
   | 65.0  | 140    | 40   | "y"    |  
   | 75.0  | 300    | 45   | "o"    |  
   | 55.0  | 180    | 25   | "p"    |  
   | 65.0  | 170    | 30   | "r"    |  
   | 70.0  | 200    | 35   | "t"    |  
   | 50.0  | 140    | 40   | "e"    |  
   | 60.0  | 300    | 45   | "q"    |  
