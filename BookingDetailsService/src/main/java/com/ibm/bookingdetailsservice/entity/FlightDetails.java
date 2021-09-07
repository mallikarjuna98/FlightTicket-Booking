package com.ibm.bookingdetailsservice.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="flight_details")
public class FlightDetails 
{
	@Id
	@Column(name="flight_id")
	String flightId;
	
	@Column(name="company_name")
	String companyName;
	
	@Column(name="seat_row")
	int rows;
	
	@Column(name="seat_col")
	int coloumns;
	
	public FlightDetails() {}
	public FlightDetails(String flightId, String companyName, int rows, int coloumns) {
		super();
		this.flightId = flightId;
		this.companyName = companyName;
		this.rows = rows;
		this.coloumns = coloumns;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColoumns() {
		return coloumns;
	}
	public void setColoumns(int coloumns) {
		this.coloumns = coloumns;
	}	
}
