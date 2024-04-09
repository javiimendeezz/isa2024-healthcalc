#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@tag
Feature: Calcular Peso Ideal

As a usuario I want to  calcular mi peso ideal So that mantenerme saludable


  @tag1
  Scenario: Calcular peso ideal hombre con entrada valida
    Given tengo una calculadora de salud
    When calculo el peso ideal con entrada valida de un hombre que mide <altura>
    Then el peso ideal debería ser <resultado>

      Examples:
    | altura |resultado |
    | 180    |72.5      |
    | 170    |65.0      |
    | 200    |87.5      |
    | 140    |42.5      |
    | 300    |162.5     |

     @tag2
  Scenario: Calcular peso ideal mujer con entrada valida
    Given tengo una calculadora de salud
    When calculo el peso ideal con entrada valida de una mujer que mide <altura>
    Then el peso ideal debería ser <resultado>

      Examples:
    | altura | resultado |
    | 160    |56.0      |
    | 170    |62.0      |
    | 190    |74.0      |
    | 140    |44.0      |
    | 300    |140.0     |


    

  @tag3
  Scenario Outline: Manejar errores de altura inválida
    Given tengo una calculadora de salud
    When calculo el peso ideal con entrada no valida de una persona que mide <altura>
    Then el sistema lanza una excepcion

    Examples:
      | altura |
      | 120    |
      | 320    |
      | 90     |
      | 330    |


 @tag4
  Scenario Outline: Manejar errores de genero inválido
    Given tengo una calculadora de salud
    When calculo el peso ideal con entrada no valida de una persona de genero <genero>
    Then el sistema lanza una excepcion

    Examples:
      | genero |
      | "x"    |
      | "a"    |
      | "t"    |