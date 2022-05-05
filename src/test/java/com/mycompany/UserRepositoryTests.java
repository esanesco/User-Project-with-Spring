package com.mycompany;

import com.mycompany.bo.User;
import com.mycompany.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTests {
    @Autowired private UserRepository repo;

    @Test
    public void testAddNew(){
        User user = new User();
        user.setEmail("maria@email.com");
        user.setPassword("password3");
        user.setFirstName("maria");
        user.setLastName("del carmen");

        User savedUser = repo.save(user);
        Assertions.assertNotNull(savedUser);
        Assertions.assertTrue(savedUser.getId()>0);
    }

    @Test
    public void testListAll(){
        Iterable<User> users = repo.findAll();
        Assertions.assertNotNull(users);

        for (User user : users)
        {
            System.out.println(user);
        }
    }

    @Test
    public void testUpdate(){
        int userId = 1;
        Optional<User> optionalUser = repo.findById(userId);
        User user = optionalUser.get();
        user.setPassword("newpassword");
        repo.save(user);

        User updatedUser = repo.findById(userId).get();
        Assertions.assertTrue(updatedUser.getPassword().equals("newpassword"));
    }

    @Test
    public void testGet(){
        int userId =2;
        Optional<User> optionalUser = repo.findById(userId);
        Assertions.assertTrue(optionalUser.isPresent());
        System.out.println(optionalUser.get());
    }

//    @Test
//    public void testDelete(){
//        int userId = 2;
//        repo.deleteById(userId);
//        Optional<User> optionalUser = repo.findById(userId);
//        Assertions.assertFalse(optionalUser.isPresent());

//    }

}
