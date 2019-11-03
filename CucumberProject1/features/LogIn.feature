@Facebook
Feature: FacebookFeature
  I want to test Facebook application

  @LoginTag
  Scenario: Login Scenario
    Given I am a user of facebook application
    When I enter valid username
    And I enter valid pasword
    And I click on ogin button
    Then User should be able to Login successfully

  @SignUpTag
  Scenario: SignUp Scenario
    Given I am a user of Facebook application
    When I enter valid username
    And I enter valid pasword
    And I click on ogin button
    And I enter First name
