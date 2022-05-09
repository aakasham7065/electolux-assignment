package com.electrolux.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.electrolux.expections.CustomerNotFoundException;
import com.electrolux.services.ConnectedApplianceService;

@RestController
public class AppliancesMonitoringController {

	/**
	 * @author Aakash Kumar connected appliances based on customer name
	 * 
	 * @input customerName
	 * @return list of all connected appliance
	 */

	@Autowired
	ConnectedApplianceService connectedApplianceService;

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/rest/getAppliancesStatus", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity<?> listAllConnectedAppliance(@RequestParam String customerName) {

		log.info("tracking id" + "TRK_ID_YT7612437243" + "customerinfo:" + customerName);

		if (customerName == null || customerName.isBlank()) {

			throw new CustomerNotFoundException("Invalid Customer name.");
		}

		return new ResponseEntity<>(connectedApplianceService.getAllCustomerApplicesList(customerName), HttpStatus.OK);
	}

}
