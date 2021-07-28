
package Project;

import java.util.ArrayList;


public class Doctor {
   private final String  doctorName;
 private final String  doctorSpeciality;
 String  doctorStatus;
 ArrayList<Patient> doctorPatientList= new ArrayList<>();
 Doctor(String c, String cc)
 {
     this.doctorName=c;
     this.doctorSpeciality=cc;
 
 }
 public String  getDoctorName()
 {
     return doctorName;
 }
 
 public ArrayList<Patient> getDoctorPatientList()
 {   
     return doctorPatientList;
 }
 
 public void addPatientsToDoctor(Patient o)
 {
     doctorPatientList.add(o);
 }
 public void clearPatientsToDoctor()
 {
     doctorPatientList.clear();
 }
 
 String getDoctorspeciality()
 {
     return doctorSpeciality;
 }
   @Override
 public String toString()
 {
     return (doctorName+""+doctorSpeciality);
 } 
    
}
