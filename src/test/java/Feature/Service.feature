
Feature: Service Functional Test
  AS a User ,I want  to open Transfotech Academy   So that  I can get all information About Transfotech Service

  #Acceptance Criteria #1
  Scenario: Service  Feature Test by mouse Action
    When User Navigate Mouse curser on  Dynamic Drop down   Service menu
    #Then User Should see two drop down Option link IT training and Job placement
    Then User should move mouse Up and down in two optoin

  #Acceptance Criteria #2
  Scenario: IT Training  Feature Test by  mouse click
    When User click  drop down Option link IT Training
    Then User should see “IT Traning “  Text
    And User should see Title Page “IT Certification and Training Programs in NYC|Transfotech Academy”

  #Acceptance Criteria #3
  Scenario: Job placement Feature Test by  mouse click
    When User click  drop down Option link Job Placement
    Then User should see “Job Placement Is Our Strength “  Text
    And User should see title Page “ Job Placement |Transfotech Academy”
