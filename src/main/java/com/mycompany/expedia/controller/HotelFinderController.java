package com.mycompany.expedia.controller;

import com.mycompany.expedia.model.Deal;
import com.mycompany.expedia.service.HotelFinderService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.time.Period;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class HotelFinderController {
    
    @Autowired
    private HotelFinderService hotelFinderService;
    
    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value="/search", method = RequestMethod.GET)
    public String search(
                        Model model,
                        @RequestParam(value="scenario", required=true, defaultValue="deal-finder") String scenario, 
                        @RequestParam(value="page", required=true, defaultValue="foo") String page, 
                        @RequestParam(value="uid", required=true, defaultValue="foo") String uid, 
                        @RequestParam(value="productType", required=false, defaultValue="Hotel") String productType, 
                        @RequestParam(value="destinationName", required=false) String destinationName, 
                        @RequestParam(value="checkIn", required=false) String checkIn, 
                        @RequestParam(value="checkOut", required=false) String checkOut, 
                        @RequestParam(value="minTotalRate", required=false) String minTotalRate, 
                        @RequestParam(value="maxTotalRate", required=false) String maxTotalRate, 
                        @RequestParam(value="minStarRating", required=false) String minStarRating, 
                        @RequestParam(value="maxStarRating", required=false) String maxStarRating, 
                        @RequestParam(value="minGuestRating", required=false) String minGuestRating, 
                        @RequestParam(value="maxGuestRating", required=false) String maxGuestRating) {  
        
        String minTripStartDate = checkIn;
        String maxTripStartDate = checkIn;
        int lengthOfStay=0;
        
        if( (checkIn != null && !checkIn.isEmpty())  && (checkOut != null && !checkOut.isEmpty()) ){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate checkInAsDateType = LocalDate.parse(checkIn, formatter);
            LocalDate checkOutAsDateType = LocalDate.parse(checkOut, formatter);
            Period intervalPeriod = Period.between(checkInAsDateType, checkOutAsDateType);
            lengthOfStay = intervalPeriod.getDays();
        } 
        
        Deal deal = hotelFinderService.retrieveDeal( scenario, 
                                                     page, 
                                                     uid, 
                                                     productType, 
                                                     destinationName, 
                                                     minTripStartDate, 
                                                     maxTripStartDate, 
                                                     lengthOfStay, 
                                                     minTotalRate, 
                                                     maxTotalRate, 
                                                     minStarRating, 
                                                     maxStarRating, 
                                                     minGuestRating, 
                                                     maxGuestRating);
                
        model.addAttribute("deal", deal);
        model.addAttribute("checkIn", checkIn);
        model.addAttribute("checkOut", checkOut);
        model.addAttribute("destinationName", destinationName);
        
        return "search";
    }
   
}