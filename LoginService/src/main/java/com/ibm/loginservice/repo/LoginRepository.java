package com.ibm.loginservice.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.ibm.loginservice.entity.Login;

public interface LoginRepository extends JpaRepository<Login,String>
{
    @Query("select count(*) from Login where username=:username  and password=:password")
    public int getUserByUsernameAndPassword(@Param("username") String username,@Param("password") String password);
}