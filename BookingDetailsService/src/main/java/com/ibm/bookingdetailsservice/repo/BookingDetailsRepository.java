package com.ibm.bookingdetailsservice.repo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.bookingdetailsservice.entity.BookingDetails;

public interface BookingDetailsRepository extends JpaRepository<BookingDetails,String>
{
	Optional<BookingDetails> findByPnrAndUserName(String pnr,String userName);
	List<BookingDetails> findByUserName(String userName);
	
}
