package com.ibm.userdetailsservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.userdetailsservice.entity.UserDetails;
import com.ibm.userdetailsservice.service.UserDetailsService;

@RestController
public class UserDetailsController 
{
	     @Autowired
	     UserDetailsService userDetailsService;
	     
	     @PostMapping(consumes="application/json")
	     public HttpStatus insertUserDetails(@RequestBody UserDetails userDetails)
	     {
	    	 return userDetailsService.insertUserDetails(userDetails) ? HttpStatus.OK : HttpStatus.NOT_MODIFIED;
	     }
	     
	     @PutMapping(consumes="application/json")
	     public HttpStatus modifyUserDetails(@RequestBody UserDetails userDetails)
	     {
	    	 return userDetailsService.insertUserDetails(userDetails) ? HttpStatus.OK : HttpStatus.NOT_MODIFIED;
	     }
	     
	     @GetMapping(value="/username/{username}",produces="application/json")
	     public UserDetails getUserDetailsByUsername(@PathVariable String username)
	     {
	    	   return userDetailsService.getUSerDetailsByUsername(username);
	     }
	     
	     @GetMapping(value="/emailid/{emailId}",produces="application/json")
	     public UserDetails getUserDetailsByEmailId(@PathVariable String emailId)
	     {
	    	   return userDetailsService.getUSerDetailsByEmailId(emailId);
	     }
	     
	     @GetMapping(value="/mobileno/{mobileNo}",produces="application/json")
	     public UserDetails getUserDetailsByMobileNo(@PathVariable long mobileNo)
	     {
	    	   return userDetailsService.getUSerDetailsByMobileNo(mobileNo);
	     }	     
	}

