interface DataExporter {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("📄 Exporting data to JSON format (default implementation).");
    }
}

class ReportModule implements DataExporter {
    public void exportToCSV() {
        System.out.println("📄 Exporting data to CSV format.");
    }

    public void exportToPDF() {
        System.out.println("📄 Exporting data to PDF format.");
    }
}

public class DataExportFeature {
    public static void main(String[] args) {
        DataExporter report = new ReportModule();

        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON();
    }
}
