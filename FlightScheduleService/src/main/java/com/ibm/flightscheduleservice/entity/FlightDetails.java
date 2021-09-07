package com.ibm.flightscheduleservice.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FlightDetails 
{
		@Id
		@Column(name="flight_id")
		String flightId;
		@Column(name="company_name")
		String companyName;
		@Column(name="seat_row")
		int seatRow;
		@Column(name="seat_col")
		int seatCol;
		public FlightDetails() {}
		public FlightDetails(String flightId, String companyName, int seatRow, int seatCol) {
			super();
			this.flightId = flightId;
			this.companyName = companyName;
			this.seatRow = seatRow;
			this.seatCol = seatCol;
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
		public int getSeatRow() {
			return seatRow;
		}
		public void setSeatRow(int seatRow) {
			this.seatRow = seatRow;
		}
		public int getSeatCol() {
			return seatCol;
		}
		public void setSeatCol(int seatCol) {
			this.seatCol = seatCol;
		}
}