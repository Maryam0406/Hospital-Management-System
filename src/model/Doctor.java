package model;

public class Doctor extends Person {
    private int doctorId;
    private String specialization;

    public Doctor(String name, int age, String phoneNumber, int doctorId, String specialization) {
        super(name, age, phoneNumber);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor ID: " + doctorId +
                "Name: " + getName() +
                "Age: " + getAge() +
                "Phone: " + getPhoneNumber() +
                "Specialization: " + specialization;
    }
}
