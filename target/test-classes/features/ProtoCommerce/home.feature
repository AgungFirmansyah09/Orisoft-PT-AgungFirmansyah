@ProtoCommerce
  Feature: Home
    As a user
    I want to input my data
    and save data in ProtoCommerce

  @Functional-Case
  Scenario: User can input data in ProtoCommerce
    Given User Open Web ProtoCommerce
    When User Input Name Field Correctly
    And User Input Email Field Correctly
    And User Input Password Field Correctly
    And User Click CheckBox
    And User Choose Gender
    And User Choose Status Employee
    And User Choose Date of Birth
    And User Click Button Save
    Then User View alert successfully save data

#  @AssertionDataBinding
#  Scenario: User input data in Two-Way data Binding
#    Given User Open Web ProtoCommerce
#    When User input in Field Two-Way data Binding
#    Then User Can See Field name has input



