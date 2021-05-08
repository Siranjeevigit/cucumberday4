 Feature: Verifying the adactin functionalities

Scenario Outline: Verifying the adactin details
Given User on the adactin page
When  User should enter"<userName>" and "<userPassword>"
And   User click the login button
And   User should select "<location>","<hotels>","<roomType>","<noOfRoom>","<adult>"and"<child>"
And   User click search button
And   User select hotel button
And   User click the continue button
And   User should select "<firstName>","<lastName>","<address>","<credits>","<cardType>","<endMnth>","<endYr>"and"<cvv>"
And   User click the book now button
Then User should  booking  successfully

Examples:
		|userName  |userPassword|location|hotels     |roomType|noOfRoom  |adult    |child    |firstName|lastName|address|credits         |cardType|endMnth |endYr|cvv|
		|SIRANJEEVI|Something2@ |Sydney  |Hotel Creek|Standard|1 - One   |1 - One  |0 - None |jeevi    |smile   |chennai|9812345678901234|VISA    |December|2021 |988| 
		|SIRANJEEVI|Something2@ |Sydney  |Hotel Creek|Standard|2 - Two   |1 - One  |1 - One  |jeevi    |smile   |chennai|9812345678901234|VISA    |December|2021 |988|
		|SIRANJEEVI|Something2@ |Sydney  |Hotel Creek|Standard|3 - Three |1 - One  |2 - Two  |jeevi    |smile   |chennai|9812345678901234|VISA    |December|2021 |988|
		|SIRANJEEVI|Something2@ |Sydney  |Hotel Creek|Standard|4 - Four  |1 - One  |3 - Three|jeevi    |smile   |chennai|9812345678901234|VISA    |December|2021 |988|
		|SIRANJEEVI|Something2@ |Sydney  |Hotel Creek|Standard|4 - Four  |1 - One  |4 - Four |jeevi    |smile   |chennai|9812345678901234|VISA    |December|2021 |988|
		
	        