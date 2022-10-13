Feature: Simple calculator
  Just to test if it works

  Scenario: Addition of two numbers
    Given I have a calculator
    When I call addNumbers with 2 and 4
    Then the result should be 6

  Scenario: Subtraction of two numbers
    Given I have a calculator
    When I call subtractNumbers with 5 and 1
    Then the result should be 4

  Scenario: Divide by zero
    Given I have a calculator
    When I call divideNumbers with 5 and 0
    Then arithmeticexception should be thrown