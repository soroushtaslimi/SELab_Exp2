@tag
Feature: Calculator

  Scenario: operation on value
    Given One value and one operator, 9 and sqr
    When I operate the operator on operand
    Then I expect the result 3

  Scenario: operation on value
    Given One value and one operator, 9 and rvs
    When I operate the operator on operand
    Then I expect the result 0.1111

  Scenario: operation on value
    Given One value and one operator, -9 and rvs
    When I operate the operator on operand
    Then I expect the result -0.1111

  Scenario Outline: operation on value
    Given One value and one operator, <Input> and <opt>
    When I operate the operator on operand
    Then I expect the result <result>

    Examples:
      | Input | opt   | result  |
      | 4     | rvs   | 0.25    |
      | 4     | sqr   | 2       |
      | 5     | sqr   | 2.2361  |
      | 5     | rvs   | 0.2     |
      | -2    | rvs   | -0.5    |
      | -8    | rvs   | -0.125  |