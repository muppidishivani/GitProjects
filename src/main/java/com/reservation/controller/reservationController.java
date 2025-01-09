package com.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.entity.ReservationEntity;
import com.reservation.entity.ReservationResponse;
import com.reservation.model.ReservationModel;
import com.reservation.service.ReservationService;

@RestController
@RequestMapping("/api/reservation/")
public class reservationController {

	@Autowired
	ReservationService service;
	
	@PostMapping("/save")
	public ResponseEntity<ReservationEntity> hotelData( @RequestBody ReservationModel reservationModel)
	{
		ReservationEntity reservation=service.saveReservationData(reservationModel);
		 
        return ResponseEntity
                .status(HttpStatus.CREATED)//201 created
                .header("Data Saved Successfully...")
                .body(reservation);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<ReservationResponse> getById(@PathVariable int id)
	{
		ReservationResponse data=service.getOneRecord(id);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	

}
