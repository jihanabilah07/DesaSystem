import java.util.ArrayList;
import java.util.Scanner;

public class Admin implements UserActions, ApplicationHandler, AdminActions {
    private ArrayList<Application> applications = new ArrayList<>();

    // Menambahkan permohonan ke daftar
    public void addApplication(Application application) {
        applications.add(application);
    }

    // Mengambil permohonan berdasarkan ID
    @Override
    public Application getApplicationById(String applicationID) {
        for (Application application : applications) {
            if (application.getId().equals(applicationID)) {
                return application;
            }
        }
        return null;
    }

    // Implementasi dari UserActions (tidak berlaku untuk Admin)
    @Override
    public void submitApplication(String applicationID, String documentType, String reason) {
        // Admin tidak mengajukan permohonan
    }

    @Override
    public void checkStatus(String applicationID) {
        // Admin tidak memeriksa status permohonan
    }

    // Implementasi dari AdminActions
    @Override
    public void approveApplication(String applicationID) {
        Application application = getApplicationById(applicationID);
        if (application != null) {
            application.setStatus("Disetujui");
            System.out.println("Permohonan ID " + applicationID + " disetujui.");
        } else {
            System.out.println("Permohonan ID " + applicationID + " tidak ditemukan.");
        }
    }

    @Override
    public void rejectApplication(String applicationID, String reason) {
        Application application = getApplicationById(applicationID);
        if (application != null) {
            application.setStatus("Ditolak");
            System.out.println("Permohonan ID " + applicationID + " ditolak karena: " + reason);
        } else {
            System.out.println("Permohonan ID " + applicationID + " tidak ditemukan.");
        }
    }

    // Method untuk proses manual via input (dapat digunakan dalam menu admin)
    public void processApplication(String applicationID) {
        Application application = getApplicationById(applicationID);
        if (application != null) {
            System.out.println("Memproses Permohonan ID: " + applicationID);
            System.out.println("Jenis Surat: " + application.getDocumentType());
            System.out.println("Alasan: " + application.getReason());
            System.out.print("Apakah permohonan diterima (y/n)? ");
            Scanner scanner = new Scanner(System.in);
            String decision = scanner.nextLine();
            if (decision.equalsIgnoreCase("y")) {
                approveApplication(applicationID);
            } else {
                System.out.print("Masukkan alasan penolakan: ");
                String reason = scanner.nextLine();
                rejectApplication(applicationID, reason);
            }
        } else {
            System.out.println("Permohonan ID " + applicationID + " tidak ditemukan.");
        }
    }
}
