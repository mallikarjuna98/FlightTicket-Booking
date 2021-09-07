package com.ibm.bookingdetailsservice.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.bookingdetailsservice.entity.FlightSchedule;

public interface FlightScheduleRepository extends JpaRepository<FlightSchedule,String>
{

}
