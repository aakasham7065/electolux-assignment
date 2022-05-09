package com.electrolux;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.electrolux.dto.Appliances;
import com.electrolux.dto.CustomDeviceMonitoringReponse;
import com.electrolux.services.ConnectedApplianceService;

@SpringBootTest
class AssignmentApplicationTests {

	@Test
	void contextLoads() {

	}

	@Autowired
	ConnectedApplianceService connectedApplianceService;

	@Test
	public void testConnectedApplianceService() {

		CustomDeviceMonitoringReponse CustomDeviceMonitoringReponse = connectedApplianceService
				.getAllCustomerApplicesList("AAKASH");
		CustomDeviceMonitoringReponse.setCustomerName("AAKASH");
		Assert.assertTrue(CustomDeviceMonitoringReponse.getCustomerName().equals("AAKASH"));

	}

	@Test
	public void testConnectedApplianceServiceValue() {

		CustomDeviceMonitoringReponse CustomDeviceMonitoringReponse = connectedApplianceService
				.getAllCustomerApplicesList("ERIK");
		CustomDeviceMonitoringReponse.setApplincesList(null);
		Assert.assertTrue(CustomDeviceMonitoringReponse.getApplincesList()==null);

	}
	
	
	@Test
	public void testConnectedApplianceServiceValueApplince() {

		CustomDeviceMonitoringReponse CustomDeviceMonitoringReponse = connectedApplianceService
				.getAllCustomerApplicesList("ERIK");
		ArrayList<Appliances> appliacesList = new ArrayList<Appliances>();

		Appliances appliancesOne = new Appliances();
		appliancesOne.setApplianceId("MICROWAVE_12764579");
		appliancesOne.setFactoryNo("IND127");
		Appliances appliancesecond = new Appliances();
		appliancesecond.setApplianceId("DISHWASHER_34524579");
		appliancesecond.setFactoryNo("CPH127");
		appliancesecond.setConnectionStatus("CONNECTED");

		
		CustomDeviceMonitoringReponse.setApplincesList(appliacesList);
		Assert.assertTrue(CustomDeviceMonitoringReponse.getApplincesList().equals(appliacesList));

	}
	
	
	
	
}
