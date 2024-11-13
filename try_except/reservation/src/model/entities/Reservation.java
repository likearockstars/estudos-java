package model.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {
	
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reservation() {
	}
	
	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public void setRoomNumber(Integer roomNumber) {
		
		this.roomNumber = roomNumber;
	}
	
	public Integer getRoomNumber() {
		
		return roomNumber;
	}
	
	public LocalDate getCheckIn() {
		
		return checkIn;
	}
	
	public LocalDate getCheckOut() {
		
		return checkOut;
	}
	
	public Integer duration() {
		
		// Calculamos a diferença entre as datas em dias e a convertimos para um número inteiro
		return  (int) ChronoUnit.DAYS.between(checkIn, checkOut);
	}
	
	public void updateDates(LocalDate checkIn, LocalDate checkOut) {
		
		this.checkIn = checkIn;
		this.checkIn = checkOut;
	}

}