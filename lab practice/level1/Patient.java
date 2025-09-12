public class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(1, "John", 30, "Flu");
        Patient p2 = new Patient(2, "Emma", 25, "Infection");

        if (p1 instanceof Patient) {
            System.out.println("Patient ID: " + p1.patientID);
            System.out.println("Name: " + p1.name);
            System.out.println("Age: " + p1.age);
            System.out.println("Ailment: " + p1.ailment);
            System.out.println("Hospital: " + hospitalName);
        }

        if (p2 instanceof Patient) {
            System.out.println("Patient ID: " + p2.patientID);
            System.out.println("Name: " + p2.name);
            System.out.println("Age: " + p2.age);
            System.out.println("Ailment: " + p2.ailment);
            System.out.println("Hospital: " + hospitalName);
        }

        getTotalPatients();
    }
}
