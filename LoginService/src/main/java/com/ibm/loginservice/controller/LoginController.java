package com.ibm.loginservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.loginservice.service.LoginService;

@RestController
public class LoginController 
{
	@Autowired
	LoginService loginService;
    
    @GetMapping("/username/{username}/password/{password}")
    public HttpStatus authenticateUser(@PathVariable String username,@PathVariable String password)
    {
   	 if(loginService.authenticateUser(username, password))
   		 return HttpStatus.OK;
   	 return HttpStatus.NOT_FOUND;
    }
}
