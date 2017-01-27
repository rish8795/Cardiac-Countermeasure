package model;


import java.util.ArrayList;
import model.LabAppointment;
import model.PatienttestDetail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rishabh
 */
public class AppointmentTestModel {
 
    private LabAppointment labappointment;
    private ArrayList<PatienttestDetail> patientdetails;

    public LabAppointment getLabappointment() {
        return labappointment;
    }

    public void setLabappointment(LabAppointment labappointment) {
        this.labappointment = labappointment;
    }

    public ArrayList<PatienttestDetail> getPatientdetails() {
        return patientdetails;
    }

    public void setPatientdetails(ArrayList<PatienttestDetail> patientdetails) {
        this.patientdetails = patientdetails;
    }
    
    
}
