package Problem5.problem5after;



public class EnrollmentService { // high-level policy
    private final StudentRepository store;
    private final Notifier sender;
    public EnrollmentService(StudentRepository store , Notifier sender){
        this.store = store;
        this.sender = sender;
    }
    public void enroll(String cne, String name, String contactinfo) {
        if (cne == null || cne.isBlank()) throw new IllegalArgumentException("CNE is required");
        if (store.exists(cne)) {
            System.out.println("Already enrolled: " + cne);
            return;
        }
        store.save(cne, name, contactinfo);
        sender.notify(contactinfo, "Welcome " + name + ", you are enrolled.");

    }
}
