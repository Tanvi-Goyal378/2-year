import java.util.ArrayList;
import java.util.List;

// Abstract class Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis; // sensitive data

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age > 0) this.age = age;
    }

    // Encapsulate diagnosis with getter/setter (can be made protected if required)
    protected String getDiagnosis() { return diagnosis; }
    protected void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

// Interface MedicalRecord
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private List<String> medicalHistory;

    public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyRate) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted >= 0 ? daysAdmitted : 0;
        this.dailyRate = dailyRate >= 0 ? dailyRate : 0;
        this.medicalHistory = new ArrayList<>();
    }

    public int getDaysAdmitted() { return daysAdmitted; }
    public void setDaysAdmitted(int daysAdmitted) {
        if (daysAdmitted >= 0) this.daysAdmitted = daysAdmitted;
    }

    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double dailyRate) {
        if (dailyRate >= 0) this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for InPatient " + getName() + ":");
        if (medicalHistory.isEmpty()) {
            System.out.println("No records available.");
            return;
        }
        for (String rec : medicalHistory) {
            System.out.println("- " + rec);
        }
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalHistory;

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee >= 0 ? consultationFee : 0;
        this.medicalHistory = new ArrayList<>();
    }

    public double getConsultationFee() { return consultationFee; }
    public void setConsultationFee(double consultationFee) {
        if (consultationFee >= 0) this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for OutPatient " + getName() + ":");
        if (medicalHistory.isEmpty()) {
            System.out.println("No records available.");
            return;
        }
        for (String rec : medicalHistory) {
            System.out.println("- " + rec);
        }
    }
}

// Main class to demonstrate polymorphism
public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient("P001", "Alice", 45, "Pneumonia", 5, 3000),
            new OutPatient("P002", "Bob", 30, "Flu", 500)
        };

        // Add medical records
        ((MedicalRecord)patients[0]).addRecord("Chest X-ray normal");
        ((MedicalRecord)patients[0]).addRecord("Antibiotics prescribed");
        ((MedicalRecord)patients[1]).addRecord("Prescribed flu medicine");

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Diagnosis: " + p.getDiagnosis());
            System.out.println("Bill Amount: ₹" + p.calculateBill());
            ((MedicalRecord)p).viewRecords();
            System.out.println("-------------------------");
        }
    }
}
