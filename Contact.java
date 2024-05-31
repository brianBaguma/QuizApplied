package model;
import java.util.ArrayList;
import java.util.List;
public class Contact {
    private String firstName;
        private String lastName;
        private String company;
        private String jobTitle;
        private List<Phone_Number> phone_Numbers;
        private List<Email_Address> email_Addresses;

        public Contact(String firstName, String lastName, String company, String jobTitle) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.company = company;
            this.jobTitle = jobTitle;
            this.phone_Numbers = new ArrayList<>();
            this.email_Addresses = new ArrayList<>();
        }

        public void addPhoneNumber(Phone_Number phoneNumber) {
            phone_Numbers.add(phoneNumber);
        }

        public void removePhoneNumber(  Phone_Number phoneNumber) {
            phone_Numbers.remove(phoneNumber);
        }

        public void addEmailAddress(Email_Address emailAddress) {
            email_Addresses.add(emailAddress);
        }

        public void removeEmailAddress(Email_Address Email_Address) {
            emailAddresses.remove(Email_Address);
        }

        public void updateContactDetails(String firstName, String lastName, String company, String jobTitle) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.company = company;
            this.jobTitle = jobTitle;
        }

        public void mergeWith(Contact contact) {
            // Merging logic based on business rules
        }

        // Getters and setters omitted for brevity
    }


