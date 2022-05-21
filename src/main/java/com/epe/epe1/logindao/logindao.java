
package com.epe.epe1.logindao;

import com.epe.epe1.loginentity.user;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface logindao extends CrudRepository<user,Integer>{
    user findByUsername(String usermail); 
    user findByUsernameAndPassword(String usermail,String Password); 
}


