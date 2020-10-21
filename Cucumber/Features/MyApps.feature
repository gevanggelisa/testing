#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Cucumber Test for loker.id
 
  #@tag1
  #Scenario Outline: Fungsi Login
  #	Given Open chrome and start application1
    #Then I click Masuk1
    #When I enter email and password1
    #Then I click Login1
    
  #@tag2
  #Scenario Outline: Fungsi Edit Profile
  #	Given Open chrome and start application2
    #Then I click Masuk2
    #When I enter valid username and password2
    #Then I click Log In2
    #Then I click Edit Profile2
    #When I enter input form2
    #Then I click button2
  #
  
  #@tag3
  #Scenario Outline: Fungsi Ganti Password
  #	Given Open chrome and start application3
    #Then I click Masuk3
    #When I enter valid username and password3
    #Then I click Log In3
    #Then I click Edit Profile3
    #When I enter input form3
    #Then I click button3
  #
  
     @tag4
  Scenario Outline: Fungsi Searching
  	Given Open chrome and start application4
    Then I click Masuk4
    When I enter valid username and password4
    Then I click Log In4
    Then I click Home4
    When I enter input search form4
    Then I click search4
Then I view output4
#

   #@tag5
  #Scenario Outline: Fungsi Filter Location
  #	Given Open chrome and start application6
    #Then I click Masuk5
    #When I enter valid username and password5
    #Then I can login5
    #Then I click Home5
    #Then I click filter location 
    #Then I click search6
    #Then I view output6
  #
  
  #@tag6
  #Scenario Outline: Fungsi Simpan
  #	Given Open chrome and start application6
    #Then I click Masuk6
    #When I enter valid username and password6
    #Then I can login6
    #Then I click Home6
    #When I enter input search form6
    #Then I click filter location 
    #Then I click search6
    #Then I view output6
    #Then I click Simpan6
  #
  
 #@tag7
  #Scenario Outline: Fungsi Hapus Bookmark
  #	Given Open chrome and start application6
    #Then I click Masuk7
    #When I enter valid username and password7
    #Then I can login7
    #Then I click Dashboard7
    #Then I click Bookmark7
    #Then I view output7
    #Then I click Hapus7
  #  
  
  #@tag8
  #Scenario Outline: Fungsi Sorting
  #	Given Open chrome and start application8
    #Then I click Educations8
    #Then I click Sarjana
    #Then I view output8
  #  
  
  #@tag9
  #Scenario Outline: Fungsi Tips Loker
  #	Given Open chrome and start application9
    #Then I click Tips Loker
		#Then I click hasil pertama
    #Then I view output9
  #  
  
  #@tag10
  #Scenario Outline: Fungsi Download Resume
  #	Given Open chrome and start application6
    #Then I click Masuk6
    #When I enter valid username and password6
    #Then I can login10
    #Then I click Dashboard10
    #Then I click Action on Resume
    #Then I click Download
    #Then I can Download10
  # 
  
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
