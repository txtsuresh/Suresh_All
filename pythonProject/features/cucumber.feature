# Created by Suresh Kumar at 2020-10-27
Feature: Verify Addbook & Deletebook features
  # Enter feature description here

  Scenario: Verify Addbook feature
    Given API Details for addbook
    When Send the post request
    Then Book is added sucesfully
