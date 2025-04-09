// AdminActions.java (interface yang disediakan)
interface AdminActions {
    void approveApplication(String applicationID);
    void rejectApplication(String applicationID, String reason);
}
