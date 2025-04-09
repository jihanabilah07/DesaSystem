public interface ApplicationHandler {
    void addApplication(Application application);
    Application getApplicationById(String applicationID);
    void processApplication(String applicationID);
}
