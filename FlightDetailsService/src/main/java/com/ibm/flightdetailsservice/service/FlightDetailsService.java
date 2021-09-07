package com.ibm.flightdetailsservice.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.flightdetailsservice.entity.FlightDetails;
import com.ibm.flightdetailsservice.repo.FlightDetailsRepository;

@Service
public class FlightDetailsService 
{
	@Autowired
	FlightDetailsRepository flightdetailsrepository;
	public List<FlightDetails> getFlightDetailsBycompanyName(String companyName)
	{
		return flightdetailsrepository.findBycompanyName(companyName);
	}
	
}
