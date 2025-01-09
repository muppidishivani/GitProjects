package com.reservation.entity;

import java.time.LocalDate;
import java.util.Map;

public class ReservationResponse {

	 private int id;
	    private String username;
	    private Long hotelId;
	    private String reservationStatus;
	    private LocalDate checkInDate;  
	    private LocalDate checkOutDate;
	
	private Map<String ,Object> hotelResponse;

	public ReservationResponse() {
		super();
	}

	public ReservationResponse(int id, String username, Long hotelId, String reservationStatus, LocalDate checkInDate,
			LocalDate checkOutDate, Map<String, Object> hotelResponse) {
		super();
		this.id = id;
		this.username = username;
		this.hotelId = hotelId;
		this.reservationStatus = reservationStatus;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.hotelResponse = hotelResponse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getReservationStatus() {
		return reservationStatus;
	}

	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Map<String, Object> getHotelResponse() {
		return hotelResponse;
	}

	public void setHotelResponse(Map<String, Object> hotelResponse) {
		this.hotelResponse = hotelResponse;
	}

	@Override
	public String toString() {
		return "ReservationResponse [id=" + id + ", username=" + username + ", hotelId=" + hotelId
				+ ", reservationStatus=" + reservationStatus + ", checkInDate=" + checkInDate + ", checkOutDate="
				+ checkOutDate + ", hotelResponse=" + hotelResponse + "]";
	}

	
}
