package com.ibm.loginservice.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_details")
public class Login 
{
	    @Id
	    @Column(name="username")
	    String username;
	    @Column(name="password")
	    String password;
	    @Column(name="email_id")
	    String emailId;
	    @Column(name="mobile_no")
	    long mobileNo;
	    public Login() {}
		public Login(String username, String password, String emailId, long mobileNo) 
		{
			this.username = username;		this.password = password;
			this.emailId = emailId;		this.mobileNo = mobileNo;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public long getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
		}
}
