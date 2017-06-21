/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expedia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel {
    private OfferDateRange offerDateRange;
    private Destination destination;
    private HotelInfo hotelInfo;
    private HotelUrgencyInfo hotelUrgencyInfo;
    private HotelPricingInfo hotelPricingInfo;
    private HotelUrls hotelUrls;
    private HotelScores hotelScores;
            
    public Hotel() {
    }

    public Hotel(Destination destination, HotelInfo hotelInfo, HotelPricingInfo hotelPricingInfo) {
        this.destination = destination;
        this.hotelInfo = hotelInfo;
        this.hotelPricingInfo = hotelPricingInfo;
    }
    

    public OfferDateRange getOfferDateRange() {
        return offerDateRange;
    }

    public void setOfferDateRange(OfferDateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public HotelUrgencyInfo getHotelUrgencyInfo() {
        return hotelUrgencyInfo;
    }

    public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
        this.hotelUrgencyInfo = hotelUrgencyInfo;
    }

    public HotelPricingInfo getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    public HotelUrls getHotelUrls() {
        return hotelUrls;
    }

    public void setHotelUrls(HotelUrls hotelUrls) {
        this.hotelUrls = hotelUrls;
    }

    public HotelScores getHotelScores() {
        return hotelScores;
    }

    public void setHotelScores(HotelScores hotelScores) {
        this.hotelScores = hotelScores;
    }
    
    
    
}



