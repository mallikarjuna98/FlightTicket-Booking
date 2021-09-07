package com.ibm.flightscheduleservice.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.flightscheduleservice.entity.FlightSchedule;
import com.ibm.flightscheduleservice.repo.FlightScheduleRepository;

@Service
public class FlightScheduleService 
{
	@Autowired
	FlightScheduleRepository flightschedulerepository;
	public List<FlightSchedule> getFlightScheduleBySourceAndDestination(String source,String destination)
	{
		return flightschedulerepository.findBySourceAndDestination(source,destination);	
	}
}