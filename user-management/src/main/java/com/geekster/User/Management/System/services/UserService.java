package com.geekster.User.Management.System.services;

import com.geekster.User.Management.System.models.User;
import com.geekster.User.Management.System.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public String saveUser(User user) {
    return userDao.add(user)?"user added successfully":"an error occured while adding";
    }

    public User getUserDetails(String userid) {
    List<User> curUser=getallDetails();
    for(User userDetails:curUser)
        if(userDetails.getUserId().equals(userid)){
            return userDetails;
        }
        System.out.println("no result found with is id");
        return null;
    }

    public List<User> getallDetails() {
        return userDao.getAlluserInfo();
    }


    public String updateById(String userId,User user) {
        boolean updateStatus = userDao.updateUserById(userId,user);

        if (updateStatus) {
            return "User: " + userId + " was updated!!!";
        } else {
            return "User: " + userId + " does not exist!!!";
        }
    }

    public String delete(String userId) {
        List<User>userList=getallDetails();
        for (User curUser:userList){
            if(curUser.getUserId().equals(userId)){
                boolean status = userDao.remove(curUser);
                if(status){
                    return "user removed successfully";
                }
            }
        }
        return "user not found";
    }
}
