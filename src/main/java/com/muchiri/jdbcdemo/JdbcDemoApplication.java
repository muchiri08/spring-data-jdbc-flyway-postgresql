package com.muchiri.jdbcdemo;

import com.muchiri.jdbcdemo.dao.PersonDao;
import com.muchiri.jdbcdemo.dao.TaskDao;
import com.muchiri.jdbcdemo.domain.Person;
import com.muchiri.jdbcdemo.domain.Task;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class JdbcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdbcDemoApplication.class, args);
    }

    @Bean
    ApplicationRunner runner(PersonDao personDao, TaskDao taskDao) {
        return args -> {
            var person = new Person();
            person.setPersonId(null);
            person.setFirstName("Kennedy");
            person.setLastName("Mbogo");
            person.setEmail("example@email.com");
            //person.setTasks(List.of(new Task(null, "Task A", person.getPersonId()), new Task(null, "Task B", person.getPersonId())));

            var p = personDao.save(person);
            var taskA = new Task(null, "Task-A", p.getPersonId());
            var taskB = new Task(null, "Task-B", p.getPersonId());
            taskDao.save(taskA);
            taskDao.save(taskB);


            System.out.println(p);
            System.out.println(taskA);
            System.out.println(taskB);
            personDao.findAll().forEach(System.out::println);
        };
    }
}
