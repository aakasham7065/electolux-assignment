package com.electrolux.dto;

import java.io.Serializable;
import java.util.ArrayList;


public class CustomDeviceMonitoringReponse implements Serializable {

    private static final long serialVersionUID = 4156220146326471001L;
   
    private String customerName;

    public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	private ArrayList<Appliances> applincesList= new ArrayList<>();

	public ArrayList<Appliances> getApplincesList() {
		return applincesList;
	}

	public void setApplincesList(ArrayList<Appliances> applincesList) {
		this.applincesList = applincesList;
	}
	
	
}
