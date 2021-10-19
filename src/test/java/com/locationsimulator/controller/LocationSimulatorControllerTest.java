package com.locationsimulator.controller;


import static org.junit.Assert.*;
import org.junit.Before; 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.locationsimulator.service.LocationSimulatorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationSimulatorControllerTest { 
	  
	    @Mock
	    private RestTemplate resttemplate;
		
		@Mock
		private LocationSimulatorService locationSimulatorService;
		
		private String result = "[12.9316597 77.6285175, 12.9300056 77.6292527, 12.9298015 77.63302139999999, 12.928541 77.6361441, 12.9281408 77.6359569, 12.9265847 77.6371577]";
		 @Before 
		  public void setUp() {
		  }
		 
		@Test
		public void testGetLocationResults() {	
            Mockito.when(locationSimulatorService.getlocationResults("12.93175, 77.62872", "12.92662, 77.63696")).thenReturn(result); 
            String expected = locationSimulatorService.getlocationResults("12.93175, 77.62872", "12.92662, 77.63696");
            String actual= result;
            assertEquals(actual,expected);  
		}	

    } 