package com.example.phuoclochotel.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookedRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	
	@Column(name = "check_In")
	private LocalDate checkInDate;
	
	@Column(name = "check_Out")
	private LocalDate checkOutDate;
	
	@Column(name = "guest_FullName")
	private String guestFullName;
	
	@Column(name = "guest_Email")
	private String guestEmail;
	
	@Column(name = "adults")
	private int NumOfAdults;
	
	@Column(name = "children")
	private int NumOfChildren;
	
	@Column(name = "total_Guest")
	private int totalNumOfGuest;
	
	@Column(name = "confirmation_Code")
	private String bookingConfirmationCode;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_id")
	private Room room;
	
	public void calculateTotalNumberOfGuest() {
		this.totalNumOfGuest = this.NumOfAdults + this.NumOfChildren;
	}

	
	
	//Constructor
	

	
	//Getter Setter
	
	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
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

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	
	
	

}
