package com.fym.lta.bao;

import com.fym.lta.common.LTAException;
import com.fym.lta.dto.UserDto;

import java.util.List;

public interface UserBao {

    /**
     * insert new User if it doesn't exists
     * otherwise it updates the exis. once
     * if flag true operation will done on a staff member
     */
    public boolean saveUser(UserDto user)throws LTAException ;

    /**
     * Search for  Users . this return a list of users .
     */
    public List<UserDto> seachForUsers (String userName);
    
    /**
     *  this return a list of users .
     */
    public List<UserDto> listAll();

    /**
     * delete a User using id
     */
    public boolean deleteUser(String userName);
    
   
    // this method to check if the username logged is  right exist
    public boolean isExists(String username );
    
    // method to check if the entered user and pass is correct
    public  boolean checkLogin(String username , String password) ;
    
    public String  getCurrentUserEmail(String username); 
    
}
