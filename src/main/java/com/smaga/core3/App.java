package com.smaga.core3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import java.io.IOException;
import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Person person = (Person) context.getBean("person");
        System.out.println(person);

        AddressBook addressBook = (AddressBook) context.getBean("addressBook");
        System.out.println(addressBook);

        Environment environment = context.getEnvironment();
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        DatabaseConnector connector = (DatabaseConnector) context.getBean("databaseConnector");
        System.out.println(connector.databaseUrl);
    }
}
