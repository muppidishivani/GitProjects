package com.reservation.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
@Service
public class CommanService {

    @Autowired
    private RestTemplate restTemplate;
    
//    @Autowired
//    HotelFeignClient feignClient;

    @Value("${hotel-service.url}")  
    private String hotelServiceUrl;

    @CircuitBreaker(name = "hotelService", fallbackMethod = "fallbackGetReservationByHotel")
    public Map<String, Object> getReservationByHotel(int id) {

    	
       
    	 String fullUrl = hotelServiceUrl + id;

      
         ResponseEntity<Map> response = restTemplate.getForEntity(fullUrl, Map.class);

        // return feignClient.getById(id);
        
         return response.getBody();
    }

    
    public Map<String, Object> fallbackGetReservationByHotel(int id, Throwable throwable) {
        System.out.println("Error: " + throwable.getMessage());

      
        Map<String, Object> fallbackResponse = new HashMap<>();
        fallbackResponse.put("message", "Hotel service is currently unavailable. Please try again later.");
        return fallbackResponse;
    }
}