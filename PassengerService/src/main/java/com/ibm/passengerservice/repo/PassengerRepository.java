package com.ibm.passengerservice.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.passengerservice.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, String> 
{
		
}