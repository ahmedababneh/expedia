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
public class HotelPricingInfo {
    private double averagePriceValue; 
    private double totalPriceValue;
    private double originalPricePerNight;
    private double hotelTotalBaseRate;
    private double hotelTotalTaxesAndFees;
    private String currency;
    private double hotelTotalMandatoryTaxesAndFees;
    private double percentSavings;
    //"drr": true

    public HotelPricingInfo() {
    }

    public HotelPricingInfo(double totalPriceValue, double hotelTotalBaseRate, String currency) {
        this.totalPriceValue = totalPriceValue;
        this.hotelTotalBaseRate = hotelTotalBaseRate;
        this.currency = currency;
    }

    public double getAveragePriceValue() {
        return averagePriceValue;
    }

    public void setAveragePriceValue(double averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    public double getTotalPriceValue() {
        return totalPriceValue;
    }

    public void setTotalPriceValue(double totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    public double getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    public void setOriginalPricePerNight(double originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    public double getHotelTotalBaseRate() {
        return hotelTotalBaseRate;
    }

    public void setHotelTotalBaseRate(double hotelTotalBaseRate) {
        this.hotelTotalBaseRate = hotelTotalBaseRate;
    }

    public double getHotelTotalTaxesAndFees() {
        return hotelTotalTaxesAndFees;
    }

    public void setHotelTotalTaxesAndFees(double hotelTotalTaxesAndFees) {
        this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getHotelTotalMandatoryTaxesAndFees() {
        return hotelTotalMandatoryTaxesAndFees;
    }

    public void setHotelTotalMandatoryTaxesAndFees(double hotelTotalMandatoryTaxesAndFees) {
        this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
    }

    public double getPercentSavings() {
        return percentSavings;
    }

    public void setPercentSavings(double percentSavings) {
        this.percentSavings = percentSavings;
    }
    
}
