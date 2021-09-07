package com.ibm.flightdetailsservice.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.flightdetailsservice.entity.FlightDetails;


public interface FlightDetailsRepository extends JpaRepository<FlightDetails,String>
{
		List<FlightDetails> findBycompanyName(String companyName);
}
