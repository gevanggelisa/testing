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
Feature: Robot test for Spotify (spotify.com/id)

  #@tag1
  #Scenario Outline: Fungsi Login
  #	Given Open chrome and start application1
    #Then I click Masuk1
    #When I enter username and password1r
    #Then I click Log In1
    
  @tag2
  Scenario Outline: Fungsi Play Song
  	Given Open chrome and start application2
    Then I click Daftar2
    When I enter input form2
    #
  #@tag3
  #Scenario Outline: Fungsi Forget Password
  #	Given Open chrome and start application3
    #Then I click Masuk3
    #Then I click forgot your password3
    #When I enter input form3
    #Then I click Kirim3
    #
  #@tag4
  #Scenario Outline: Fungsi Edit Profile
  #	Given Open chrome and start application4
    #Then I click Masuk4
    #When I enter valid username and password4
    #Then I click Log In4
    #Then I click Edit Profile4
    #When I enter input form4
    #Then I click button4
  #
  #@tag5
  #Scenario Outline: Fungsi Search
  #	Given Open chrome and start application5
    #Then I click Masuk5
    #When I enter valid username and password5
    #Then I can login5
    #Then I click Home5
    #Then I click Dengarkan di Spotify5
    #Then I click search5
    #When I enter input search form5
  
  #@tag6
  #Scenario Outline: Fungsi Play Song
  #	Given Open chrome and start application6
    #Then I click Masuk6
    #When I enter valid username and password6
    #Then I can login6
    #Then I click Home6
    #Then I click Dengarkan di Spotify6
    #Then I click play6
    
  #@tag7
  #Scenario Outline: Fungsi View Recently Played
  #	Given Open chrome and start application7
    #Then I click Masuk7
    #When I enter valid username and password7
    #Then I can login7
    #Then I click Home7
    #Then I click Dengarkan di Spotify7
    #Then I click view all7
    
  #@tag8
  #Scenario Outline: Fungsi View Playlist
  #	Given Open chrome and start application8
    #Then I click Masuk8
    #When I enter valid username and password8
    #Then I can login8
    #Then I click Home8
    #Then I click Dengarkan di Spotify8
    #Then I click view all8
    #
  #@tag9
  #Scenario Outline: Fungsi View Profile
  #	Given Open chrome and start application9
    #Then I click Masuk9
    #When I enter valid username and password9
    #Then I can login9
    #Then I click Home9
    #Then I click open web player
    #Then I click view profile
    #Then I can see my profile
    #
  #@tag10
  #Scenario Outline: Fungsi Download
  #	Given Open chrome and start application10
    #Then I can download10    
    
 

    Examples: 
      | name  |
      | name1 |
