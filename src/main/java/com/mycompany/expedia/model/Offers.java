/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expedia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author ahmed
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Offers {
    
    @JsonProperty("Hotel")
    private Hotel[] hotels;

    public Offers() {
    }

    public Offers(Hotel[] hotels) {
        this.hotels = hotels;
    }
    
    public Hotel[] getHotels() {
        return hotels;
    }

    public void setHotels(Hotel[] hotels) {
        this.hotels = hotels;
    }
    
    
    
}
