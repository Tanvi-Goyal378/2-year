import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr. " + name + " is consulting patient " + patient.getName() + ".");
        } else {
            System.out.println("Dr. " + name + " has no consultation scheduled with patient " + patient.getName() + ".");
        }
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor docSmith = new Doctor("Smith");
        Doctor docJones = new Doctor("Jones");

        Patient patientAlice = new Patient("Alice");
        Patient patientBob = new Patient("Bob");

        hospital.addDoctor(docSmith);
        hospital.addDoctor(docJones);

        hospital.addPatient(patientAlice);
        hospital.addPatient(patientBob);

        docSmith.addPatient(patientAlice);
        docSmith.addPatient(patientBob);

        docJones.addPatient(patientAlice);

        // Consultations
        docSmith.consult(patientAlice); // valid consultation
        docSmith.consult(patientBob);   // valid consultation
        docJones.consult(patientBob);   // no consultation scheduled

        // Show Doctor's patients
        System.out.println("\nPatients of Dr. Smith:");
        for (Patient p : docSmith.getPatients()) {
            System.out.println("- " + p.getName());
        }

        // Show Patient's doctors
        System.out.println("\nDoctors consulted by Alice:");
        for (Doctor d : patientAlice.getDoctors()) {
            System.out.println("- Dr. " + d.getName());
        }
    }
}

