import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat instance Admin yang akan mengelola permohonan
        Admin admin = new Admin();
        
        // Membuat instance Citizen yang akan mengajukan permohonan
        Citizen citizen = new Citizen(admin); // Pass Admin instance ke Citizen

        while (true) {
            System.out.println("\n*** Sistem Pengajuan Permohonan Surat ***");
            System.out.println("1. Pengajuan Permohonan Surat");
            System.out.println("2. Pemeriksaan Status Permohonan");
            System.out.println("3. Login sebagai Admin");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1: // Pengajuan Permohonan Surat
                    System.out.print("Masukkan ID Permohonan: ");
                    String applicationID = scanner.nextLine();
                    System.out.print("Masukkan Jenis Surat: ");
                    String documentType = scanner.nextLine();
                    System.out.print("Masukkan Alasan Permohonan: ");
                    String reason = scanner.nextLine();

                    citizen.submitApplication(applicationID, documentType, reason);
                    break;

                case 2: // Pemeriksaan Status Permohonan
                    System.out.print("Masukkan ID Permohonan untuk memeriksa status: ");
                    String checkApplicationID = scanner.nextLine();
                    citizen.checkStatus(checkApplicationID);
                    break;

                case 3: // Login sebagai Admin
                    System.out.println("Login sebagai Admin");
                    System.out.print("Masukkan ID Permohonan yang ingin dilihat: ");
                    String adminApplicationID = scanner.nextLine();
                    admin.processApplication(adminApplicationID);
                    break;

                case 4: // Keluar
                    System.out.println("Terima kasih telah menggunakan sistem!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
