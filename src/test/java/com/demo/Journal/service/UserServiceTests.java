package com.demo.Journal.service;

import com.demo.Journal.entity.User;
import com.demo.Journal.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;


    @ParameterizedTest
    @ValueSource(strings = {
            "ram",
            "shyam"
    })
    @Disabled
    public void testFindByUserName(String name){
        assertNotNull(userRepository.findByUserName(name), "failed for : " + name);
    }




    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,2,4",
            "3,3,4"
    })
    public void test(int a, int b, int expected){
        assertEquals(expected, a+b);
    }

}
