package com.cledilsondevcode.bankingapp.domain.service;


import com.cledilsondevcode.bankingapp.domain.model.User;
import com.cledilsondevcode.bankingapp.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;


public interface UserService {


    User findById(Long id);


    User create(User userToCreate);

}
