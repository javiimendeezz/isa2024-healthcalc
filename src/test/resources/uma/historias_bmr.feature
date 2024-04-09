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
Feature: Calcular BMR

As a usuario I want to  calcular mi BMR So that mantenerme saludable
@tag1
Scenario: Calcular BMR con entrada valida
  Given tengo una calculadora de salud
  When calculo el BMR cuya entrada es <peso>, <altura>, <edad>, <genero>
  Then el BMR ser <resultado>

  Examples:
    | peso | altura | edad | genero | resultado |
    | 70.0   | 180    | 25   | "m"    | 1705.0    |
    | 80.0   | 170    | 30   | "m"    | 1717.5    |
    | 90.0   | 200    | 35   | "m"    | 1980.0    |
    | 65.0   | 140    | 40   | "m"    | 1330.0    |
    | 75.0   | 300    | 45   | "m"    | 2405.0    |
    | 55.0   | 180    | 25   | "w"    | 1389.0    |
    | 65.0   | 170    | 30   | "w"    | 1401.5    |
    | 70.0   | 200    | 35   | "w"    | 1614.0    |
    | 50.0   | 140    | 40   | "w"    | 1014.0    |
    | 60.0   | 300    | 45   | "w"    | 2089.0    |

 @tag2
Scenario: Calcular BMR con argumentos no validos
  Given tengo una calculadora de salud
  When calculo el BMR cuya entrada es <peso>, <altura>, <edad>, <genero>
  Then el sistema lanza una excepcion

  Examples:
    | peso | altura | edad | genero |
    | -70.0   | 180    | 25   | "m"    |
    | -80.0   | 170    | 30   | "m"    |
    | -90.0   | 200    | 35   | "m"    |
    | -65.0   | 140    | 40   | "m"    |
    | -75.0   | 300    | 45   | "m"    |
    | -55.0   | 180    | 25   | "w"    |
    | -65.0   | 170    | 30   | "w"    |
    | -70.0   | 200    | 35   | "w"    |
    | -50.0   | 140    | 40   | "w"    |
    | -60.0   | 300    | 45   | "w"    |
    | 70.0   | 80    | 25   | "m"    |
    | 80.0   | 70    | 30   | "m"    |
    | 90.0   | 2000    | 35   | "m"    |
    | 65.0   | 1400   | 40   | "m"    |
    | 75.0   | 3000    | 45   | "m"    |
    | 55.0   | 139    | 25   | "w"    |
    | 65.0   | 17    | 30   | "w"    |
    | 70.0   | 2    | 35   | "w"    |
    | 50.0   | 1    | 40   | "w"    |
    | 60.0   | 301    | 45   | "w"    |
    | 70.0   | 180    | -25   | "m"    |
    | 80.0   | 170    | -30   | "m"    |
    | 90.0   | 200    | -35   | "m"    |
    | 65.0   | 140    | -40   | "m"    |
    | 75.0   | 300    | -45   | "m"    |
    | 55.0   | 180    | -25   | "w"    |
    | 65.0   | 170    | -30   | "w"    |
    | 70.0   | 200    | -35   | "w"    |
    | 50.0   | 140    | -40   | "w"    |
    | 60.0   | 300    | -45   | "w"    |
    | 70.0   | 180    | 25   | "v"    |
    | 80.0   | 170    | 30   | "ñ"    |
    | 90.0   | 200    | 35   | "h"    |
    | 65.0   | 140    | 40   | "y"    |
    | 75.0   | 300    | 45   | "o"    |
    | 55.0   | 180    | 25   | "p"    |
    | 65.0   | 170    | 30   | "r"    |
    | 70.0   | 200    | 35   | "t"    |
    | 50.0   | 140    | 40   | "e"    |
    | 60.0   | 300    | 45   | "q"    |

  