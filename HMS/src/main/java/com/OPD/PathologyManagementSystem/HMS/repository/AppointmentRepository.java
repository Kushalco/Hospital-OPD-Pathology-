package com.OPD.PathologyManagementSystem.HMS.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.OPD.PathologyManagementSystem.HMS.model.Appointment;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String> {
    // Custom query method to find an appointment by the doctor's name
    Appointment findByDoctors(String doctors);
}
