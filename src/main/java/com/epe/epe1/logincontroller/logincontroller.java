
package com.epe.epe1.logincontroller;

import com.epe.epe1.logindao.logindao;
import com.epe.epe1.loginentity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logincontroller {
   
    @Autowired
    private logindao UserDao;
    
    
    @GetMapping("/api/user/{id}")
    @ResponseBody
    public user usuario(@PathVariable Integer id){
        return(UserDao.findById(id).get());
    }
    
    @GetMapping("/api/user/username")
    @ResponseBody
    public user usuario(){
        return(UserDao.findByUsername("leo"));
    }
    
    @PostMapping("/api/user/login")
    @ResponseBody
    public user login(@RequestBody user u){
        return(UserDao.findByUsernameAndPassword(u.getUsername(),u.getPassword()));
    }
    
    @PostMapping("/api/user/add")
    public void newUser(@RequestBody user u){
        UserDao.save(u);
    }
    
    @PutMapping("/api/user/edit")
    public void editUser(@RequestBody user u){
        UserDao.save(u);
    }
    
    @DeleteMapping("/api/user/delete/{id}")
    public void deleteUser(@PathVariable Integer id){
        UserDao.deleteById(id);
    }

}