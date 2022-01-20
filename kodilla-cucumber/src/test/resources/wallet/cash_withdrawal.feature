Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <deposit> in my wallet
    When I request <sum>
    Then <amount> should be dispensed
    And the balance of my wallet should be <result>
    Examples:
      | deposit | sum | amount | result |
      | 200     | 300 | 0      | 200    |
      | 200     | 100 | 100    | 100    |
      | 200     | 0   | 0      | 200    |
      | 200     | 30  | 30     | 170    |