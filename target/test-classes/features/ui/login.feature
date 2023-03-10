Feature: Register

  Background:
    Given Access NOS WebPage

  Scenario: Access with the e-mail successfully
    When Input User Name: lucilene.h.dallarosa@gmail.com
      And Click on Enter button
      And Set Password: TesteLucilene@123
      And Click on Enter button
    Then Will open the NOS home page

  Scenario: Access with the phone number successfully
    When Input User Name: 937603161
      And Click on Enter button
      And Set Password: TesteLucilene@123
      And Click to unmark CheckBox Keep Session
      And Click on Enter button
    Then Will open the NOS home page

  Scenario: Access with the user name successfully
    When Input User Name: lucilenedallarosa
      And Click on Enter button
      And Set Password: TesteLucilene@123
      And Click to unmark CheckBox Keep Session
      And Click on Enter button
    Then Will open the NOS home page

  Scenario: Insert invalid email
    When Input User Name: lucilen.h.dallarosa@gmail.com
      And Click on Enter button
    Then Will show the 'No User Found' error message

  Scenario: Insert incomplete email
    When Input User Name: lucilene.h.dallarosa@
      And Click on Enter button
    Then Will show the 'No User Found' error message

  Scenario: Insert incomplete email
    When Input User Name: lucilene.h.dallarosa@gmail
      And Click on Enter button
    Then Will show the 'No User Found' error message

  Scenario: Insert incomplete email
    When Input User Name: lucilene.h.dallarosa.com
      And Click on Enter button
    Then Will show the 'No User Found' error message

  Scenario: Insert incomplete email
    When Input User Name: lucilene.h.dallarosa@gmail.com.br
      And Click on Enter button
    Then Will show the 'No User Found' error message

  Scenario: Insert invalid phone number
    When Input User Name: 937683165
      And Click on Enter button
    Then Will show the 'No User Found' error message

  Scenario: Insert incomplete phone number
    When Input User Name: 937603
      And Click on Enter button
    Then Will redirect to number confirmation page
      And Click on Enter button
      And Will show the 'Invalid phone number' error message

  Scenario: Insert wrong phone number
    When Input User Name: 9376038752368421
      And Click on Enter button
    Then Will redirect to number confirmation page
      And Click on Enter button
      And Will show the 'Invalid phone number' error message

  Scenario: Insert invalid user name
    When Input User Name: lucilenedallarosa8
      And Click on Enter button
    Then Will show the 'No User Found' error message

  Scenario: Insert wrong password
    When Input User Name: lucilene.h.dallarosa@gmail.com
      And Click on Enter button
      And Set Password: testeLucilene@123
      And Click on Enter button
    Then Will show the 'Incorrect password' error message

  Scenario: Insert wrong password
    When Input User Name: 937603161
      And Click on Enter button
      And Set Password: teste
      And Click on Enter button
    Then Will show the 'Incorrect password' error message

  Scenario: Insert wrong password
    When Input User Name: lucilenedallarosa
      And Click on Enter button
      And Set Password: TesteLucilene@1234
      And Click on Enter button
    Then Will redirect to Recover password page
      And Click to return to session