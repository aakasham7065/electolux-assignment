Author: Aakash kumar
Date:    09 May 2022

# The Electrolux connected appliances  project 

## prerequisite

you have installed :
git
java 9
gradle  

## Start the application

Clone or download this project. Then in the root run the applcation by using the command below




This will run the server on port 8080
Products and inventory will be loaded on start. To reload for test purposes you need to restart the server

# build and package the application

``
The application should now start.



# List all connected appliance curl
curl --location --request GET 'http://localhost:8080/rest/getAppliancesStatus?customerName=ERIK' \
--header 'Authorization: Bearer 00afb66f01da42ebb4fe2a22bf06c266'

Response: Showing all the connected appliances of customer based on customer name. 
we are showing random connection status of each appliances. 

{
    "customerName": "ERIK",
    "applincesList": [
        {
            "applianceId": "MICROWAVE_12764579",
            "factoryNo": "IND127",
            "connectionStatus": "NOT_CONNECTED"
        },
        {
            "applianceId": "DISHWASHER_34524579",
            "factoryNo": "CPH127",
            "connectionStatus": "CONNECTED"
        },
        {
            "applianceId": "REFRIGERATOR_34524579",
            "factoryNo": "SWE071",
            "connectionStatus": "UNKNOWN"
        }
    ]
}




