Feature: Reves Signup Testing

  Scenario: Test the Signup process of Reves for a new user
    Given Open the Reves Signup page with url "https://app.reves.ai/auth/signup"
    When User enters required entries that includes First Name, Last Name, Email address, Phone Number, password, Confirm Password
    And click on the checkbox having text I agree to all the Terms & Condition
    And User clicks on the Create Account button
    Then User should be able to register
