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
public class HotelScores {
    private double rawAppealScore;
    private double movingAverageScore;

    public HotelScores() {
    }

    public double getRawAppealScore() {
        return rawAppealScore;
    }

    public void setRawAppealScore(double rawAppealScore) {
        this.rawAppealScore = rawAppealScore;
    }

    public double getMovingAverageScore() {
        return movingAverageScore;
    }

    public void setMovingAverageScore(double movingAverageScore) {
        this.movingAverageScore = movingAverageScore;
    }
    
    
}
