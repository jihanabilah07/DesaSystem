public interface UserActions {
    void submitApplication(String applicationID, String documentType, String reason);
    void checkStatus(String applicationID);
}
