package com.mycompany.expedia.controller;

import com.mycompany.expedia.model.Deal;
import com.mycompany.expedia.model.Destination;
import com.mycompany.expedia.model.Hotel;
import com.mycompany.expedia.model.HotelInfo;
import com.mycompany.expedia.model.HotelPricingInfo;
import com.mycompany.expedia.model.Offers;
import com.mycompany.expedia.service.HotelFinderService;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * 
 * @author ahmed
 * We used Mockito framework for unit testing the application. 
 * We used unit testing to test our conroller class "HotelFinderController" which exposes a GET method "search". 
 * We wrote a unit test for this method. We use the mocking to return a specific deal when invoked. 
 * Then, we used "Assert" to check whether the expected hotel deal fields are found in the generated search results page.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = HotelFinderController.class, secure = false)
public class HotelFinderControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private HotelFinderService hotelFinderService;
        
        // Creating mock objects
        Destination mockDestination = new Destination(12345, "Paris (and vicinity), France", "France", "Ile de France", "Paris");
        HotelInfo mockHotelInfo = new HotelInfo("Moulin Rouge", 3, 4, "https://images.trvl-media.com/hotels/1000000/90000/83100/83030/83030_89_t.jpg","Book now and save!");
        HotelPricingInfo mockHotelPricingInfo = new HotelPricingInfo(300, 400, "USD");
        Hotel[] mockHotels = {new Hotel(mockDestination, mockHotelInfo, mockHotelPricingInfo), new Hotel(mockDestination, mockHotelInfo, mockHotelPricingInfo)};
        Offers mockOffers = new Offers(mockHotels);
	Deal mockDeal = new Deal(mockOffers);

	@Test
	public void search() throws Exception {

		Mockito.when(hotelFinderService.retrieveDeal(Mockito.anyString(),
                                                             Mockito.anyString(),
                                                             Mockito.anyString(),
                                                             Mockito.anyString(),
                                                             Mockito.anyString(),
                                                             Mockito.anyString(),
                                                             Mockito.anyString(),
                                                             Mockito.anyInt(),
                                                             Mockito.anyString(),
                                                             Mockito.anyString(),
                                                             Mockito.anyString(),
                                                             Mockito.anyString(),
                                                             Mockito.anyString(),
                                                             Mockito.anyString())).thenReturn(mockDeal);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/search").accept(
				MediaType.APPLICATION_JSON);

		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
                
                // We check the output page contains the expexted deal data
                String responseString = mvcResult.getResponse().getContentAsString();
                assertThat(responseString, containsString("Paris (and vicinity), France"));
                assertThat(responseString, containsString("Moulin Rouge"));
                assertThat(responseString, containsString("https://images.trvl-media.com/hotels/1000000/90000/83100/83030/83030_89_t.jpg"));
                assertThat(responseString, containsString("Book now and save!"));
                assertThat(responseString, containsString("300"));
                assertThat(responseString, containsString("400"));
                assertThat(responseString, containsString("USD"));
	}
}