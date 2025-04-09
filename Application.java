public class Application {
    private String id;
    private String documentType;
    private String reason;
    private String status;

    public Application(String id, String documentType, String reason) {
        this.id = id;
        this.documentType = documentType;
        this.reason = reason;
        this.status = "Sedang Diproses";  // Default status
    }

    public String getId() {
        return id;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
