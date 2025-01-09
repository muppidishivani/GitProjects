package com.reservation.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ReservationEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int id;
	    private String username;
	    private Long hotelId;
	   
	    private LocalDate checkInDate;  
	    private LocalDate checkOutDate;
	    private String reservationStatus;
		public ReservationEntity() {
			super();
		}
		public ReservationEntity(int id, String username, Long hotelId, String reservationStatus, LocalDate checkInDate,
				LocalDate checkOutDate) {
			super();
			this.id = id;
			this.username = username;
			this.hotelId = hotelId;
			this.reservationStatus = reservationStatus;
			this.checkInDate = checkInDate;
			this.checkOutDate = checkOutDate;
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
		@Override
		public String toString() {
			return "ReservationEntity [id=" + id + ", username=" + username + ", hotelId=" + hotelId
					+ ", reservationStatus=" + reservationStatus + ", checkInDate=" + checkInDate + ", checkOutDate="
					+ checkOutDate + "]";
		}
	
}
