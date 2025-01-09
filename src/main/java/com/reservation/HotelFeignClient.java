package com.reservation;

import java.util.Map;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.reservation.entity.HotelResponse;

//@FeignClient(name = "hotel-service" ,path="/api/hotel")
//public interface HotelFeignClient {
	
//	  @GetMapping("/getById/{id}")  
//	    Map<String, Object> getById(@PathVariable("id") int id);

//}
