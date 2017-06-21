/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expedia.service;

import com.mycompany.expedia.model.Deal;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author ahmed
 */
@Component
public class HotelFinderService {
    public Deal retrieveDeal(
                            String scenario, 
                            String page, 
                            String uid, 
                            String productType, 
                            String destinationName, 
                            String minTripStartDate, 
                            String maxTripStartDate, 
                            int lengthOfStay, 
                            String minTotalRate, 
                            String maxTotalRate, 
                            String minStarRating, 
                            String maxStarRating, 
                            String minGuestRating, 
                            String maxGuestRating) {
        
	RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        
        String url = "https://offersvc.expedia.com/offers/v2/getOffers";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("scenario", scenario)
                .queryParam("page", page)
                .queryParam("uid", uid)
                .queryParam("productType", productType)
                .queryParam("destinationName", destinationName)
                .queryParam("minTripStartDate", minTripStartDate)
                .queryParam("maxTripStartDate", maxTripStartDate)
                .queryParam("lengthOfStay", lengthOfStay)
                .queryParam("minStarRating", minStarRating)
                .queryParam("maxStarRating", maxStarRating)
                .queryParam("minTotalRate", minTotalRate)
                .queryParam("maxTotalRate", maxTotalRate)
                .queryParam("minGuestRating", minGuestRating)
                .queryParam("maxGuestRating", maxGuestRating);
                
        Deal deal = restTemplate.getForObject(
                builder.build().encode().toUri(), 
                Deal.class);
        
        return deal;
	
    }
}
