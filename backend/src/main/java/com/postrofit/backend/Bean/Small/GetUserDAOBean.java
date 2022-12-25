package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.UserDAO;
import com.postrofit.backend.Repository.UserDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetUserDAOBean {
    @Autowired
    UserDAORepository userDAORepository;
    public UserDAO exec(long userId) {
        Optional<UserDAO> userDAO = userDAORepository.findById(userId);

        return userDAO.orElse(null);
    }
}
