@stories

  Feature: Test Utest
    As a user, I want to register on the utes page
  @scenario1

  Scenario: New user registration
    Given that Juan wants to register as a new user on the utes page
    When He fills the registration form for new users
        | name | lastName | emailAddress | month | day | year | idioma | city | postalCode | country | computer | version | language | mobileDevice | model | os | password | confirPassword |
        | Juan | Perez    | juanpete22280@gmail.com | April | 8 | 2001 | Spanish |Barranquilla | 080011 | Colombia | Windows | 10 | Spanish | Apple  | iPhone 11 | iOS 14 | Molina0893 | Molina0893|
    Then he completes the registration of the new user
        | namePage |
        | The last step |