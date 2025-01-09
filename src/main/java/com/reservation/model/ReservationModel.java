package com.reservation.model;

import java.time.LocalDate;

import com.reservation.entity.HotelResponse;

public class ReservationModel {

	
	    private String username;
	    private Long hotelId;
	  
	    private LocalDate checkInDate;  
	    private LocalDate checkOutDate;
	    private String reservationStatus;
	
		public ReservationModel() {
			super();
		}

		public ReservationModel(String username, Long hotelId, LocalDate checkInDate, LocalDate checkOutDate,
				String reservationStatus) {
			super();
			this.username = username;
			this.hotelId = hotelId;
			this.checkInDate = checkInDate;
			this.checkOutDate = checkOutDate;
			this.reservationStatus = reservationStatus;
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

		public String getReservationStatus() {
			return reservationStatus;
		}

		public void setReservationStatus(String reservationStatus) {
			this.reservationStatus = reservationStatus;
		}

		@Override
		public String toString() {
			return "ReservationModel [username=" + username + ", hotelId=" + hotelId + ", checkInDate=" + checkInDate
					+ ", checkOutDate=" + checkOutDate + ", reservationStatus=" + reservationStatus + "]";
		}
		
}
