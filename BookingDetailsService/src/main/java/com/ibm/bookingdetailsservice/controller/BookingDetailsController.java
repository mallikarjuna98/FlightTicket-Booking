package com.ibm.bookingdetailsservice.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bookingdetailsservice.entity.BookingDetails;
import com.ibm.bookingdetailsservice.service.BookingDetailsService;

@CrossOrigin(origins={"http://localhost:4200"})
@RestController
public class BookingDetailsController 
{
	@Autowired
	BookingDetailsService bookingDetailsService;
	
	@GetMapping(value="/username/{userName}",produces="application/json")
	public ResponseEntity<List<BookingDetails>> getBookingDetailsByUserName(@PathVariable String userName)
	{
		return new ResponseEntity<List<BookingDetails>>(bookingDetailsService.getBookingDetailsByUserName(userName),HttpStatus.OK);
	}
	
	@GetMapping(value="/pnr/{pnr}/username/{userName}",produces="application/json")
	public ResponseEntity<BookingDetails> getBookingDetailsByPnrAndUserName(@PathVariable String pnr,@PathVariable String userName)
	{
		BookingDetails b = bookingDetailsService.getBookingDetailsByPnrAndUserName(pnr, userName);
		if(b!=null)
			return new ResponseEntity<BookingDetails>(b,HttpStatus.OK);
		return new ResponseEntity<BookingDetails>(b,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(consumes="application/json")
	public HttpStatus insertBookingDetails(@RequestBody BookingDetails bookingDetails)
	{
		if(bookingDetailsService.insertBookingDetails(bookingDetails))
			return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;
	}
}
