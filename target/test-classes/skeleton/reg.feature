 Feature: Registration
 
 Scenario: Registration to TestMe App
 
 Given User is on signup page
 When User enters username as "diviya"
 When User enters firstname as "Harry"
 When User enters lastname as "Potter"
 When User enters password as "nimbus2000"
 When User enters confirm password as "nimbus2000"
 When User enters gender
 When User enters email as "nimbus2000@gmail.com"
 When User enters mobileno as "1234567890"
 When User enters dob as "03/05/2018"
 When User enters address as "12, Donald Trumph street, Washington"
 When User selects security question
 When User enters answer as "Winterfell"
 When User clicks register button
 And verify the successful registration
 Then close the application
 