Feature: gra

  Scenario Outline: Przez ile dzieli się liczba
    Given Czy liczba dzieli się przez  <liczba>
    When Pytam czy dana liczba dzieli się
    Then Powinienen powiedzieć <odpowiedz>
    Examples:
      | liczba | odpowiedz|
    | 3 | "Fizz"   |
    | 5 | "Buzz" |
    | 15 | "FizzBuzz" |