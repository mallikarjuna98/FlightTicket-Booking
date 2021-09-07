package com.ibm.flightscheduleservice.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.flightscheduleservice.entity.FlightSchedule;
import com.ibm.flightscheduleservice.service.FlightScheduleService;

@CrossOrigin(origins={"http://localhost:4200"})
@RestController
public class FlightScheduleController 
{
	@Autowired
	FlightScheduleService flightscheduleService;
	
	@GetMapping(value="/source/{source}/destination/{destination}",produces="application/json")
	public ResponseEntity<List<FlightSchedule>> getFlightBySourceAndDestination(@PathVariable String source,@PathVariable String destination)
	{
		return new ResponseEntity<List<FlightSchedule>>(flightscheduleService.getFlightScheduleBySourceAndDestination(source,destination),HttpStatus.OK);		
	}
}
