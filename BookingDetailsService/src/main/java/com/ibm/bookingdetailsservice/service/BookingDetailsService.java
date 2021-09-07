package com.ibm.bookingdetailsservice.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ibm.bookingdetailsservice.entity.BookingDetails;
import com.ibm.bookingdetailsservice.repo.BookingDetailsRepository;


@Service
public class BookingDetailsService 
{
	@Autowired
	BookingDetailsRepository bookingDetailsRepository;
	
	@Transactional(readOnly=true)
	public BookingDetails getBookingDetailsByPnrAndUserName(String pnr,String userName)
	{
		Optional<BookingDetails> b = bookingDetailsRepository.findByPnrAndUserName(pnr,userName);
		if(b.isPresent())
			return b.get();
		return null;
	}
	
	@Transactional(readOnly=true)
	public List<BookingDetails> getBookingDetailsByUserName(String userName)
	{
		return bookingDetailsRepository.findByUserName(userName);
	}
	
//	@Transactional
//	public boolean insertBookingDetails(BookingDetails bookingDetails) 
//	{
//		BookingDetails b = bookingDetailsRepository.save(bookingDetails);
//		return b!=null;
//	}	
	
	@Transactional
	public boolean insertBookingDetails(BookingDetails bookingDetails)
	{
		System.out.println("Service");
		BookingDetails b = bookingDetailsRepository.save(bookingDetails);
		return b!=null;
	}
}
