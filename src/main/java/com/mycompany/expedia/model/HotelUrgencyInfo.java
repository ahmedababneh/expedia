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
public class HotelUrgencyInfo {
    private int airAttachRemainingTime;
    private int numberOfPeopleViewing;
    private int numberOfPeopleBooked;
    private int numberOfRoomsLeft;
    //private Timestamp lastBookedTime; // 1493867142484 #TODO
    //"almostSoldStatus": "NO_DATA",
    //"link": "/Hotel-Search#selected=12417380",
    //"almostSoldOutRoomTypeInfoCollection": [],
    //"airAttachEnabled": false

    public HotelUrgencyInfo() {
    }

    public int getAirAttachRemainingTime() {
        return airAttachRemainingTime;
    }

    public void setAirAttachRemainingTime(int airAttachRemainingTime) {
        this.airAttachRemainingTime = airAttachRemainingTime;
    }

    public int getNumberOfPeopleViewing() {
        return numberOfPeopleViewing;
    }

    public void setNumberOfPeopleViewing(int numberOfPeopleViewing) {
        this.numberOfPeopleViewing = numberOfPeopleViewing;
    }

    public int getNumberOfPeopleBooked() {
        return numberOfPeopleBooked;
    }

    public void setNumberOfPeopleBooked(int numberOfPeopleBooked) {
        this.numberOfPeopleBooked = numberOfPeopleBooked;
    }

    public int getNumberOfRoomsLeft() {
        return numberOfRoomsLeft;
    }

    public void setNumberOfRoomsLeft(int numberOfRoomsLeft) {
        this.numberOfRoomsLeft = numberOfRoomsLeft;
    }   
    
}
