package com.ibm.userdetailsservice.repo;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.userdetailsservice.entity.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails,String>
{
	        Optional<UserDetails> findByEmailId(String emailId);
	        Optional<UserDetails> findByMobileNo(long mobileNo);

}
