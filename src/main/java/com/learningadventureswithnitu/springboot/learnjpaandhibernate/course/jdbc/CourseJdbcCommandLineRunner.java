package com.learningadventureswithnitu.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learningadventureswithnitu.springboot.learnjpaandhibernate.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1, "Learn Python", "learningadventureswithnitu"));
        courseJdbcRepository.insert(new Course(2, "Learn Java", "learningadventureswithnitu"));
        courseJdbcRepository.insert(new Course(3, "Learn C++", "learningadventureswithnitu"));
        
        courseJdbcRepository.deleteById(2);

        System.out.println(courseJdbcRepository.findById(1));
    }
}
