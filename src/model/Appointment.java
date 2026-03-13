package model;

import java.time.LocalDateTime;

public class Appointment {

    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime appointmentDateTime;
    private AppointmentStatus status;

    public Appointment(int appointmentId, Patient patient, Doctor doctor, LocalDateTime appointmentDateTime) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDateTime = appointmentDateTime;
        this.status = AppointmentStatus.BOOKED;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void cancelAppointment() {
        status = AppointmentStatus.CANCELLED;
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId +
                ", Patient: " + patient.getName() +
                ", Doctor: " + doctor.getName() +
                ", Date & Time: " + appointmentDateTime +
                ", Status: " + status;
    }
}