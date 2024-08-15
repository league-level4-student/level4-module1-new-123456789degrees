package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	public void addPatient(Patient p) {
		patients.add(p);
	}
	public ArrayList<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}
	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}
	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		for (int i = 0; i < patients.size(); i++) {
			for (int j = 0; j < doctors.size(); j++) {
				if (doctors.get(j).getPatients().size() == 3) {
					continue;
				}
				else {
					try {
						doctors.get(j).assignPatient(patients.get(i));
					} catch (DoctorFullException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
			}
		}
	}
	
}
