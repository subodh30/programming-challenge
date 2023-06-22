package com.machado_lab.application_layer.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a movement of animals from one location to another.
 */
@Data
@JsonSerialize
@AllArgsConstructor
@NoArgsConstructor
public class Movement {

    /**
     * The account or company associated with the movement.
     */
    private String accountOrCompany;

    /**
     * The reason for the new movement.
     */
    private String newMovementreason;

    /**
     * The species of the animal being moved.
     */
    private String newSpecies;

    /**
     * The address of the origin location.
     */
    private String newOriginaddress;

    /**
     * The city of the origin location.
     */
    private String newOrigincity;

    /**
     * The name of the origin location.
     */
    private String newOriginname;

    /**
     * The postal code of the origin location.
     */
    private String newOriginpostalcode;

    /**
     * The premid of the origin location.
     */
    private String newOriginpremid;

    /**
     * The state of the origin location.
     */
    private String newOriginstate;

    /**
     * The address of the destination location.
     */
    private String newDestinationaddress;

    /**
     * The city of the destination location.
     */
    private String newDestinationcity;

    /**
     * The name of the destination location.
     */
    private String newDestinationname;

    /**
     * The postal code of the destination location.
     */
    private String newDestinationpostalcode;

    /**
     * The premid of the destination location.
     */
    private String newDestinationpremid;

    /**
     * The state of the destination location.
     */
    private String newDestinationstate;

    /**
     * The latitude of the origin location.
     */
    private double originLat;

    /**
     * The longitude of the origin location.
     */
    private double originLon;

    /**
     * The latitude of the destination location.
     */
    private double destinationLat;

    /**
     * The longitude of the destination location.
     */
    private double destinationLon;

    /**
     * The number of animals being moved.
     */
    private int newNumitemsmoved;

    /**
     * The start date of the shipments.
     */
    private String newShipmentsstartdate;
}
