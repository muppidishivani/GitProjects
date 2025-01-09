package com.reservation.entity;

import java.time.LocalDate;

public class HotelResponse {

	private int id;
	private String name;
	private String address;
	private long contactNumber;
	private double price;
	private double availableRooms;
	private LocalDate availabilitydate;
	public HotelResponse(int id, String name, String address, long contactNumber, double price, double availableRooms,
			LocalDate availabilitydate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.price = price;
		this.availableRooms = availableRooms;
		this.availabilitydate = availabilitydate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAvailableRooms() {
		return availableRooms;
	}
	public void setAvailableRooms(double availableRooms) {
		this.availableRooms = availableRooms;
	}
	public LocalDate getAvailabilitydate() {
		return availabilitydate;
	}
	public void setAvailabilitydate(LocalDate availabilitydate) {
		this.availabilitydate = availabilitydate;
	}
	@Override
	public String toString() {
		return "HotelResponse [id=" + id + ", name=" + name + ", address=" + address + ", contactNumber="
				+ contactNumber + ", price=" + price + ", availableRooms=" + availableRooms + ", availabilitydate="
				+ availabilitydate + "]";
	}
	
}
