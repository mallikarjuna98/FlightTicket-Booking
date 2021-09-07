package com.ibm.bookingdetailsservice.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passengers2")
public class Passenger 
{
	@Id
	@Column(name="ssn")
	String ssn;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="age")
	int age; 
	
	@Column(name="email_id")
	String emailId;
	
	@Column(name="nationality")
	String nationality;
	
	@Column(name="category")
	String category;
	
	@Column(name="mobile_no")
	long mobileNo;
	
	@Column(name="pnr")
	String pnr;
	
	public Passenger() {}

	public Passenger(String ssn, String firstName, String lastName, int age, String emailId, String nationality,
			String category, long mobileNo , String pnr) {
		super();
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.emailId = emailId;
		this.nationality = nationality;
		this.category = category;
		this.mobileNo = mobileNo;
		this.pnr=pnr;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}	
}
