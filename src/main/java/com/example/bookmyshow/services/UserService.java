package com.example.bookmyshow.services;

import com.example.bookmyshow.dao.UserDao;
import com.example.bookmyshow.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Service
public class UserService extends BaseService<User>{
    @Autowired
    UserDao userDao;
}
