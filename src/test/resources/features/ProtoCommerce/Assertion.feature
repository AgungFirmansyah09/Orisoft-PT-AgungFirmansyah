@Assertion
Feature: Assertion Test
  As a user
  I want to validate web page
  and all attribute assertion

  @Assertion-WebPage
  Scenario: User Validation Web page
    Given User Open Web page ProtoCommerce
    When User Validation title
    Then user can view title

  @Assertion-DisableButton
  Scenario: User Validation Disable Button
    Given User Open Web page ProtoCommerce
    When User view Disable button
    Then user can't click disable button

