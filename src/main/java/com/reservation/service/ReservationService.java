package com.reservation.service;

import java.time.LocalDate;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.entity.HotelResponse;
import com.reservation.entity.ReservationEntity;
import com.reservation.entity.ReservationResponse;
import com.reservation.model.ReservationModel;
import com.reservation.repository.ReservationRepository;

@Service
public class ReservationService {
	
	@Autowired
	ReservationRepository repository;
	
	@Autowired
	CommanService commanService;

	public ReservationEntity saveReservationData(ReservationModel reservationModel)
	{
		ReservationEntity reservation=new ReservationEntity();
		reservation.setUsername(reservationModel.getUsername());
		reservation.setHotelId(reservationModel.getHotelId());
		LocalDate checkdate=reservationModel.getCheckInDate();
		LocalDate date=checkdate;
		reservation.setCheckInDate(date);
		LocalDate chechOut= reservationModel.getCheckOutDate();
		LocalDate chech=chechOut;
		reservation.setCheckOutDate(chech);
		reservation.setReservationStatus(reservationModel.getReservationStatus());
		return repository.save(reservation);
		
		
	}
	//FeignClient Communication
	
//	public ReservationResponse getOneRecord(int id)
//	{
//		ReservationEntity reservation=repository.findById(id).get();
//		
//		ReservationResponse reservationResponse =new ReservationResponse();
//		reservationResponse.setUsername(reservation.getUsername());
//		reservationResponse.setReservationStatus(reservation.getReservationStatus());
//		reservationResponse.setCheckInDate(reservation.getCheckInDate());
//		reservationResponse.setCheckOutDate(reservation.getCheckOutDate());
//		reservationResponse.setHotelId(reservation.getHotelId());
//		reservationResponse.setId(id);
//		
//		Map<String, Object> response=commanService.getReservationByHotel(id);
//		reservationResponse.setHotelResponse(response);
//		
//		return reservationResponse;
//	}
	public ReservationResponse getOneRecord(int id) {
        ReservationEntity reservation = repository.findById(id).orElseThrow(() -> new RuntimeException("Reservation not found"));

        ReservationResponse reservationResponse = new ReservationResponse();
        reservationResponse.setUsername(reservation.getUsername());
        reservationResponse.setReservationStatus(reservation.getReservationStatus());
        reservationResponse.setCheckInDate(reservation.getCheckInDate());
        reservationResponse.setCheckOutDate(reservation.getCheckOutDate());
        reservationResponse.setHotelId(reservation.getHotelId());
        reservationResponse.setId(id);

        // Get the hotel details using CommanService
        Map<String, Object> hotelResponse = commanService.getReservationByHotel(id);
        reservationResponse.setHotelResponse(hotelResponse);

        return reservationResponse;
    }
		
	
}
