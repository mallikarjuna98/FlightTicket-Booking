package com.ibm.bookingdetailsservice.entity;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking_details")
public class BookingDetails 
{
	@Id
	@Column(name="pnr")
	String pnr;
	
	@OneToOne
	@JoinColumn(name="schedule_id")
	FlightSchedule flightSchedule;
	
	@Column(name="no_of_seats")
	int noofSeats;
	
	@Column(name="username")
	String userName;
	
	@Column(name="booking_date")
	LocalDate bookingDate;
	
	@Column(name="travel_date")
	LocalDate travelDate;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="pnr")
	List<Passenger> passengers;
	
	public BookingDetails() {}
	
	public BookingDetails(List<Passenger> passengers) { this.passengers=passengers; }

	public BookingDetails( String pnr,FlightSchedule flightSchedule,  int noofSeats,
			String userName, LocalDate bookingDate, LocalDate travelDate,List<Passenger> passengers) {
		super();
		this.pnr=pnr;
		this.flightSchedule = flightSchedule;
		this.noofSeats = noofSeats;
		this.userName = userName;
		this.bookingDate = bookingDate;
		this.travelDate = travelDate;
		this.passengers=passengers;
	}
		
	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public FlightSchedule getFlightSchedule() {
		return flightSchedule;
	}

	public void setFlightSchedule(FlightSchedule flightSchedule) {
		this.flightSchedule = flightSchedule;
	}

	public int getNoofSeats() {
		return noofSeats;
	}

	public void setNoofSeats(int noofSeats) {
		this.noofSeats = noofSeats;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
}
