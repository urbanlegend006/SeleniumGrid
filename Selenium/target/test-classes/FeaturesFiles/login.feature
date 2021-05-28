Feature: Outlook Login

Scenario: Outlook Login is OK
Given User is at prelogin page
When user logs in with valid userid "sarker.anit@outlook.com" and password "Aks#667069105"
Then Login is successful

