package com.ibm.userdetailsservice.service;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.userdetailsservice.entity.UserDetails;
import com.ibm.userdetailsservice.repo.UserDetailsRepository;

@Service
public class UserDetailsService 
{
	    @Autowired
	    UserDetailsRepository userDetailsRepository;
	    
	    @Transactional
	    public boolean insertUserDetails(UserDetails userDetails)
	    {
	    	return userDetailsRepository.save(userDetails)!=null ? true : false;
	    }
	    
	    @Transactional
	    public boolean modifyUserDetails(UserDetails userDetails)
	    {
	    	return userDetailsRepository.save(userDetails)!=null ? true : false;
	    }
	    
	    @Transactional(readOnly=true)
	    public UserDetails getUSerDetailsByUsername(String username)
	    {
	    	Optional<UserDetails> userDetails = userDetailsRepository.findById(username);
	    	if(userDetails.isPresent()) return userDetails.get();
	    	return null;
	    }
	    
	    @Transactional(readOnly=true)
	    public UserDetails getUSerDetailsByEmailId(String emailId)
	    {
	    	Optional<UserDetails> userDetails = userDetailsRepository.findByEmailId(emailId);
	    	if(userDetails.isPresent()) return userDetails.get();
	    	return null;
	    }
	    
	    @Transactional(readOnly=true)
	    public UserDetails getUSerDetailsByMobileNo(long mobileNo)
	    {
	    	Optional<UserDetails> userDetails = userDetailsRepository.findByMobileNo(mobileNo);
	    	if(userDetails.isPresent()) return userDetails.get();
	    	return null;
	    }
}
