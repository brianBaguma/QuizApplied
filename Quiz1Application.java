package com.example.quiz1;
import com.example.model.Contact;
import com.example.model.EmailAddress;
import com.example.model.PhoneNumber;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Contact;
import model.Email_Address;
import model.Phone_Number;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Quiz1Application {


        public static void main(String[] args) {
            List<Contact> contacts = new ArrayList<>();

            // Sample data
            Contact contact1 = new Contact("John", "Doe", "Company A", "Developer");
            contact1.addPhoneNumber(new Phone_Number("123-456-7890", "Home"));
            contact1.addEmailAddress(new Email_Address("john.doe@example.com", "Work"));

            Contact contact2 = new Contact("Jane", "Smith", "Company B", "Manager");
            contact2.addPhoneNumber(new Phone_Number("987-654-3210", "Mobile"));
            contact2.addEmailAddress(new Email_Address("jane.smith@example.com", "Personal"));

            Contact contact3 = new Contact("Alice", "Johnson", "Company C", "Analyst");
            contact3.addPhoneNumber(new Phone_Number("555-555-5555", "Work"));
            contact3.addEmailAddress(new Email_Address("alice.johnson@example.com", "Work"));

            contacts.add(contact1);
            contacts.add(contact2);
            contacts.add(contact3);

            // Sort contacts by last name
//            Collections.sort(contacts);

            // Print contacts in JSON format
            ObjectMapper objectMapper = new ObjectMapper();
            for (Contact contact : contacts) {
                try {
                    String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(contact);
                    System.out.println(json);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }




}