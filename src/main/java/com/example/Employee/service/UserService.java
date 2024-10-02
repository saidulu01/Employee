package com.example.Employee.service;

import com.example.Employee.model.MyUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<MyUser> myUserList=new ArrayList<>();
    public UserService(){
        myUserList.add(new MyUser(1,"username1","password1"));
        myUserList.add(new MyUser(2,"username2","password2"));
        myUserList.add(new MyUser(3,"username3","password3"));
    }
    public List<MyUser> getUsers() {
        return myUserList;
    }
}
