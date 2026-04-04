package LR7;

import java.io.Serializable;

public class Patient implements Serializable {
    private int id;
    private String lastName, firstName, middleName, address, phone, diagnosis;
    private int medicalCardNumber;

    public Patient(int id, String lastName, String firstName, String middleName, 
                   String address, String phone, int medicalCardNumber, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    public int getId() { return id; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getAddresss() { return address; }
    public String getPhone() { return phone; }
    public String getDiagnosis() { return diagnosis; }
    public int getMedicalCardNumber() { return medicalCardNumber; }

    @Override
    public String toString() {
        return String.format("ID: %d | %s %s. | Карта: %d | Діагноз: %s", 
                id, lastName, firstName.charAt(0), medicalCardNumber, diagnosis);
    }
}