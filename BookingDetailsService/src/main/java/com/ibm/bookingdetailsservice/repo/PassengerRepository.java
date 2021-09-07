package com.ibm.bookingdetailsservice.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.bookingdetailsservice.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,String>
{
	
}
