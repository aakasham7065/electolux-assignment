package com.electrolux.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * The article object
 */
@Data
public class Appliances implements Serializable {
    private static final long serialVersionUID = -1768105479248068676L;

    private String applianceId;
    private String factoryNo;
    private String connectionStatus;
    
   
}
