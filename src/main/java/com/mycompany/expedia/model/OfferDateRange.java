/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expedia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author ahmed
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OfferDateRange {
    private int[] travelStartDate;
    private int[] travelEndDate;
    private int lengthOfStay;

    public OfferDateRange() {
    }

    public int[] getTravelStartDate() {
        return travelStartDate;
    }

    public void setTravelStartDate(int[] travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    public int[] getTravelEndDate() {
        return travelEndDate;
    }

    public void setTravelEndDate(int[] travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

  
    
    public int getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(int lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

}
