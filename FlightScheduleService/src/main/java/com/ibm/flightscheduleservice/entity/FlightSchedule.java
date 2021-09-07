package com.ibm.flightscheduleservice.entity;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="flight_schedules")
public class FlightSchedule 
{
	@Id
	@Column(name="schedule_id")
	String scheduleId;
	@ManyToOne
	@JoinColumn(name="flight_id")
	FlightDetails flightDetails;
	@Column(name="source")
	String source;
	@Column(name="destination")
	String destination;
	@Column(name="departure")
	LocalTime departure;
	@Column(name="arrival")
	LocalTime arrival;
	@Column(name="duration")
	int duration;
	@Column(name="fare")
	double fare;
	public FlightSchedule() {}
	public FlightSchedule(String scheduleId, FlightDetails flightDetails, String source, String destination,
			LocalTime departure, LocalTime arrival, int duration, double fare) {
		super();
		this.scheduleId = scheduleId;
		this.flightDetails = flightDetails;
		this.source = source;
		this.destination = destination;
		this.departure = departure;
		this.arrival = arrival;
		this.duration = duration;
		this.fare = fare;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public FlightDetails getFlightDetails() {
		return flightDetails;
	}
	public void setFlightDetails(FlightDetails flightDetails) {
		this.flightDetails = flightDetails;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalTime getDeparture() {
		return departure;
	}
	public void setDeparture(LocalTime departure) {
		this.departure = departure;
	}
	public LocalTime getArrival() {
		return arrival;
	}
	public void setArrival(LocalTime arrival) {
		this.arrival = arrival;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}	
}
