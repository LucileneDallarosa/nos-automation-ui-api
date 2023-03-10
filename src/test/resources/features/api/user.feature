Feature: User information

  Background:

  Scenario Outline: Create users
    Given Want call user function with the path: <path>
    When Make the request to create with Body - name: <name>, email: <email>, gender: <gender>, status: <status>
    Then The HttpStatus is <statusCode>
    And Validate the response - name: <name>, email: <email>, gender: <gender>, status: <status>
    Examples:
      | path             | name          | email                   | gender | status | statusCode |
      | /public/v2/users | Nala Cristina | nalacristina@gmail.com  | female | active | 201        |

  Scenario: Get user by Id
    Given Want call user function with the path: /public/v2/users/{id}
    When Make the request to get user with userId
    Then The HttpStatus is 200
    And Validate the response - name: Nala Cristina, email: nalacristina@gmail.com, gender: female, status: active

  Scenario: Patch user by Id
    Given Want call user function with the path: /public/v2/users/{id}
    When Make the request to patch user with userId to update name: Pantera Negra and gender: male
    Then The HttpStatus is 200
    And Validate the response - name: Pantera Negra, email: nalacristina@gmail.com, gender: male, status: active

  Scenario: Delete user by Id
    Given Want call user function with the path: /public/v2/users/{id}
    When Make the request to delete user with userId
    Then The HttpStatus is 204
