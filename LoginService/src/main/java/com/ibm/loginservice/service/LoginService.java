package com.ibm.loginservice.service;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.loginservice.repo.LoginRepository;

@Service
public class LoginService 
{
    @Autowired
    LoginRepository loginRepository;
    
    @Transactional(readOnly=true)
    public boolean authenticateUser(String username,String password)
    {
    	return loginRepository.getUserByUsernameAndPassword(username, password)==1 ? true : false;
    }
}