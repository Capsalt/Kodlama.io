package Kahve;

import java.time.format.DateTimeFormatter;

public class Customer implements Entity {

    public int id;
    public String firstName;
    public String lastName;
    public int dateOfBirth;
    public String tcNo;

    public Customer(int id, String firstName, String lastName, int dateOfBirth, String tcNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tcNo = tcNo;
    }

}
