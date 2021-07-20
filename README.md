# MockProject2
2nd version of Services project for O2StL March cohort.

## Setup
	1. Clone entire repository to your local machine.
	2. Find application tables in the "Tables_csv" directory. Use Import Table Wizard in MySQL Workbench to import all of these tables into your current Schema.
	3. If not already done, open entire project in STS4.
		Troubleshooting -
		a. Check Java Runtime conflicts in /Properties/Java Build Path.
		b. Run Maven update.
		c. < Please add other Troubleshooting tips. >
	4. Make sure MySQL Workbench and Postman are up and running.
	5. Adjust application.properties of each application to connect to the right resources. Please leave "server.port" alone, as the REST Controllers access Ports.
	
## Running Applications
	1. STS4: Run all 6 services, as "Spring Boot App".
	2. Postman: To access full Orchestration, create a "POST http://localhost:8080/" call, with the JSON body:
					{
						"id": 1234,
						"dateOfBirth": "2001-01-01"
					}	
				
			The following should be the output:
					{
						"id": 1234,
						"dateOfBirth": "2001-01-01",
						"membership": {
								"dateOfBirth": "2001-01-01",
								"group": {
										"groupId": "T55N",
										"carrierId": "JS38456S"
								}
						},
						"name": {
								"firstName": "Henry",
								"lastName": "Ford"
						},
						"address": [
								{
										"statusVerified": "true",
										"zipCode5": "12345-6789",
										"addressLine1": "123 First Ave",
										"addressLine2": "Apt 31",
										"addressLine3": null,
										"addressType": "Home",
										"addressVerified": "true",
										"city": "New York",
										"state": "NY",
										"zipCode4": "12345"
								},
								{
										"statusVerified": "true",
										"zipCode5": "32472-8672",
										"addressLine1": "567 Second Street",
										"addressLine2": "sbdfsdfb",
										"addressLine3": null,
										"addressType": "Business",
										"addressVerified": "false",
										"city": "Trenton",
										"state": "NJ",
										"zipCode4": "32472"
								}
						],
						"email": [
								{
										"address": "this@am.com",
										"undeliverable": true
								},
								{
										"address": "tother@am.com",
										"undeliverable": false
								},
								{
										"address": "this@pm.com",
										"undeliverable": true
								}
						],
						"phone": [
								{
										"bestTimeToCall": "4 to 8",
										"number": "7368471425",
										"extension": null,
										"countryCallingCode": 11,
										"phoneType": "land"
								},
								{
										"bestTimeToCall": "4 to 8",
										"number": "'7625329821'",
										"extension": null,
										"countryCallingCode": 2,
										"phoneType": "mobile"
								}
						],
						"agn": "hs683-7859",
						"eligStatus": false,
						"benefitGrp": "3"
				}
				
		Your Response.Status should show "208 Already Reported "
