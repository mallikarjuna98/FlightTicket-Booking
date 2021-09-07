package com.ibm.flightscheduleservice.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.flightscheduleservice.entity.FlightSchedule;

public interface FlightScheduleRepository extends JpaRepository<FlightSchedule,String>
{
	List<FlightSchedule> findBySourceAndDestination(String source, String destination);
}
