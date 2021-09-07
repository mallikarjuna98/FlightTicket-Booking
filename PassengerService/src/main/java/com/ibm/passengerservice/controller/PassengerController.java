package com.ibm.passengerservice.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.passengerservice.entity.Passenger;
import com.ibm.passengerservice.service.PassengerService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
public class PassengerController {

	@Autowired
	PassengerService passengerService;
	
	@GetMapping(produces="application/json")
	public ResponseEntity<List<Passenger>> getPassenger()
	{
		return new ResponseEntity<List<Passenger>>(passengerService.getPassengers(),HttpStatus.OK);
	}
	
    @GetMapping (value="/{ssn}", produces="application/json") 
	public ResponseEntity<Passenger> getPassengerBySsn(@PathVariable String ssn)
	{
    	Passenger p=passengerService.getPassengersBySsn(ssn);
    	if(p!=null) 
    		return new ResponseEntity<Passenger>(p,HttpStatus.OK);
    	return new ResponseEntity<Passenger>(p,HttpStatus.NOT_FOUND);
	}	
    @PostMapping(consumes="application/json")
	private HttpStatus modifyPassengersDetails(@RequestBody Passenger passenger)
	{
    	try
    	{
    		passengerService.modifyPassenger(passenger);
    		return HttpStatus.OK;
    	}
    	catch(Exception ex)
    	{
    		System.out.println(ex.getMessage());
    	}
    	return HttpStatus.NOT_MODIFIED;
    		
    	}
    @PutMapping(consumes="application/json")
    public HttpStatus addPassengersDetails(@RequestBody Passenger passenger)
	{
    	try {
    		passengerService.insertPassenger(passenger);
    		return HttpStatus.OK;
    	}
    	catch(Exception ex)
    	{
    		System.out.println(ex.getMessage());
    	}
    	return HttpStatus.NOT_MODIFIED;
    	}
    
	@DeleteMapping(value="/{ssn}")
	public HttpStatus deletePassengerBySsn(@PathVariable String ssn)
	{
		
		passengerService.deletePassengerBySsn(ssn);
		return HttpStatus.OK;
	}
}