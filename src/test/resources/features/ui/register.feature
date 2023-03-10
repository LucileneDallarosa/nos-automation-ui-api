Feature: Register

  Background:
    Given Access NOS
      And Click to Register

  Scenario: Register successfully
    When Set Full name: Automation Test Lucilene Dallarosa
      And Set Phone number: 937603168
      And Set E-mail: lucileneDallarosaTeste@gmail.com
      And Set Password to register: TesteLucilene&123
      And Mark the checkbox 'Terms And Conditions'
      And Click Create Account button
    Then Validate the Creation

  Scenario: Register existing Account
    When Set Full name: Lucilene Dallarosa
      And Set Phone number: 937603161
      And Set E-mail: lucilenedallarosa@gmail.com
      And Set Password to register: TesteLucilene&123
      And Mark the checkbox 'Terms And Conditions'
      And Click Create Account button
    Then The field Email will be with the Existing Account message