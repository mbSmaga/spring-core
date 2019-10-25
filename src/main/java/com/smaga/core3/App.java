package com.smaga.core3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Person person = (Person) context.getBean("person");
        System.out.println(person);

        AddressBook addressBook = (AddressBook) context.getBean("addressBook");
        System.out.println(addressBook);
    }
}
