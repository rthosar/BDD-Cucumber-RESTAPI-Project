Feature: Search the Github Repositories
	using keyword...
	
	Scenario Outline: Search the Github Repositories
		Given open a github repo and search a repo with keyword "<option>"
		Then verify if the http response code is <output>
			
			Examples:
			| option    | output | 
			| java      | 200    |
			| angular4  | 200    |
			
			