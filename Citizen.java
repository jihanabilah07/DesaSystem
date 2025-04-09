import java.util.Scanner;

public class Citizen implements UserActions {
    private ApplicationHandler handler;

    public Citizen(ApplicationHandler handler) {
        this.handler = handler;
    }

    @Override
    public void submitApplication(String applicationID, String documentType, String reason) {
        Application application = new Application(applicationID, documentType, reason);
        handler.addApplication(application);
        System.out.println("Permohonan surat telah diajukan dengan ID: " + applicationID);
    }

    @Override
    public void checkStatus(String applicationID) {
        Application application = handler.getApplicationById(applicationID);
        if (application != null) {
            System.out.println("Status Permohonan ID " + applicationID + ": " + application.getStatus());
        } else {
            System.out.println("Permohonan dengan ID " + applicationID + " tidak ditemukan.");
        }
    }
}
