package com.electrolux.services;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.electrolux.dto.Appliances;
import com.electrolux.dto.CustomDeviceMonitoringReponse;

/** @author  Aakash 
 *  service to get the status of appliances  based on customer name and current status
*/
@Service
public class ConnectedApplianceService {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	CustomDeviceMonitoringReponse CustomDeviceMonitoringReponse = new CustomDeviceMonitoringReponse();
	
	

	public CustomDeviceMonitoringReponse getAllCustomerApplicesList(String customerName) {

		log.info("Service  request  starts with TRK_ID_YT7612437243 " + customerName);
		CustomDeviceMonitoringReponse.setCustomerName(customerName);
        CustomDeviceMonitoringReponse.setApplincesList(getApplincesCurrentStatus());

		return CustomDeviceMonitoringReponse;
	}
	
	
	
	
	//Setting up static value for connection status of each appliances

	private ArrayList<Appliances> getApplincesCurrentStatus() {

		log.info("Setting   status  starts with TRK_ID_YT7612437243 ");

		ArrayList<Appliances> appliacesList = new ArrayList<Appliances>();

		Appliances appliancesOne = new Appliances();
		appliancesOne.setApplianceId("MICROWAVE_12764579");
		appliancesOne.setFactoryNo("IND127");
		Appliances appliancesecond = new Appliances();
		appliancesecond.setApplianceId("DISHWASHER_34524579");
		appliancesecond.setFactoryNo("CPH127");

		Appliances applianceThird = new Appliances();
		applianceThird.setApplianceId("REFRIGERATOR_34524579");
		applianceThird.setFactoryNo("SWE071");

		
		//Set random fake  status of appliances
		int randomNo = (int) ((Math.random() * (6 - 1)) + 1);
		if(randomNo>3) {
			applianceThird.setConnectionStatus("CONNECTED");
			appliancesecond.setConnectionStatus("NOT_CONNECTED");
			appliancesOne.setConnectionStatus("UNKNOWN");
		}
		else {
			applianceThird.setConnectionStatus("UNKNOWN");
			appliancesecond.setConnectionStatus("CONNECTED");
			appliancesOne.setConnectionStatus("NOT_CONNECTED");
		}
		
		log.info("Setting connection status for each appliance ");

		appliacesList.add(appliancesOne);
		appliacesList.add(appliancesecond);
		appliacesList.add(applianceThird);

		return appliacesList;

	}

}
