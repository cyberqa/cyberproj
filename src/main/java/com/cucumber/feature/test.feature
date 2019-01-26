
@tag
Feature: Job serve
  
  @tag1
  Scenario Outline: Quick job search
    Given go to website on chrome
    And Enter keyword as "<Keyword>"
    And Enter Location as "<Location>"
    When I click on login button
    Then Should display jobs

Examples: 
|Keyword|Location|Jobage|JobType|
|Selenium|Chennai|Within 2 days|Contract|
|QTP|Hyderabad|Within 4 days|Permanent|
 