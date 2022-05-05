package com.mycompany.services;

import com.mycompany.bo.User;
import com.mycompany.exeptions.UserNotFoundException;
import com.mycompany.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired private UserRepository repo;

    public List<User> listAll(){
        return (List<User>) repo.findAll();
    }

    public void save(User user) {
        repo.save(user);
    }

    public User get(Integer id) throws UserNotFoundException {
       Optional<User> result =  repo.findById(id);
        if (result.isPresent()){
            return result.get();
        }else {
            throw new UserNotFoundException("coud not fine the user with id "+id);
        }

    }

    public void delete(User user) {
        repo.delete(user);
    }

    public void deleteById(int id) throws UserNotFoundException {
        Long count = repo.countById(id);
        if(count == null || count == 0)
        {
            throw new UserNotFoundException("could not find any users with id "+id);
        }
        repo.deleteById(id);
    }
}
