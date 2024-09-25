package com.OPD.PathologyManagementSystem.HMS.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "AppointmentData")  // Collection in MongoDB
public class Appointment {

    @Id
    private String id;  // MongoDB document ID
    
    private String doctors;
    private String specialization;
    private DayTimeSlot dayTimeSlot;

    // Constructors
    public Appointment() {}

    public Appointment(String doctors, String specialization, DayTimeSlot dayTimeSlot) {
        this.doctors = doctors;
        this.specialization = specialization;
        this.dayTimeSlot = dayTimeSlot;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDoctors() {
        return doctors;
    }

    public void setDoctors(String doctors) {
        this.doctors = doctors;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public DayTimeSlot getDayTimeSlot() {
        return dayTimeSlot;
    }

    public void setDayTimeSlot(DayTimeSlot dayTimeSlot) {
        this.dayTimeSlot = dayTimeSlot;
    }
}

class DayTimeSlot {
    private List<String> day;
    private String timeSlot;

    // Constructors
    public DayTimeSlot() {}

    public DayTimeSlot(List<String> day, String timeSlot) {
        this.day = day;
        this.timeSlot = timeSlot;
    }

    // Getters and Setters
    public List<String> getDay() {
        return day;
    }

    public void setDay(List<String> day) {
        this.day = day;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
}
