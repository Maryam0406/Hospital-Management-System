package model;

public class Patient extends Person{
    private int patientId;
    private String medicalHistory;

    public Patient(String name, int age, String phoneNumber, String medicalHistory, int id) {
        super(name, age, phoneNumber);
        this.medicalHistory = medicalHistory;
        this.patientId = id;
    }

    public int getId() {
        return patientId;
    }

    public void setId(int id) {
        this.patientId = id;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId +
               "Name: " + getName() +
               "Age: " + getAge() +
               "Phone: " + getPhoneNumber() +
               "Medical History: " + getMedicalHistory();
    }
}
