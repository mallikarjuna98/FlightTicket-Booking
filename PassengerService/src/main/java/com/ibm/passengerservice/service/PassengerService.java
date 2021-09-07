package com.ibm.passengerservice.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ibm.passengerservice.entity.Passenger;
import com.ibm.passengerservice.repo.PassengerRepository;

@Service
public class PassengerService 
{
	@Autowired
	PassengerRepository passengerRepository;
	
	@Transactional(readOnly=true)
	public Passenger getPassengersBySsn(String ssn)
	{
		Optional<Passenger> p=passengerRepository.findById(ssn);
		if(p.isPresent()) 
			return p.get();
		return null;
	}
	
	@Transactional(readOnly=true)
	public List<Passenger> getPassengers()
	{
		return passengerRepository.findAll();
	}
	
	@Transactional
	public boolean insertPassenger(Passenger passenger){
		Passenger p=passengerRepository.save(passenger);
		if(p!=null) 
			return true;
		throw new RuntimeException("Passengers Insertion Failed");
	}
	
	@Transactional
	public boolean modifyPassenger(Passenger passenger)
	{
		Passenger p= passengerRepository.save(passenger);
		if(p!=null) 
			return true;
		throw new RuntimeException("Passengers modification Failed");
	}
	
	@Transactional
	public void deletePassengerBySsn(String ssn)
	{
		 passengerRepository.deleteById(ssn);
	}
}

	