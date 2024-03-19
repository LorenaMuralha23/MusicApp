package com.kingcode.demo.config;

import com.kingcode.demo.entities.ListenerUser;
import com.kingcode.demo.repositories.ListenerUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ListenerUserRepository listenerUserRepository;


    @Override
    public void run(String... args) throws Exception {
        ListenerUser user1 = new ListenerUser(null, "Barney Stinson", "barney@example.com", "password1");
        ListenerUser user2 = new ListenerUser(null, "Michael Scofield", "michael@example.com", "password2");
        ListenerUser user3 = new ListenerUser(null, "Charlie Harper", "charlie@example.com", "password3");

        listenerUserRepository.saveAll(Arrays.asList(user1, user2, user2));

    }
}
