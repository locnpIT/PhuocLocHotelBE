package com.example.phuoclochotel.response;

import java.time.LocalDate;

import com.example.phuoclochotel.model.Room;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
	
	private Long id;
	
	private LocalDate checkInDate;
	
	public BookingResponse(Long id, LocalDate checkInDate, 
			LocalDate checkOutDate, String bookingConfirmationCode) {
		this.id = id;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.bookingConfirmationCode = bookingConfirmationCode;
	}

	private LocalDate checkOutDate;
	
	private String guestFullName;
	
	private String guestEmail;
	
	private int NumOfAdults;
	
	private int NumOfChildren;
	
	private int totalNumOfGuest;
	
	private String bookingConfirmationCode;
	
	private RoomResponse room;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getGuestFullName() {
		return guestFullName;
	}

	public void setGuestFullName(String guestFullName) {
		this.guestFullName = guestFullName;
	}

	public String getGuestEmail() {
		return guestEmail;
	}

	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

	public int getNumOfAdults() {
		return NumOfAdults;
	}

	public void setNumOfAdults(int numOfAdults) {
		NumOfAdults = numOfAdults;
	}

	public int getNumOfChildren() {
		return NumOfChildren;
	}

	public void setNumOfChildren(int numOfChildren) {
		NumOfChildren = numOfChildren;
	}

	public int getTotalNumOfGuest() {
		return totalNumOfGuest;
	}

	public void setTotalNumOfGuest(int totalNumOfGuest) {
		this.totalNumOfGuest = totalNumOfGuest;
	}

	public String getBookingConfirmationCode() {
		return bookingConfirmationCode;
	}

	public void setBookingConfirmationCode(String bookingConfirmationCode) {
		this.bookingConfirmationCode = bookingConfirmationCode;
	}

	public RoomResponse getRoom() {
		return room;
	}

	public void setRoom(RoomResponse room) {
		this.room = room;
	}
	
	
	
	
	
	

}
