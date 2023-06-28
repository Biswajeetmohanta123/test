package com.geekster.User.Management.System.repository;

import com.geekster.User.Management.System.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    List<User> userList=new ArrayList<>();
    public boolean add(User user) {
    userList.add(user);
    return true;
    }

    public List<User> getAlluserInfo() {
        return this.userList;
    }

    public boolean updateUserById(String userId, User user) {
        for(User userObj:userList){
            if(userObj.getUserId().equals(userId)){
                userObj.setUserName(user.getUserName());
                userObj.setDateOfBirth(user.getDateOfBirth());
                userObj.setEmail(user.getEmail());
                userObj.setPhoneNumber(user.getPhoneNumber());
                userObj.setDate(user.getDate());
                userObj.setTime(user.getTime());
                return true;
            }
        }
        return false;
    }

    public boolean remove(User curUser) {
        userList.remove(curUser);
        return true;
    }
}
