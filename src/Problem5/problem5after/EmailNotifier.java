package Problem5.problem5after;

public class EmailNotifier implements Notifier {
    private String email;
    public EmailNotifier(String email){
        this.email = email;
    }
    public void notify(String email,String message){
        System.out.println("[Email to "+email+" ]" + message);
    }
}
