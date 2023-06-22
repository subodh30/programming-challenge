package com.machado_lab.application_layer.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonSerialize
@AllArgsConstructor
@NoArgsConstructor
public class Movement {
    private String accountOrCompany;
    private String newMovementreason;
    private String newSpecies;
    private String newOriginaddress;
    private String newOrigincity;
    private String newOriginname;
    private String newOriginpostalcode;
    private String newOriginpremid;
    private String newOriginstate;
    private String newDestinationaddress;
    private String newDestinationcity;
    private String newDestinationname;
    private String newDestinationpostalcode;
    private String newDestinationpremid;
    private String newDestinationstate;
    private double originLat;
    private double originLon;
    private double destinationLat;
    private double destinationLon;
    private int newNumitemsmoved;
    private String newShipmentsstartdate;


}
