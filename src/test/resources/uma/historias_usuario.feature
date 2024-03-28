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
  Scenario: Calcular peso ideal para un hombre
    Given una altura de 180 cm
    And el género es masculino
    When se calcula el peso ideal
    Then el peso ideal debería ser 72.5

  @tag2
  Scenario: Calcular peso ideal para una mujer
    Given una altura de 160 cm
    And el género es femenino
    When se calcula el peso ideal
    Then el peso ideal debería ser 56.0

  @tag3
  Scenario Outline: Manejar errores de entrada inválida
    Given una altura de <altura> cm
    And el género es <genero>
    When se intenta calcular el peso ideal
    Then debería obtener un error que diga "<mensaje_error>"

    Examples:
      | altura | genero | mensaje_error                             |
      | 120    | f      | "Altura debe estar entre 140 y 300"       |
      | 320    | m      | "Altura debe estar entre 140 y 300"       |
      | 180    | x      | "Género inválido. Debe ser 'm' o 'w'."    |
