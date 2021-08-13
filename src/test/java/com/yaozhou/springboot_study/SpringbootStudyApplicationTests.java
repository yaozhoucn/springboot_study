package com.yaozhou.springboot_study;

import com.yaozhou.springboot_study.pojo.Dog;
import com.yaozhou.springboot_study.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootStudyApplicationTests {
    @Autowired
    private Dog dog;
    @Autowired
    private Person person;
    @Test
    void contextLoads() {
    }
    @Test
    public void TestName(){
        System.out.println(person);
    }
}
